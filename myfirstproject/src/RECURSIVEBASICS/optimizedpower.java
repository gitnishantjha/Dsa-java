package RECURSIVEBASICS;

public class optimizedpower {
    public static void main(String args[]){
        int a=3;
        int n=5;
        System.out.println(pow(a,n));  
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpow=pow(a,n/2);
        int halfpowsq=halfpow*halfpow;
        if(n%2!=0){
            halfpowsq=a *halfpowsq;
        }
        return halfpowsq;

    }

}
