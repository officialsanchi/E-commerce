package BuyingOfGoodies.E_commerecApplication.Controllers;

import com.ecommerce.payload.CartDto;
import com.ecommerce.payload.CartItemRequest;
import com.ecommerce.service.CartService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping
    public ResponseEntity<CartDto> getCurrentUserCart() {
        return ResponseEntity.ok(cartService.getCurrentUserCart());
    }

    @PostMapping("/items")
    public ResponseEntity<CartDto> addItemToCart(@Valid @RequestBody CartItemRequest cartItemRequest) {
        return ResponseEntity.ok(cartService.addItemToCart(cartItemRequest));
    }

    @PutMapping("/items/{itemId}")
    public ResponseEntity<CartDto> updateCartItem(
            @PathVariable(name = "itemId") Long itemId,
            @Valid @RequestBody CartItemRequest cartItemRequest) {
        return ResponseEntity.ok(cartService.updateCartItem(itemId, cartItemRequest));
    }

    @DeleteMapping("/items/{itemId}")
    public ResponseEntity<CartDto> removeItemFromCart(@PathVariable(name = "itemId") Long itemId) {
        return ResponseEntity.ok(cartService.removeItemFromCart(itemId));
    }

    @DeleteMapping("/clear")
    public ResponseEntity<String> clearCart() {
        cartService.clearCart();
        return ResponseEntity.ok("Cart cleared successfully");
    }
}
