package org.example.productorderexercise;

import org.example.productorderexercise.models.Order;
import org.example.productorderexercise.models.OrderLine;
import org.example.productorderexercise.models.Product;
import org.example.productorderexercise.repository.OrderLineRepository;
import org.example.productorderexercise.repository.OrderRepository;
import org.example.productorderexercise.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    private ProductRepository productRepository;
    private OrderLineRepository orderLineRepository;
    private OrderRepository orderRepository;


    public InitData(ProductRepository productRepository, OrderLineRepository orderLineRepository, OrderRepository orderRepository){
        this.productRepository = productRepository;
        this.orderLineRepository = orderLineRepository;
        this.orderRepository = orderRepository;
    }

    public void run(String... args){
        System.out.println("blop");



        Product toast = new Product("brød", "moist", 69.69, "32443534859080");
        productRepository.save(toast);
        Product tomato = new Product("tomat", "moist", 69.69, "2033284348239");
        productRepository.save(tomato);
        Product cucumber = new Product("agurk", "moist", 69.69, "132948329749");
        productRepository.save(cucumber);
        Product cheese = new Product("ost", "moist", 69.69, "223543242342");
        productRepository.save(cheese);
        Product milk = new Product("mælk", "moist", 69.69, "2342342341554");
        productRepository.save(milk);

        OrderLine line1 = new OrderLine();
        line1.setProduct(cucumber);
        line1.setQuantity(69);
//        orderLineRepository.save(line1);

        OrderLine line2 = new OrderLine(cheese, 69);
//        orderLineRepository.save(line2);
        OrderLine line3 = new OrderLine(cheese, 68);
//        orderLineRepository.save(line3);


        Order order = new Order(LocalDate.now() , true, List.of(line1,line2));
        orderRepository.save(order);

        Order order2 = new Order(LocalDate.now(), true, List.of(line3));
        orderRepository.save(order2);

    }
}
