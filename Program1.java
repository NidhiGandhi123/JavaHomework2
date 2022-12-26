package programlist;
// Write a program to check if a candidate is eligible for voting or not. (Hint:Check age)

public class Program1 {
    public static void main(String[] args) {
        int age = 15;
        int difference;

        // checking condition for voting
        if (age >= 18) {
            System.out.println("you are eligible for voting");
        } else {
            difference = (18 - age);
            System.out.println("Sorry, you can vote after :" + difference + "Years");
        }
    }
}