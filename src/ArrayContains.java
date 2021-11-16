//7. WAP to test if an array contains specific value
import java.util.Scanner;
public class ArrayContains {
    public static void main(String[] args) {

        //Declare, instantiate and initialise an int array
        int i = 0;
        int[] numArr = new int[10];
        while (i < 10){
            numArr[i] = (int)(Math.random() * 10 +1);
            i++;
        }

        //Get the number from the user to match
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scanner.nextInt();

        System.out.println("The array elements are : ");
        int j = 0;
        while(j < numArr.length){
            System.out.print(numArr[j] + " " );
            j++;
        }
        System.out.println();
        findValue(numArr, num);
    }

    private static void findValue(int[] arr, int num){
        int i = 0;
        boolean contains = false;
        while (i < arr.length){
            if(arr[i] == num){
                contains = true;
                break;
            }
            i++;
        }

        if(contains){
            System.out.format("The array contains the value %d", num);
        }else{
            System.out.format("The array DOES NOT contain the value %d", num);
        }
    }
}
