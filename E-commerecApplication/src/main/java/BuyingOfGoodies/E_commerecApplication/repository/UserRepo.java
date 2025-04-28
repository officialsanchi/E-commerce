package BuyingOfGoodies.E_commerecApplication.repository;

import BuyingOfGoodies.E_commerecApplication.dto.request.userRequest.DeleteUserRequest;
import BuyingOfGoodies.E_commerecApplication.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepo extends  JpaRepository<User, UUID> {
    Optional<User> user(String username);

    void deleteById(DeleteUserRequest deleteUser);
}
