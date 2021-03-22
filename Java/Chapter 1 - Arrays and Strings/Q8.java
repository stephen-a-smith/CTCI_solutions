import java.util.Arrays;

/**
 * Write an algorithm such that if an element in an MxN Matrix is 0
 * it's entire row and columm are zeroed
 */
public class Q8 {
  public static void main(String[] args) {
    int[][] m1 ={{1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 0, 1, 2},
                 {3, 4, 5, 6}};
    
    //Demonstrate functionality
    printArray(m1);
    System.out.println();
    printArray(zero(m1));
  }

  public static int[][] zero(int[][] in){
    /*
      copyOf will deepCopy primitive arrays, but since Arrays are not primitive
      we need to perform Arrays.copyOf on each subarray individually
    */
    int[][] out = Arrays.stream(in)
                        .map((int[] e) -> Arrays.copyOf(e, e.length))
                        .toArray(int[][]::new);

    for(int i = 0; i < in.length; i++){
      for(int j = 0; j < in[i].length; j++){
        if(in[i][j] == 0){
          // all x with the y-coord of j
          for(int x = 0; x < in.length; x++){
            out[x][j] = 0;
          }
          // all y with the x coord of i
          for(int x = 0; x < in[i].length; x++){
            out[i][x] = 0;
          }
        }
      }
    }
    return out;
  }

  //for display
  public static void printArray(int[][] matrix){
    for(int[] a: matrix){
      for(int i : a){
        System.out.printf("%d ", i);
      }
      System.out.println();
    }
  }

}
