package ma.enset.aarroub.wijdane.customer_service;

import ma.enset.aarroub.wijdane.customer_service.entities.Customer;
import ma.enset.aarroub.wijdane.customer_service.repository.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(CustomerRepo customerRepo) {
        return args -> {
            customerRepo.save(Customer.builder().name("Wijdane").email("wij@gmail.com").build());
            customerRepo.save(Customer.builder().name("Amine").email("amine@gmail.com").build());
            customerRepo.save(Customer.builder().name("Hanane").email("hanane@gmail.com").build());



        };

    }
}
