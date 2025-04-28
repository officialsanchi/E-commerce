package BuyingOfGoodies.E_commerecApplication.dto.request.userRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserUpdateRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String username;
    private String password;
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String postalCode;
}
