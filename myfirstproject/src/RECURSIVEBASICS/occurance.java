package RECURSIVEBASICS;

public class occurance {
    public static void main(String args[]){
      int key=10;
      int arr[]={1,2,5,6,7,3};
      int i=0;
      int position=occurance(key,arr,i);
      System.out.println(position);

    }
    public static int occurance(int key,int arr[],int i){
        if(i==arr.length){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
         
        return occurance(key,arr,i+1);

    }
}
