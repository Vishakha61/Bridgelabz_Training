
import java.util.*;
class Main{
    public static boolean consecutive(int[] arr,int k){
        Arrays.sort(arr);
         for(int i=0;i<arr.length-1;i++){
          if(arr[i+1]-arr[i]>1){
              return false;
          }
      }
      return arr.length%k==0;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      System.out.println("Enter k value:");
      int k=sc.nextInt();
      System.out.print(consecutive(arr,k));
    }
}