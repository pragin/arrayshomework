//   5. Write a Java program to find the common elements
//   between two arrays (string values).
public class CommonElements {
    public static void main(String[] args) {
        String[] countries1 = {"India", "England", "Wales", "USA"};
        String[] countries2 = {"Nepal", "Sri Lanka", "India" ,"England"};

        System.out.println("Common elements in both arrays : ");
        int i = 0;
        while(i < countries1.length){
            int j = 0;
            while(j < countries2.length){
                if(countries1[i] == countries2[j]){

                    System.out.println(countries1[i]);
                }
                j++;
            }
            i++;
        }
    }
}
