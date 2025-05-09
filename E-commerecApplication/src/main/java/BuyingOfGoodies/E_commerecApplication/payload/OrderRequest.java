package BuyingOfGoodies.E_commerecApplication.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    @NotEmpty(message = "Shipping address cannot be empty")
    private String shippingAddress;

    @NotEmpty(message = "Billing address cannot be empty")
    private String billingAddress;

    @NotEmpty(message = "Payment method cannot be empty")
    private String paymentMethod;

    @NotNull(message = "Cart ID cannot be null")
    private Long cartId;
}
