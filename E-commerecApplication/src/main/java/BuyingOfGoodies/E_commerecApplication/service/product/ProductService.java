package BuyingOfGoodies.E_commerecApplication.service.product;

import BuyingOfGoodies.E_commerecApplication.dto.responds.productResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Category;
import BuyingOfGoodies.E_commerecApplication.model.Product;

public interface ProductService {
   AddProductRespond addProduct(Product product);

    UpdateProductRespond updateProduct(Product product);

     DeleteProductRespond deleteProduct(Product product);

    GetProductByIdRespond getProductById(int productId);

     GetProductByCategoryRespond getProductsByCategory(Category category);

     SearchProductsRespond searchProducts(String searchQuery);
}
