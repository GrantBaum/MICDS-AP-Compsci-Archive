EPA01: How Far Will You Go?
Description/Instructions:
In winter, the fjords of Erindale freeze over and the contestants prepare for the annual ice rocket contest. The goal of the contest is to launch a two-stage model rocket across the ice so that it stops as close as possible to the goal line without touching or passing over it. The winner gets to ride a reindeer in the winter parade. Every year the exact distance from the starting line to the goal is kept a secret until a week before the contest. To win, contestants must do some math to determine the optimal thrust for their rockets. One of the equations they use is a simple distance calculation:

	d = vt + (1/2)(at^2)

Using this formula, a contestant can determine the distance d a rocket will travel for a number of seconds t, given an initial velocity v and acceleration a.

Input:
You must ask the user EXACTLY the following questions with input on the same line:
Enter velocity: 
Enter acceleration: 
Enter time: 

The values must be in the range of -100 to 100, inclusive.

Hint: You will need what is called a Scanner to receive input from a user in the console. Please see this example at https://micds.menghini.org/~apcsa/downloads/EPA01/ScannerExample.java on how to do this. You will also need to know how an if statement works to check for values between -100 to 100.

Output:
Below is sample output in your program (note that those numbers were typed and the “enter” key was pressed, thus making a new line):


Note that there is no need to round any numbers.

If the number was too large or too negative, you should print “ERROR” on the last line instead of the number like the example below.



How to Submit:
You will submit this programming assignment to http://micds.menghini.org/~apcsa/. More info on how to do this can be found here.

Grading Criteria:
test1: Test with inputs 14.46, -1.38, and 8.7 in that order.
test2: Test with inputs 0, 11.34, and 2.4 in that order.
test3: Test with inputs 63.5, 2.1, and 4.4 in that order.
test4: Test with inputs 97.01, 0.00, and 1.313 in that order.
test5: Test with inputs 0, 0, and 0 in that order.
test6: Test with inputs 100, 5, and 8 in that order.
test7: Test with inputs 101, 5, and 8 in that order.
test8: Test with inputs -100, 5, and 8 in that order.
test9: Test with inputs -101, 5, and 8 in that order.
checkHeader: checks to see if the header is on top of the code.

Credit Where Credit Is Deserved:
This is an altered assignment from the 2018 CodeWars competition.
