package RECURSIVEBASICS;
import java.util.*;
public class printinc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
    int a=0;
    printIncNum(x,a);
    }
    public static void printIncNum(int n,int a){
        
        if(n==a){
            System.out.println(n);
            return;
        }
        System.out.println(a);
        printIncNum(n,a+1);
    }
    
}
