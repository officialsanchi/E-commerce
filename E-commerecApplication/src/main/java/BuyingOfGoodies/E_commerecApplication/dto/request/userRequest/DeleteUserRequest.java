package BuyingOfGoodies.E_commerecApplication.dto.request.userRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DeleteUserRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int userId;

}
