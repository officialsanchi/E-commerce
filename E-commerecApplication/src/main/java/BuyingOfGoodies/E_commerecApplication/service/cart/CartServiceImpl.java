package BuyingOfGoodies.E_commerecApplication.service.cart;

import BuyingOfGoodies.E_commerecApplication.dto.responds.cartResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Product;
import BuyingOfGoodies.E_commerecApplication.model.User;
import BuyingOfGoodies.E_commerecApplication.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepo cartRepo;

    @Override
    public AddToCartRespond addToCart(User user, Product product, int quantity) {
        return null;
    }

    @Override
    public RemoveFromCartRespond removeFromCart(User user, Product product) {
        return null;
    }

    @Override
    public GetCartRespond getCart(User user) {
        return null;
    }

    @Override
    public CheckOutRespond checkout(User user) {
        return null;
    }

    @Override
    public ClearCartRespond clearCart(User user) {
        return null;
    }
}
