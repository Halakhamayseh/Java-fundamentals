/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    //public boolean someLibraryMethod() {
        //return true;
   // }
    public static void main(String[] args) {
        Restaurant newInstanceRestaurant1=new Restaurant("Jood Restaurant",10);
        Restaurant newInstanceRestaurant2=new Restaurant("hala Restaurant",50);
        //System.out.println(newInstanceRestaurant1);
        ///
     Review newInstanceReview=new Review("not good","hala",1);
        Review newInstanceReview2=new Review(" good","sara",3);

        newInstanceRestaurant1.addReview(newInstanceReview);
        newInstanceRestaurant1.addReview(newInstanceReview2);
      System.out.println(newInstanceRestaurant1.toString());
Shop newShope=new Shop("Ahmad Market","good Market",5);

    }
}
