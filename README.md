# Producer and Consumer

The producer demo is a Spring Boot app that persists in a PostgreSQL database.

To start Kafka, follow [these steps](https://chuidiang.org/index.php?title=Instalaci%C3%B3n_de_Apache_Kafka).

Have a topic created with the name "pizzaOrders."

Set up a simple console consumer.

The data entered into the form will be processed by the ProducerRecord class and sent to the Kafka topic "pizzaOrders."

The consumer subscribed to the Kafka topic "pizzaOrders" will be able to see the entered data in real-time.