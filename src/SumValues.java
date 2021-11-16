//6. WAP to sum values of an int array

public class SumValues {
    public static void main(String[] args) {

        int arr[] = new int[10];
        //Generate 10 randm numbers using random() and store them in int array
        for(int i = 0; i < 10; i++){
             arr[i] = (int)(Math.random() * 100 + 1);
        }
        // Print the array elements
        System.out.print("Array : ");
        int j =0;
        while(j < arr.length){
            System.out.print(arr[j] + " ");
            j++;
        }

//        print the sum of array elements
        System.out.println();
        System.out.print("Sum of array elements : ");
        sumElements(arr);
    }

    //This method calculates the sum of array elements
    private static void sumElements(int[] arr) {
        int sum = 0;
        int k = 0;
        while(k<arr.length){
            sum += arr[k];
            k++;
        }
        System.out.print(sum);
    }
}
