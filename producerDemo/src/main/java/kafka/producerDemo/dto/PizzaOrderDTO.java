package kafka.producerDemo.dto;

import jakarta.persistence.*;

@Entity
@Table(name="pizza_orders")
public class PizzaOrderDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String size;
    private String flavour;
    private String toppings;
    private int quantity;
    private String address;
    public PizzaOrderDTO() {
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PizzaOrderDTO{" +
                "id=" + id + "\n" +
                ", size='" + size + '\'' + "\n" +
                ", flavour='" + flavour + '\'' + "\n" +
                ", toppings='" + toppings + '\'' + "\n" +
                ", quantity=" + quantity + "\n" +
                ", address='" + address + '\'' + "\n" +
                '}';
    }
}
