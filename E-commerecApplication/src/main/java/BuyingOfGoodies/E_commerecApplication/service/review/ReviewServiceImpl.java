package BuyingOfGoodies.E_commerecApplication.service.review;

import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.AddReviewRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.DeleteReviewRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.GetAverageRatingRespond;
import BuyingOfGoodies.E_commerecApplication.dto.responds.reviewResponds.GetReviewsRespond;
import BuyingOfGoodies.E_commerecApplication.model.Product;
import BuyingOfGoodies.E_commerecApplication.model.Review;
import BuyingOfGoodies.E_commerecApplication.model.User;
import BuyingOfGoodies.E_commerecApplication.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepo reviewRepo;

    @Override
    public AddReviewRespond addReview(User user, Product product, String reviewText, int rating) {
        return null;
    }

    @Override
    public GetReviewsRespond getReviews(Product product) {
        return null;
    }

    @Override
    public GetAverageRatingRespond getAverageRating(Product product) {
        return null;
    }

    @Override
    public DeleteReviewRespond deleteReview(User user, Review review) {
        return null;
    }
}
