package BuyingOfGoodies.E_commerecApplication.payload;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;

    @NotEmpty(message = "Category name cannot be empty")
    private String name;

    private String description;

    private Integer productCount;
}
