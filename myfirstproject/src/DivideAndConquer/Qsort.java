package DivideAndConquer;

public class Qsort {
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        quick(arr,0,arr.length-1);
        print(arr);
    }
        public static void print(int arr[]){
            for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }

    
    public static void quick(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
            int pindx=partition(arr,si,ei);
            quick(arr,si,pindx-1);
             quick(arr,pindx+1,ei);
        }
    public static int partition(int arr[],int si,int ei){
        int i=si-1;
        int pivot=arr[ei];
        for(int j=si;j<ei;j++){


        if(arr[j]<pivot){
            i++;
            //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    
}
    }
    

