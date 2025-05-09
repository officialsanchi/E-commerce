package BuyingOfGoodies.E_commerecApplication.model.repository;

import BuyingOfGoodies.E_commerecApplication.model.data.Order;
import BuyingOfGoodies.E_commerecApplication.model.data.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> findByUser(User user, Pageable pageable);
    Optional<Order> findByOrderNumber(String orderNumber);
//    Page<Order> findByStatus(Order.OrderStatus status, Pageable pageable);


    @Query("SELECT o FROM Order o WHERE o.createdAt BETWEEN ?1 AND ?2")
    List<Order> findOrdersInDateRange(LocalDateTime startDate, LocalDateTime endDate);
}

