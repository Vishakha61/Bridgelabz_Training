import java.util.*;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String");
    
    String str=sc.next();
   
    HashMap<Character,Integer> map=new HashMap<>();
    for(char i:str.toCharArray()){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(char x:map.keySet()){
        int count=map.get(x);
        if(count==1){
            System.out.print(x);
            break;
        }
    }
    }
}