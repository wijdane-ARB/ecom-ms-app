package ma.enset.aarroub.wijdane.customer_service.repository;

import ma.enset.aarroub.wijdane.customer_service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
