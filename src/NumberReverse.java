//10. WAP to input any file digit number and then reverse the number
public class NumberReverse {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("The reverse of number " + number + " =  "+ reverseNum(number));
    }

    private static int reverseNum(int num){
        int reverse = 0;
        int lastDigit = 0;
        while(num > 0){
            lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num /10;
        }

        return reverse;
    }
}
