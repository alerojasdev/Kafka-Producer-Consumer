package kafka.producerDemo.kafkaProducer;

import kafka.producerDemo.dto.PizzaOrderDTO;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.stereotype.Component;
import java.util.Properties;
@Component
public class ProducerPublisher {
    private static final String BOOTSTRAP_SERVER = "localhost:9092";
    private static final String TOPIC_NAME = "pizzaOrders";
    public ProducerPublisher() {}
    public void produce(PizzaOrderDTO pizzaOrderDTO) {

        Properties properties = new Properties();
        properties.put("bootstrap.servers", BOOTSTRAP_SERVER);
        properties.put("key.serializer", StringSerializer.class);
        properties.put("value.serializer", StringSerializer.class);

        try (Producer<String, String> producer = new KafkaProducer<>(properties)) {

            String serializedDTO = pizzaOrderDTO.toString();

            ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC_NAME, serializedDTO);

            producer.send(record);

            System.out.println("Pizza order sent successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
