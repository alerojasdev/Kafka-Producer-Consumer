package kafka.producerDemo.repository;

import kafka.producerDemo.dto.PizzaOrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PizzaRepository extends JpaRepository<PizzaOrderDTO, Integer> {
}
