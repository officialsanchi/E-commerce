package BuyingOfGoodies.E_commerecApplication.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
    private Long id;
    private ProductSummaryDto product;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal subtotal;
}

