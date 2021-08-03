/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        //assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");

    }
//    @Test public void testres(){
//        Restaurant newInstanceRestaurant1=new Restaurant("Jood Restaurant",10);
//        String resultTest="Restaurant{RestaurantName='Jood Restaurant', starsRate=0, RestaurantPrice=10, reviewsArray=[]}";
//        assertEquals(resultTest,newInstanceRestaurant1.toString());
//    }
//    @Test public void testReview(){
//        Review newInstanceReview=new Review("not good","hala",1);
//        String resultTest="Review{body='not good', anAuthor='hala', numberOfStars=1}";
//        assertEquals(resultTest,newInstanceReview.toString());
//    }
//    @Test public void testadd(){
//        Restaurant newInstanceRestaurant1=new Restaurant("Jood Restaurant",10);
//        Review newInstanceReview=new Review("not good","hala",1);
//        newInstanceRestaurant1.addReview(newInstanceReview);
//        String resultTest="Restaurant{RestaurantName='Jood Restaurant', starsRate=1, RestaurantPrice=10, reviewsArray=[Review{body='not good', anAuthor='hala', numberOfStars=1}]}";
//        assertEquals(resultTest,newInstanceRestaurant1.toString());
//    }
    /////////lab07//////////
    @Test public void testShopreview(){
        Shop newInstanceshop=new Shop("Ahmad Market",5,"notGood");
        Review newInstanceReview2=new Review(" good","sara",5);
        Review newInstanceReview=new Review("not good","hala",1);
        newInstanceshop.addReview(newInstanceReview2);
        newInstanceshop.addReview(newInstanceReview);
        String resultTest="Shop{ShopName='Ahmad Market', starsRate=3, ShopPrice =5$, descriptionShope='notGood', reviewsArray=[Review{body=' good', anAuthor='sara', numberOfStars=5}, Review{body='not good', anAuthor='hala', numberOfStars=1}]}";
        assertEquals(resultTest,newInstanceshop.toString());
    }
    @Test public void testtheater(){
        Theater newthe=new Theater("hala Theater");
        Review newInstanceReview=new Review("not good","hala",1);
        Review newInstanceReview2=new Review(" good","sara",5);
        Review movieReview2=new Review(" good","Rhamha",3,"harry2");
        newthe.addMovie("harry movie");
        newthe.addMovie("harrytow movie");
        newthe.removeMovie("harrytow movie");
        newthe.addReview(newInstanceReview2);
        newthe.addReview(newInstanceReview);
        newthe.addReviewtow(movieReview2);
        String resultTest="Theater{Name='hala Theater', starsRate=3, MoviesArray=[harry movie], reviewsArray=[Review{body=' good', anAuthor='sara', numberOfStars=5}, Review{body='not good', anAuthor='hala', numberOfStars=1}, Review{body=' good', anAuthor='Rhamha', numberOfStars=3}], movieName='harry2'}";
        assertEquals(resultTest,newthe.toString());
    }
}
