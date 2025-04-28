package BuyingOfGoodies.E_commerecApplication.repository;

import BuyingOfGoodies.E_commerecApplication.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface OrderRepo extends JpaRepository<Order, UUID> {
}
