public class SumOfDigits {
    public static int sumDigits(int number) {
        int sum = 0;
        number = Math.abs(number); 

        while (number > 0) {
            sum += number % 10; 
            number /= 10; 
        }
