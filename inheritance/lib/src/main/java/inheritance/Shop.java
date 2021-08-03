package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Restaurant {
    private ArrayList<Review> reviewsArray=new ArrayList<Review>();;

    @Override
    public ArrayList<Review> getReviewsArray() {
        return reviewsArray;
    }

    @Override
    public void setReviewsArray(ArrayList<Review> reviewsArray) {
        this.reviewsArray = reviewsArray;
    }

    public String descriptionShope;
    public Shop(String Name) {
        super(Name);
        this.reviewsArray=new ArrayList<Review>();

    }
    public Shop(String Name, int Price, String descriptionShope) {
      super(Name,Price);
       this.descriptionShope = descriptionShope;
       this.reviewsArray=new ArrayList<Review>();

    }

    @Override
    public void addReview(Review oneRrview) {
        super.addReview(oneRrview);
        //Review newInstanceReview=new Review(oneRrview.body, oneRrview.anAuthor,oneRrview.starsRate);


        reviewsArray.add(oneRrview);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "ShopName='" + Name + '\'' +
                ", starsRate=" + starsRate +
                ", ShopPrice =" + Price+"$"+
                ", descriptionShope='" + descriptionShope + '\'' +
                ", reviewsArray=" + reviewsArray +
                '}';
    }
}
