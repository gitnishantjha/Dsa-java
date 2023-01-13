package RECURSIVEBASICS;

public class sum {
    public static void main(String args[]){
        int n=4;
       int sum= sumnum(n);
System.out.println(sum);
    }
    public static int sumnum(int b){
        int sum=0;
        if(b==1){
       return 1;

        }
         sum= sum+ b+sumnum(b-1);
         
    return sum;

    }
    
}
