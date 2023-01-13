package RECURSIVEBASICS;

public class Pnum {
    public static void main(String args[]){
        int n=5;
        printnumber(n);
        System.out.println();
    }

    public static void printnumber(int a){
      if(a==1){
        System.out.println(a);
        return;
      }
    System.out.println(a);
    a=a-1;
    
    printnumber(a);
    
 
  

    
    }
}
