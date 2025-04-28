package BuyingOfGoodies.E_commerecApplication.service.category;

import BuyingOfGoodies.E_commerecApplication.dto.responds.categoryResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Category;
import BuyingOfGoodies.E_commerecApplication.model.Product;
import BuyingOfGoodies.E_commerecApplication.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public CreateCategoryRespond createCategory(String name) {
        return null;
    }

    @Override
    public DeleteCategoryRespond deleteCategory(Category category) {
        return null;
    }

    @Override
    public GetAllCategoriesRespond getAllCategories() {
        return null;
    }

    @Override
    public AddProductToCategory addProductToCategory(Category category, Product product) {
        return null;
    }

    @Override
    public RemoveproductFromCategory removeProductFromCategory(Category category, Product product) {
        return null;
    }
}
