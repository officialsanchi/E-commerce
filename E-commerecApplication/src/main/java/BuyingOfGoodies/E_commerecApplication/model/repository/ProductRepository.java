package BuyingOfGoodies.E_commerecApplication.model.repository;

import BuyingOfGoodies.E_commerecApplication.model.data.Category;
import BuyingOfGoodies.E_commerecApplication.model.data.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCategory(Category category, Pageable pageable);
    Page<Product> findByNameContaining(String name, Pageable pageable);
    List<Product> findByFeaturedTrue();

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
    Page<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE p.quantity > 0")
    Page<Product> findInStockProducts(Pageable pageable);
}
