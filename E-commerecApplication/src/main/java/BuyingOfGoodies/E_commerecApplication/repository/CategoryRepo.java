package BuyingOfGoodies.E_commerecApplication.repository;

import BuyingOfGoodies.E_commerecApplication.model.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Repository
public interface CategoryRepo extends JpaRepository<Category, UUID> {
}
