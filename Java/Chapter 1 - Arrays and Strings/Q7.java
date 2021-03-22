import java.util.Arrays;

/**
 * Given and image represented by an NxN matrix, where each pixel in the image 
 * is 4 bytes, write a method to rotate the image by 90 degrees
 * 
 * Can you perform this operation in place?
 */
class Q7 {
  public static void main(String... args){
    Pixel[][] input = {{new Pixel(new byte[]{0x1, 0x2, 0x3, 0x4}), new Pixel(new byte[]{0x5, 0x6, 0x7, 0x9})},
                       {new Pixel(new byte[]{0x9, 0xa, 0xb, 0xc}), new Pixel(new byte[]{0xd, 0xe, 0xf, 0x0})}};
    Matrix matrix = new Matrix(input);
    
    //Demonstrate functionality
    matrix.print();
    matrix.rotate();
    System.out.println();
    matrix.print();
    
  }
}

class Matrix {
  Pixel[][] data;
  
  public Matrix(Pixel[][] data){
    this.data = data;
  }

  public void rotate(){
    for(int i = 0; i < data.length/2; i++){
      int first = i;
      int last = data.length - i - 1;
      for(int j = first; j < last; j++){
        int offset = j - first;
        //store top
        Pixel top = data[first][j];
        //left → top
        data[first][j] = data[last-offset][first];
        //bottom → left
        data[last-offset][first] = data[last][last-offset];
        //right → bottom
        data[last][last-offset] = data[j][last];
        //top -> right
        data[j][last] = top;
      }
    }
  }

  public void print(){
    for(Pixel[] x : data){
      for(Pixel e : x){
        for(byte b : e.getData()){
          System.out.printf("%d", Byte.toUnsignedInt(b));
        }
        System.out.print("\t");
      }
      System.out.print("\n");
    }
  }
}

class Pixel {
  final byte[] data;
  public Pixel(byte[] data){
    this.data = data;
  }
  public byte[] getData(){
    return data;
  }
}