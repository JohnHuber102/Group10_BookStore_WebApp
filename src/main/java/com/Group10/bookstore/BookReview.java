package com.Group10.bookstore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity(name = "BookReviews")
@IdClass(BookReviewKey.class)
public class BookReview implements Serializable {

    @Id
    private String reviewISBN;

    private String bookReview;
    private int bookRating;

    @Id
    private String reviewer;

    private Date timestamp;


    /*
     * No argument constructor.
     */
    public BookReview(){

    }

    public BookReview(String reviewISBN, String bookReview, int bookRating, String reviewer, Date timeStamp){
        this.reviewISBN = reviewISBN;
        this.bookReview = bookReview;
        this.bookRating = bookRating;
        this.reviewer = reviewer;
        this.timestamp = timeStamp;
    }

    public String getBookReview() {
        return bookReview;
    }

    public void setBookReview(String bookReview) {
        this.bookReview = bookReview;
    }

    public int getBookRating() {
        return bookRating;
    }

    public void setBookRating(int bookRating) {
        this.bookRating = bookRating;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getReviewISBN() {
        return reviewISBN;
    }

    public void setReviewISBN(String reviewISBN) {
        this.reviewISBN = reviewISBN;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}


