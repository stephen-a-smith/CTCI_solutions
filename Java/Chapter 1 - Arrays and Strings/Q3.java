/**
* Create a function to replace all spaces in a string with %20
*/
public class Q3 {
    public static void main(String[] args){
        test_fn();
    }

    public static void test_fn(){
        String[] inputs = {"String to test",
                           "one two  three   ",
                           "teststring",
                           " test string "};
        String[] outputs = {"String%20to%20test",
                            "one%20two%20%20three%20%20%20",
                            "teststring",
                            "%20test%20string%20"};

        for(int i = 0; i < inputs.length; i++){
            if(!urlify(inputs[i]).equals(outputs[i])){
                System.out.println("Test Failed");
                return;
            }
        }
        System.out.println("Test Passed");
    }
    /**
    * Quick function to replace all spaces in a string with " "
    * @param str - String to be modified
    * @return The modified String
    */
    public static String urlify(String str){
        return str.replace(" ", "%20");
    }
}
