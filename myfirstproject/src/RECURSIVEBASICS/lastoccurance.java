package RECURSIVEBASICS;

public class lastoccurance {
    
    public static void main(String args[]){
      int key=3;
      int arr[]={1,2,5,3,6,7,3};
      int i=arr.length-1;
      int position=lastoccurance(key,arr,i);
      System.out.println(position);
}
public static int lastoccurance(int key,int arr[],int i){
    if(i==-1){
        return -1;
    }
    if(key==arr[i]){
        return i;
    }
     
    return lastoccurance(key,arr,i-1);

}
}
