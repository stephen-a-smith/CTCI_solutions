/**
 *  Q4. Given a string, determine if it can be permutated into a palindrome
*/

/** Notice, a palindrome can be defined as 
    -If even number of letters
        -Every Char repeated an even number of times
    -If odd number of letters
        -Every char repeated an even number of times except for 1
*/
public class Q4{
    private boolean isPalindrome(String s){
        s = s.toLowerCase().replace(" ", "");
        int[] flags = new int[26];
        int flag = 0;
        if(s.length() % 2 != 0){flag--;}

        for(char c : s.toCharArray()){
            flags[c - 'a']++; //shortcut to get position in alphabet
        }

        for(int i : flags){
            if(i % 2 != 0){
                flag++;
            }
        }
        return (flag == 0);
    }

    private boolean testfn(){
        String[] inputs = {"racecar",
                            "tteesstt",
                            "Not a palindrome",
                            "not a palindrome",
                            "RACEcar",
                            "UFO Tofu",
                            "Not a Straight One Not A Straight One",
                            "This is a palindrome emordinlap a sisiht",
                            "abba"};
        boolean[] outputs = {true, true, false, false, true, true, true, true, true};

        for(int i = 0; i < inputs.length; i++){
            if(isPalindrome(inputs[i]) != outputs[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Q4 obj = new Q4();
        if(obj.testfn()){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}