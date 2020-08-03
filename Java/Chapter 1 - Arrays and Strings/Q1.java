/**
* Q1) Create a function to determine if a string has any duplicate characters in it
*/
public class Q1 {
    public static void main(String[] args){
        test_fn();
    }
    /**
    * This function will test if a string has any duplicate characters.
    * It is only valid for the E-Ascii or Ascii character sets    
    * 
    * @param str the string to be tested 
    * @return true if the string has only unique characters, false if there are any duplicates
    */
    public static boolean is_unique(String str){
        int[] flags = new int[256]; // E-ascii

        //toUpperCase because T and t should still be counted as the same character
        for (char c : str.toUpperCase().toCharArray()){
            flags[c]++;
            if  (flags[c] > 1) {
                return false;
            }
        }
        return true;
    }
    /**
    *    Tests the is_unique function against 11 test cases and prints to terminal if the test is successful
    */
    public static void test_fn(){
        String[] testData = {"test", "tes", "perl", "TesT", "abcdefg", "abcddf", "abbbbcd", "AbCdEfG", "123aaa", "ab11ab", "{}}{"};
        boolean[] testRes = {false, true, true, false, true, false, false, true, false, false, false};
        for(int i = 0; i < testData.length; i++) {
            if(is_unique(testData[i]) != testRes[i]){
                System.out.println("Testing of function failed");
                return;
            }
        }
        System.out.println("Testing successful.");
        return;
    }
}
