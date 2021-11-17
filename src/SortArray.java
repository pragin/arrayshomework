// 2. WAP to enter array and sort the values in ascending order

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {2,5, 1, 4, 3};
        //Print array before sorting
        System.out.print("Array before sorting: " );
        int m = 0;
        while(m < arr.length)
        {
            System.out.print( arr[m] + " ");
            m++;
        }
//      Print array after sorting
        System.out.println();
        System.out.print("Array after sorting : ");
        orderArray(arr);

    }


    //This method uses bubble sort algorithm to sort an array in ascending order
    private static void orderArray(int[] arr) {
        int len = arr.length;
        int temp = 0;
        int k = 0;
        while(k < len){
            int l = 1;
            while(l < (len -1)){
                if(arr[l-1] > arr[l]){
                    temp = arr[l-1];
                    arr[l-1] = arr[l];
                    arr[l] = temp;
                }
                l++;
            }
            k++;
        }
//      Print sorted array
        int itr = 0;
        while(itr<arr.length){
            System.out.print(arr[itr] + " ");
            itr++;
        }
    }
}
