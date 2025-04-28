package BuyingOfGoodies.E_commerecApplication.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
