package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    //have a name, a number of stars betweeen 0 and 5, and a price category
    public String Name;
    public int starsRate;
    public int Price ;
    private ArrayList <Review> reviewsArray=new ArrayList<Review>();

    public ArrayList<Review> getReviewsArray() {
        return reviewsArray;
    }

    public void setReviewsArray(ArrayList<Review> reviewsArray) {
        this.reviewsArray = reviewsArray;
    }

    //Implement a Restaurant constructor
    public Restaurant(String Name) {
        this.reviewsArray=new ArrayList<Review>();

    }
    public Restaurant(String RestaurantName,int RestaurantPrice){
        this.Name=RestaurantName;
       // this.starsRate=starsRate;
        this.Price=RestaurantPrice;
        this.reviewsArray=new ArrayList<Review>();

    }
    public void addReview(Review oneRrview){
        //Review newInstanceReview=new Review(oneRrview.body, oneRrview.anAuthor,oneRrview.starsRate);
        if(starsRate<=5){
            reviewsArray.add(oneRrview);
            int sum=0;
            for (Review i:reviewsArray){

                //int avgStars=0;
                sum+=(i.numberOfStars);
            }

            //System.out.println(starsRate);
            starsRate= sum/reviewsArray.size();
            //System.out.println(starsRate);

        }else {
            String rateofstarhigherthan5="you should choose between1-5";
            System.out.println(rateofstarhigherthan5);
        }
    }

    // function Tostring


    @Override
    public String toString() {
        return "Restaurant{" +
                "RestaurantName='" + Name + '\'' +
                ", starsRate=" + starsRate +
                ", RestaurantPrice=" + Price+"$" +
                ", reviewsArray=" + reviewsArray +
                '}';
    }
}
