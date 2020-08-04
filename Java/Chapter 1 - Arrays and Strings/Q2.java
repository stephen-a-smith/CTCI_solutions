import java.util.Arrays;
/**
*   Write a function to determine if two strings are permutations of 
*   each other.
*/
public class Q2{
    public static void main(String[] args){
        test_fn();
    }
    /**
    * Checks to see if two strings are permutations of each other
    * @param s1 - The first String to be checked
    * @param s2 - The second string to be checked
    * @return boolean based on if they are permutations
    */
    public static boolean are_perm(String s1, String s2){
        char[] arr1 = s1.toUpperCase().toCharArray();
        char[] arr2 = s2.toUpperCase().toCharArray();
        //if strings aren't the same length, they cannot be permutations
        if(arr1.length != arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    /**
    * Tests if are_perm is valid and outputs based on results
    */
    public static void test_fn(){
        String[][] testarr = {{"test", "esTT"},
                              {"test", "Test"},
                              {"test", "tesp"},
                              {"abcd", "abc "},
                              {"abcd", "abc"}};
        boolean[] expected_results = {true, true, false, false, false};

        for(int i = 0; i < testarr.length; i++){
            if(are_perm(testarr[i][0], testarr[i][1]) != expected_results[i]){
                System.out.println("Test Failed");
                return;
            }
        }
        System.out.println("Test Passed");
    }
}
