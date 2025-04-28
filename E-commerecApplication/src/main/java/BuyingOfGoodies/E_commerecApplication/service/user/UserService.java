package BuyingOfGoodies.E_commerecApplication.service.user;

import BuyingOfGoodies.E_commerecApplication.dto.request.userRequest.UserLoginRequest;
import BuyingOfGoodies.E_commerecApplication.dto.responds.userResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.User;

public interface UserService {
    UserLoginResponds login(UserLoginRequest userLoginRequest);
    CreateUserRespond createUser(User user);

   UpdateUserRespond updateUser(User user);

     DeleteUserRespond deleteUser(User user);

    GetUserByIdRespond getUserById(int userId);

     GetOrderHistoryRespond getOrderHistory(User user);

     AuthenticateUserRespond authenticateUser(String email, String password);


}
