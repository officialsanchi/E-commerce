package BuyingOfGoodies.E_commerecApplication.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private Long id;
    private UserSummaryDto user;
    private List<CartItemDto> cartItems;
    private BigDecimal totalAmount;
    private Integer totalItems;
}

