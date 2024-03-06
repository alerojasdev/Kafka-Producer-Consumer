package kafka.producerDemo.controller;

import kafka.producerDemo.dto.PizzaOrderDTO;
import kafka.producerDemo.kafkaProducer.ProducerPublisher;
import kafka.producerDemo.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ProducerController {
    @Autowired
    PizzaRepository pizzaRepository;
    @Autowired
    ProducerPublisher producerPublisher;
    @GetMapping("/home")
    public String ShowOrder(Model model){
        model.addAttribute("pizzaForm",new PizzaOrderDTO());
        return "index";
    }
    @PostMapping(value ="/orderReceiver")
    public String orderReceiver(@ModelAttribute PizzaOrderDTO pizzaOrderDTO){

        //save in the database
//        pizzaRepository.save(pizzaOrderDTO);
//        pizzaRepository.flush();

        //pass to the producer
        producerPublisher = new ProducerPublisher();
        producerPublisher.produce(pizzaOrderDTO);

        return "order_delivered";
    }

}
