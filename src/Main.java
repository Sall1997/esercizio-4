/* ESERCIZIO 4
-Define a testing class where you: -. Define an int variable called a and initialise it with the value 15
-Add 5 to a without repeating the a variable (e.g. a = a + 5 is not accepted)
-Then subtract 4 to a without repeating the a variable
-Assign the value of a to int b and increment b by one without using a or int b = b + 1
-Check and prints if both the following statements are true: statement
    1: check if b is an odd number statement
    2: check if the result of (b multiplied for b + 1) is a multiple of 3
*/

public class Main {
    public static void main(String[] args) {

        int a = 15;
        a+= 5; // or a++ (5 times)
        a-= 4; // or a-- (4 times)
       int b = a;
       b++;

       if(!(a % 2 == 0) &&  b % 3 == 0){

           System.out.println("it's true");
       }
    }
}