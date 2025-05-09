package BuyingOfGoodies.E_commerecApplication.model.repository;

import BuyingOfGoodies.E_commerecApplication.model.data.Product;
import BuyingOfGoodies.E_commerecApplication.model.data.Review;
import BuyingOfGoodies.E_commerecApplication.model.data.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    Page<Review> findByProduct(Product product, Pageable pageable);
    Page<Review> findByUser(User user, Pageable pageable);
    Optional<Review> findByProductAndUser(Product product, User user);

    @Query("SELECT AVG(r.rating) FROM Review r WHERE r.product.id = ?1")
    Double findAverageRatingByProductId(Long productId);
}

