package programlist;
// Extend the previous program to check whether the given number is positive,
// zero or negative. (Hint: use if-else conditions)
public class Program3 {
    public static void main(String[] args) {
        int No = -100;

        // checking condition zero, Positive or Negative numbers
        if (No == 0) {
            System.out.println("Number is Zero");
        } else if(No >= 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }
}

