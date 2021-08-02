package inheritance;

import java.util.List;

public class Shop extends Restaurant {
    //should have a name, description, and number of dollar signs.
    public String nameShope;
    public String descriptionShope;
    public int numberOfDollarSigns;

    public List<Review> getReviewsArray() {
        return reviewsArray;
    }

    public void setReviewsArray(List<Review> reviewsArray) {
        this.reviewsArray = reviewsArray;
    }

    private List<Review> reviewsArray;

    public Shop(String nameShope, String descriptionShope, int numberOfDollarSigns) {
        super("jood",5);
        this.nameShope = nameShope;
        this.descriptionShope = descriptionShope;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }
}
