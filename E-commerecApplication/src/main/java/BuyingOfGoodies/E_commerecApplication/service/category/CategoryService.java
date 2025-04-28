package BuyingOfGoodies.E_commerecApplication.service.category;

import BuyingOfGoodies.E_commerecApplication.dto.responds.categoryResponds.*;
import BuyingOfGoodies.E_commerecApplication.model.Category;
import BuyingOfGoodies.E_commerecApplication.model.Product;

public interface CategoryService {
     CreateCategoryRespond createCategory(String name);

     DeleteCategoryRespond deleteCategory(Category category);

     GetAllCategoriesRespond getAllCategories();

    AddProductToCategory addProductToCategory(Category category, Product product);

    RemoveproductFromCategory removeProductFromCategory(Category category, Product product);
}
