package RECURSIVEBASICS;

public class power {
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println( pow(x,n));  
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
 
        }
        int xnm1=pow(x,n-1);
        int xn=x*xnm1;
        return xn;
    }
}
