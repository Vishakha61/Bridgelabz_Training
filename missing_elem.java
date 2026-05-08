import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter no. of elem:");
    int n=sc.nextInt();
    
    int[] arr=new int[n];
    System.out.println("Enter elem:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        if(arr[i+1]-arr[i]>1){
            System.out.print(arr[i]+1 +" ");
        }
    }
    }
}
