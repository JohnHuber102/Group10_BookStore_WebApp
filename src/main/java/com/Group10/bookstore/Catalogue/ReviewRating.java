package com.Group10.bookstore.Catalogue;

import com.Group10.bookstore.BookReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ReviewRating {

    @Autowired
    private ReviewRatingService reviewRatingService;

    @RequestMapping("/catalogue/review")
    public List<BookReview> getReviewArchive() {
        return reviewRatingService.getReviewArchive();
    }

    @RequestMapping("/catalogue/{reviewISBN}/review")
    public List<BookReview> searchReviewISBN(@PathVariable String reviewISBN){
        return reviewRatingService.searchReviewISBN(reviewISBN);
    }

    @RequestMapping("/catalogue/{reviewUser}")
    public List<BookReview> searchReviewUser(@PathVariable String reviewUser){
        return reviewRatingService.searchReviewUser(reviewUser);
    }

    //You assume the front end has a button or form that users fill and that he front end takes those user inputs and formats it appropriately before sending it via the request package.
    @RequestMapping(method = RequestMethod.POST, value = "/catalogue/{reviewISBN}")
    public void addBookReview(@RequestBody BookReview newReview, @PathVariable String reviewISBN){
        reviewRatingService.addReview(reviewISBN, newReview);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/catalogue/{reviewISBN}")
    public void updateBookReview(@RequestBody BookReview newReview, @PathVariable String reviewISBN){
        reviewRatingService.updateReview(reviewISBN, newReview);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/catalogue/{reviewISBN}")
    public void deleteBookReview(@RequestBody BookReview newReview, @PathVariable String reviewISBN){
        reviewRatingService.deleteReview(reviewISBN, newReview);
    }
}
