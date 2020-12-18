import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] a = new int[]{-1,300,14,54,611,-112,324,342,12,6542,576,2,3,-1242,-534,145,145,145};
    int[] b = new int[]{10,9,8,7,6,5,4,3,2,1,0};
    System.out.println(Arrays.toString(b));
    Sorts.bubbleSort(b);
    System.out.println(Arrays.toString(b));
    System.out.println("---------------");
    int[] c = new int[1001];
    for(int i=0;i<c.length;i++){
      c[i]=1000-i;
    }
    System.out.println(Arrays.toString(c));
    Sorts.bubbleSort(c);
    System.out.println(Arrays.toString(c));
  }
}
