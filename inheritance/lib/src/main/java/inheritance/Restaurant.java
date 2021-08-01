package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    //have a name, a number of stars betweeen 0 and 5, and a price category
    public String RestaurantName;
    public int starsRate;
    public int RestaurantPrice ;
    private List <Review> reviewsArray;

    public List<Review> getReviewsArray() {
        return reviewsArray;
    }

    public void setReviewsArray(List<Review> reviewsArray) {
        this.reviewsArray = reviewsArray;
    }

    //Implement a Restaurant constructor
    public Restaurant(String RestaurantName,int RestaurantPrice){
        this.RestaurantName=RestaurantName;
       // this.starsRate=starsRate;
        this.RestaurantPrice=RestaurantPrice;
        this.reviewsArray=new ArrayList<Review>();

    }
    public void addReview(Review oneRrview){
        reviewsArray.add(oneRrview);
        int sum=0;
        for (Review i:reviewsArray){

            //int avgStars=0;
            sum+=(i.starsRate);
        }

        //System.out.println(starsRate);
        starsRate= sum/reviewsArray.size();
        //System.out.println(starsRate);

    }
    // function Tostring


    @Override
    public String toString() {
        return "Restaurant{" +
                "RestaurantName='" + RestaurantName + '\'' +
                ", starsRate=" + starsRate +
                ", RestaurantPrice=" + RestaurantPrice +
                ", reviewsArray=" + reviewsArray +
                '}';
    }
}
