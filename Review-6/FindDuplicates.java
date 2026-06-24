
import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      HashMap<Integer,Integer> map=new HashMap<>();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      for(int x:arr){
          map.put(x,map.getOrDefault(x,0)+1);
      }
      for(int i:map.keySet()){
          int val=map.get(i);
          if(val>1){
              System.out.print(i+" ");
          }
      }
    }
}