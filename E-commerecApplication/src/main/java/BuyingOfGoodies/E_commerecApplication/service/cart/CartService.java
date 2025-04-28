package BuyingOfGoodies.E_commerecApplication.service.cart;

import BuyingOfGoodies.E_commerecApplication.dto.responds.cartResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Product;
import BuyingOfGoodies.E_commerecApplication.model.User;

public interface CartService {
    AddToCartRespond addToCart(User user, Product product, int quantity);
     RemoveFromCartRespond removeFromCart(User user, Product product);
     GetCartRespond getCart(User user);
     CheckOutRespond checkout(User user);
     ClearCartRespond clearCart(User user);
}
