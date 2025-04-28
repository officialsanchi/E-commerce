package BuyingOfGoodies.E_commerecApplication.service.review;

import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.AddReviewRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.DeleteReviewRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.GetAverageRatingRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.GetReviewsRespond;
import BuyingOfGoodies.E_commerecApplication.model.Product;
import BuyingOfGoodies.E_commerecApplication.model.Review;
import BuyingOfGoodies.E_commerecApplication.model.User;

public interface ReviewService {
    AddReviewRespond addReview(User user, Product product, String reviewText, int rating);

    GetReviewsRespond getReviews(Product product);

    GetAverageRatingRespond getAverageRating(Product product);

    DeleteReviewRespond deleteReview(User user, Review review);
}
