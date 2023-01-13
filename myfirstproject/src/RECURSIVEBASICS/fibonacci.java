package RECURSIVEBASICS;

public class fibonacci {
    public static void main (String []args){
        int n=6;
        System.out.println( printfibonacci(n));   
       
    }
    public static int printfibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        return printfibonacci(n-1)+printfibonacci(n-2);
    }
}

