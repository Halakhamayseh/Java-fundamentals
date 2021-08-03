### lab07 Composition and Inheritance, Part 2
1. The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.
Implement a constructor for a Shop.
Implement a reasonable toString method for Shops.
Add tests for the basics of your Shop class.

2. The users also want to review shops! It would be great if a Review could be about either a Shop or a Restaurant. Choose an implementation, and make this possible.
Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.
Write tests for this functionality.

3. The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)
Implement a constructor for a Theater.
Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown.
Implement a reasonable toString method for Theaters.
Test your Theater functionality.

4. Review all the things!
Ensure that your Theater is just as reviewable as your Restaurant and your Shop.
Test this functionality.

5. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.
Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.
Make sure that someone reviewing a Restaurant or a Shop doesn’t have to include which movie they saw!
It’s also okay if someone doesn’t want to include the movie they saw when they’re reviewing a theater (maybe they just went in for the popcorn).
Add testing for any new functionality you’ve created.
### directions on how to test My code
in LibraryTest.java 
I made 3 functions with @test and I comparer in each one the output with expected using (assertEquals)

### Amount of time that was spent on this assignment: 9 Hours