package BuyingOfGoodies.E_commerecApplication.model.repository;

import BuyingOfGoodies.E_commerecApplication.model.data.Cart;
import BuyingOfGoodies.E_commerecApplication.model.data.CartItem;
import BuyingOfGoodies.E_commerecApplication.model.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByCart(Cart cart);
    Optional<CartItem> findByCartAndProduct(Cart cart, Product product);
    void deleteByCart(Cart cart);
}