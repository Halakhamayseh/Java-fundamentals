package inheritance;

public class Review {
    //should have a body, an author, and a number of stars.
    public String body;
    public String anAuthor;
    public int numberOfStars ;
    public String movieName;
    public Review(String body,String anAuthor,int numberOfStars){
        this.body=body;
        this.anAuthor=anAuthor;
        this.numberOfStars=numberOfStars;
    }
    public Review(String body,String anAuthor,int numberOfStars,String movieName){
        this.body=body;
        this.anAuthor=anAuthor;
        this.numberOfStars=numberOfStars;
        this.movieName=movieName;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", anAuthor='" + anAuthor + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}
