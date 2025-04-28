package BuyingOfGoodies.E_commerecApplication.service.product;

import BuyingOfGoodies.E_commerecApplication.dto.responds.productResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Category;
import BuyingOfGoodies.E_commerecApplication.model.Product;
import BuyingOfGoodies.E_commerecApplication.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public AddProductRespond addProduct(Product product) {
        return null;
    }

    @Override
    public UpdateProductRespond updateProduct(Product product) {
        return null;
    }

    @Override
    public DeleteProductRespond deleteProduct(Product product) {
        return null;
    }

    @Override
    public GetProductByIdRespond getProductById(int productId) {
        return null;
    }

    @Override
    public GetProductByCategoryRespond getProductsByCategory(Category category) {
        return null;
    }

    @Override
    public SearchProductsRespond searchProducts(String searchQuery) {
        return null;
    }
}
