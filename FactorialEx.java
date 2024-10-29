public class FactorialEx{
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 7; 
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}
