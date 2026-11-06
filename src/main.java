

public class main {

    public static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }

        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {

        int number = 12321;

        if (number == reverse(number, 0)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}


