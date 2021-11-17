//3. WAP to enter any String and count the total number of 'a' in that String.

public class CountAs {
    public static void main(String[] args) {
        String str = "Sphinx of black quartz, judge my vow";
        int i = 0;
        int count = 0;

        while(i < str.length()){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                count += 1;
            }
            i++;
        }
        System.out.println("Number of character 'a' in the given string = " + count);
    }
}
