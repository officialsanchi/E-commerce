package BuyingOfGoodies.E_commerecApplication.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;

    @NotEmpty(message = "Product name cannot be empty")
    private String name;

    private String description;

    @NotNull(message = "Price cannot be null")
    @Positive(message = "Price must be positive")
    private BigDecimal price;

    private Integer quantity;

    private String sku;

    private String imageUrl;

    private boolean featured;

    private CategoryDto category;

    private Double averageRating;

    private Integer reviewCount;

    private List<ReviewDto> reviews;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
