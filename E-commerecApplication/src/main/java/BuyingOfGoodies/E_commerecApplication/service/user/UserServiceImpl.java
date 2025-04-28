package BuyingOfGoodies.E_commerecApplication.service.user;

import BuyingOfGoodies.E_commerecApplication.dto.request.userRequest.*;
import BuyingOfGoodies.E_commerecApplication.dto.responds.userResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.User;
import BuyingOfGoodies.E_commerecApplication.repository.UserRepo;
import BuyingOfGoodies.E_commerecApplication.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;


    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

//    public UserLoginResponds login(UserLoginRequest userLoginRequest) {
//        userLoginRequest.setPassword( passwordEncoder.encode( userLoginRequest.getPassword() ) );
//        return userRepository.save( userLoginRequest );
//    }

    public UserRegisterResponds registerUser(UserRegisterRequest userRegisterRequest) {
        User user = new User();
        user.setId( userRegisterRequest.getId() );
        user.setFullName( userRegisterRequest.getFullName() );
        user.setUsername( userRegisterRequest.getUsername() );
        user.setEmail( userRegisterRequest.getEmail() );
        user.setPassword( passwordEncoder.encode( userRegisterRequest.getPassword() ) );
        user.setCity( userRegisterRequest.getCity() );
        user.setCountry( userRegisterRequest.getCountry() );
        user.setPostalCode( userRegisterRequest.getPostalCode() );
        user.setState( userRegisterRequest.getState() );
        user.setStreetAddress( userRegisterRequest.getStreetAddress() );
        userRepository.save( user );
        UserRegisterResponds userRegisterResponds = new UserRegisterResponds();
        userRegisterResponds.setMessage( "Account created successfully" );
        return userRegisterResponds;

//        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
//            throw new RuntimeException("Username already exists");
//        }
//        return createUser(user);
//    }
    }

    @Override
    public UserLoginResponds login(UserLoginRequest userLoginRequest) {
        return null;
    }

    @Override
    public CreateUserRespond createUser(User user) {
        return null;
    }

    @Override
    public UpdateUserRespond updateUser(User user) {
        return null;
    }

    @Override
    public DeleteUserRespond deleteUser(User user) {
        return null;
    }

    @Override
    public GetUserByIdRespond getUserById(int userId) {
        return null;
    }

    @Override
    public GetOrderHistoryRespond getOrderHistory(User user) {
        return null;
    }

    @Override
    public AuthenticateUserRespond authenticateUser(String email, String password) {
        return null;
    }

    public UserUpdateResponds updateUser(UserUpdateRequest userUpdateRequest) {
        User user = new User();
        user.setId( Long.valueOf( userUpdateRequest.getId() ) );
        user.setUsername( userUpdateRequest.getUsername() );
        user.setPassword( passwordEncoder.encode( userUpdateRequest.getPassword() ) );
        user.setCity( userUpdateRequest.getCity() );
        user.setCountry( userUpdateRequest.getCountry() );
        user.setPostalCode( userUpdateRequest.getPostalCode() );
        user.setState( userUpdateRequest.getState() );
        user.setStreetAddress( userUpdateRequest.getStreetAddress() );
        userRepository.save( user );
        UserUpdateResponds userUpdateResponds = new UserUpdateResponds();
        userUpdateResponds.setMessage( "Account updated successfully" );
        return userUpdateResponds;
    }
}


//        return userRepository.findById(id).map(user -> {
//            user.setUsername(updatedUser.getUsername());
//            user.setPassword(passwordEncoder.encode(updatedUser.getPassword()));
//            return userRepository.save(user);
//        }).orElseThrow(() -> new RuntimeException("User not found"));


    public DeleteUserResponds deleteUser(DeleteUserRequest deleteUserRequest) {
       User user = new User();

        deleteUser.getUserId();
     userRepository.deleteById(deleteUser);
     DeleteUserResponds deleteUserResponds = new DeleteUserResponds();
     deleteUserResponds.setMessage( "User deleted successfully" );
     return deleteUserResponds;
    }

//    public GetUserByIdRespond  getUserById(GetUserByIdRequest  id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("User not found"));
//    }

//    public List<String> getOrderHistory(Long id) {
//        return getUserById( id ).getOrderHistory();
//    }

//    public String authenticateUser(String username, String rawPassword) {
//        Optional<User> user = userRepository.findByUsername(username);
//        if (user.isPresent() && passwordEncoder.matches(rawPassword, user.get().getPassword())) {
//            String sessionToken = UUID.randomUUID().toString();
//            redisTemplate.opsForValue().set(sessionToken, username); // Store token in Redis
//            return sessionToken;
//        }
//        throw new RuntimeException("Invalid credentials");
//    }

//    public boolean validateToken(String token) {
//        return redisTemplate.hasKey(token);
//    }
//


