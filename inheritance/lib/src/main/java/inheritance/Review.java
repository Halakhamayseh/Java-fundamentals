package inheritance;

public class Review {
    //should have a body, an author, and a number of stars.
    public String body;
    public String anAuthor;
    public int starsRate ;
    public Review(String body,String anAuthor,int starsRate){
        this.body=body;
        this.anAuthor=anAuthor;
        this.starsRate=starsRate;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", anAuthor='" + anAuthor + '\'' +
                ", numberOfStars=" + starsRate +
                '}';
    }
}
