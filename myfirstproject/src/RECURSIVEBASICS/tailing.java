package RECURSIVEBASICS;

public class tailing {
    public static void main(String args[]){
        int a=2;
        int b=4;
        System.out.println(tailingprb(a,b));  
        
    }
    public static int tailingprb(int a,int b){
        if(b==1||b==2){
            return 1;
        }
        int nm1=tailingprb(a,b-1);
        int nm2=tailingprb(a,b-2);
        int totalWays=nm1+nm2;
        return totalWays;
    }
}
