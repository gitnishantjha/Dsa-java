
package DivideAndConquer;
import java.util.*;

public class arr {
    
        public static void main(String args[]){
            System.out.println("enter size of array");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int q=largest(arr,n);
            System.out.println(q);
        }
        
        public static  int largest(int arr[],int n)
        {
            int temp=0;
            for(int i=0;i<n;i++){
                if(arr[i]>temp){
                    temp=arr[i];
                }
            }
            return temp;
        }
    }