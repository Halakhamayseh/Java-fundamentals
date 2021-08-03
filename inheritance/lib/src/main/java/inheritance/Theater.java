package inheritance;

import java.util.ArrayList;

public class Theater extends Shop {
    //should have a name and all of the movies currently showing there.
   // public String name;
   private ArrayList<String> MoviesArray= new ArrayList<String>();

    public ArrayList<String> getMoviesArray() {
        return MoviesArray;
    }

    public void setMoviesArray(ArrayList<String> moviesArray) {
        MoviesArray = moviesArray;
    }

    private ArrayList <Review> reviewsArray=new ArrayList<Review>();

    @Override
    public ArrayList<Review> getReviewsArray() {
        return reviewsArray;
    }

    @Override
    public void setReviewsArray(ArrayList<Review> reviewsArray) {
        this.reviewsArray = reviewsArray;
    }



    public Theater(String Name) {
        super(Name);
        this.Name=Name;

        //super(RestaurantName,RestaurantPrice,descriptionShope);
        this.MoviesArray=new ArrayList<String>();
        this.reviewsArray=new ArrayList<Review>();
        this.movieName=movieName;
    }
    public void addMovie(String movie) {

        MoviesArray.add(movie);
    }
    public void removeMovie(String movie) {

        MoviesArray.remove(movie);
    }

    @Override
    public void addReview(Review oneRrview) {
        super.addReview(oneRrview);
        reviewsArray.add(oneRrview);
    }

    public String movieName;
  public void addReviewtow(Review Rrview2 ) {
      //ArrayList <String>movieNameArry=new ArrayList<String>();
        //super.addReview(oneRrview);
      //if (movieNameArry.size() != 0){
      Review newoneRrview=new Review(Rrview2.body, Rrview2.anAuthor,Rrview2.numberOfStars,Rrview2.movieName);
          //int index=0;
     // movieName=Rrview2.movieName;
     // resultName=movieName+movieName;
         // movieNameArry.size();
      //movieNameArry.add(Rrview2.movieName);
         // for(String moive:movieNameArry){
              //moive=Rrview2.movieName;
              //movieNameArry.add(moive);
              //System.out.println("l");
              //System.out.println(moive);
              //index++;

          //}
     // }
     // System.out.println(movieNameArry);


        //for (int i = 0; i <MoviesArray.size() ; i++) {
            //oneRrview.movieName= MoviesArray.get(i);
           // System.out.println(newoneRrview.movieName);
          //  System.out.println(MoviesArray.get(i));
        //}
        //Review newoneRrview2=new Review(oneRrview.body, oneRrview.anAuthor,oneRrview.starsRate,oneRrview.movieName);
        //reviewsArray.add(newoneRrview2);
       // System.out.println(oneRrview.movieName);

//     res="Review{" +
//              "body='" + Rrview2.body + '\'' +
//              ", anAuthor='" + Rrview2.anAuthor + '\'' +
//              ", starsRate=" + Rrview2.starsRate +
//              ", movieName='" + Rrview2.movieName + '\'' +
//              '}';
      //movieName=", movieName='" + Rrview2.movieName + '\'' +

      movieName=Rrview2.movieName;
      reviewsArray.add(newoneRrview);
      //System.out.println(res);
      //return res;
 }

    @Override
    public String toString() {
        return "Theater{" +
                "Name='" + Name + '\'' +
                ", starsRate=" + starsRate +
                ", MoviesArray=" + MoviesArray +
                ", reviewsArray=" + reviewsArray +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
