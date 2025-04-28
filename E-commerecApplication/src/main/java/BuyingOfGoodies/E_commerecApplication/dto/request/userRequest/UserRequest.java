package BuyingOfGoodies.E_commerecApplication.dto.request.userRequest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class UserRequest {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private Long id;
        private String fullName;
        private String email;
        private String username;
        private String password;
        private String streetAddress;
        private String city;
        private String state;
        private String country;
        private String postalCode;


}
