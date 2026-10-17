package ma.enset.security.inventory_ervice;

import ma.enset.security.inventory_ervice.entities.Product;
import ma.enset.security.inventory_ervice.repositories.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryErviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryErviceApplication.class, args);
    }
    @Bean
        CommandLineRunner start(ProductRepo productRepo){
            return args -> {
                productRepo.save(Product.builder().name("Phone").price(17000.0).quantity(10).build());
                productRepo.save(Product.builder().name("Computer").price(12000.0).quantity(5).build());
                productRepo.save(Product.builder().name("Tablet").price(3000.0).quantity(15).build());

            };
        }
    }