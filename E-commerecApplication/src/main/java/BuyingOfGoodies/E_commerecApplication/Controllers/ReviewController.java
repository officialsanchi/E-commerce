package BuyingOfGoodies.E_commerecApplication.Controllers;

import com.ecommerce.payload.PageResponse;
import com.ecommerce.payload.ReviewDto;
import com.ecommerce.service.ReviewService;
import com.ecommerce.utils.AppConstants;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/product/{productId}")
    public ResponseEntity<ReviewDto> createReview(
            @PathVariable(name = "productId") Long productId,
            @Valid @RequestBody ReviewDto reviewDto) {
        return new ResponseEntity<>(reviewService.createReview(productId, reviewDto), HttpStatus.CREATED);
    }

    @GetMapping("/product/{productId}")
    public PageResponse<ReviewDto> getReviewsByProduct(
            @PathVariable(name = "productId") Long productId,
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = "createdAt", required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = "desc", required = false) String sortDir) {
        return reviewService.getReviewsByProduct(productId, pageNo, pageSize, sortBy, sortDir);
    }

    @GetMapping("/my-reviews")
    public PageResponse<ReviewDto> getCurrentUserReviews(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = "createdAt", required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = "desc", required = false) String sortDir) {
        return reviewService.getCurrentUserReviews(pageNo, pageSize, sortBy, sortDir);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReviewDto> updateReview(
            @PathVariable(name = "id") Long id,
            @Valid @RequestBody ReviewDto reviewDto) {
        return ResponseEntity.ok(reviewService.updateReview(id, reviewDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReview(@PathVariable(name = "id") Long id) {
        reviewService.deleteReview(id);
        return ResponseEntity.ok("Review deleted successfully");
    }
}

