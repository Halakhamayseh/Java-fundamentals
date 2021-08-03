# java-fundamentals

### this repo covers the basic concepts in java and the applications inside it were built using Java language and IntelliJ software 
### Lab 01:Java Primitives and Control Flow
Has the following tasks :
1-Flipping Coins: The written method that called flipNHeads accepts an integer n and flips coins until n heads
are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers
below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on
one line for each flip.and It Print took FLIPS flips to flip N heads in a row. once n heads have been in a row.
### lab 01 tree
.
├── README.md
└── basics
    ├── Main.class
    └── Main.java

### Lab 02: Arrays, Loops, Imports, ArrayLists
Has the following tasks : :
1. Rolling Dice: The written method that called roll accepts an integer n and rolls a six-sided dice n times. The method
return an array containing the values of the rolls.
2.  check if Contains Duplicates: The written method that called containsDuplicates returns true or false
depending on whether the array contains duplicate values.
3. Calculating Averages: The written method called arraysAvarege accepts an array of integers and calculates and
returns the average of all the values in the array.
4.  Lowest weekly Month Temperatures average temperatures for Seattle: calculate the average value for each week and return the array with the lowest average.


### Lab: 03 - Maps and File I/O
This lab contains the following methods:
1. `Maps funcation`:  Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String times and return an array containing the values of the rolls.

2. `Tallying Election`:  function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.
3. `JavaScript Linter`: Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon

### Lab: 06 - Inheritance and Interfaces 
##### Lab: 06 lab, you’ll create classes to represent reviews of restaurants use composition to solve it 

##### This lab contains the following Tasks:
1. Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
Implement a Restaurant constructor.
Test that your Restaurant constructor is behaving reasonably.
Implement a reasonable toString method for Restaurants.
Write a test to create an instance of Restaurant and ensure that its toString is working properly.

2. Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
Write a Review constructor.
Test that your constructor is working reasonably.
Implement a reasonable toString method for Reviews.
Write a test to create an instance of Review and ensure that its toString is working properly.

3. A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
Should a Review know which Restaurant it is about?
Should a Restaurant know which Reviews are about it?
Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.

4. Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.

5. When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)
### lab07 Composition and Inheritance, Part 2
##### This lab contains the following Tasks:
1. The users want shops! Create a Shop class; a Shop should have a name, description, and number of dollar signs.

2. The users also want to review shops!
It would be great if a Review could be about either a Shop or a Restaurant. 
3. The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

4. Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.
Some reviews should now have a String movie instance variable, to hold which movie that reviewer is referencing.

5. Add testing for any new functionality you’ve created.
Author: Hala Khamayseh