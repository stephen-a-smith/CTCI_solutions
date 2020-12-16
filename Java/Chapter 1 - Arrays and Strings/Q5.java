/*
 *  Given two strings, write a function to check if they are 1 or 0 edits away
 *  Examples
 *      Pale, ple -> true
 *      pales pale -> true
 *      pale, bale -> true
 *      pale, bake -> false
 */

public class Q5 {

  private boolean oneAway(String s1, String s2){
    int diff = 0;
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    if(s1.length() != s2.length()){
      return oneInsert(s1, s2);
    } else {
      for(int i = 0; i < s1.length(); i++){
        if(s1.charAt(i) != s2.charAt(i)){
          diff++;
        }
      }
    }
    return diff <= 1;
  }

  private boolean oneInsert(String s1, String s2){
    int len = Math.min(s1.length(), s2.length());
    int diff = 0;
    for(int i = 0; i < len-1; i++){
      if(diff == 0){
        if(s1.charAt(i) != s2.charAt(i)){
          diff++;
        } 
      } else {
        if(s1.charAt(i) != s2.charAt(i+1)){
          diff++;
        }
      }
    }
    return diff <= 1;
  }

  private boolean test(){
    String[][] inputs = {{"Pale", "ple"},
                          {"Pales", "pale"},
                          {"pale", "bale"},
                          {"pale", "bake"}};
    boolean[] outs = {true, true, true, false};

    for(int i = 0; i < inputs.length; i++){
      if(oneAway(inputs[i][0], inputs[i][1]) != outs[i]){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    System.out.println(new Q5().test() ? "Pass" : "Fail");
  }
}
