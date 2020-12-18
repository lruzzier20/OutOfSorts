import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp=0;
    int swaps=1;
    int limit=data.length;
    while(swaps>0){
      swaps=0;
      for(int i=0;i+1<limit;i++){
        if(data[i]>data[i+1]){
          temp=data[i];
          data[i]=data[i+1];
          data[i+1]=temp;
          swaps++;
          System.out.println(Arrays.toString(data));
          if(i+2==limit){limit--; System.out.println("limit is now "+limit);}
        }
      }
    }
  }
}
