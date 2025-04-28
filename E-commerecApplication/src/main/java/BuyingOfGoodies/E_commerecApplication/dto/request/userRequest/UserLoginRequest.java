package BuyingOfGoodies.E_commerecApplication.dto.request.userRequest;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class UserLoginRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String email;
    private String password;
}
