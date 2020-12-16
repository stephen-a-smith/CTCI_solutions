/**
 * Implement basic string compressions
 * Compression based on repeated characters
 *  aabcccccaaa - > a2b1c5a3
 * only return compressed if shorter than original string
 */
public class Q6 {
    public String compress(String s){
      StringBuilder builder = new StringBuilder();

      int repeat = 0;
      char last = s.charAt(0);
      for(char c : s.toCharArray()){
        if(c == last){
          repeat++;
        } else {
          builder.append(last);
          builder.append(repeat);
          repeat = 1;
          last = c;
        }
      }
      builder.append(last);
      builder.append(repeat);
      return builder.toString().length() <= s.length() ? builder.toString() : s;
    }

    public boolean test(){

      String[] inputs = {"aabcccccaaa"
                        ,"aaaabcdeee"
                        ,"canada"
                        ,"mississippi"};

      String[] outputs = {"a2b1c5a3"
                         ,"a4b1c1d1e3"
                         ,"canada"
                         ,"mississippi"};

      for(int i = 0; i < inputs.length; i++){
        if (!compress(inputs[i]).equals(outputs[i]))
           return false;
      }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new Q6().test() ? "PASS" : "FALSE");
  }
}
