package Backtracking;

public class permutation {
   public static void main(String args[]){
    String str="abc";
    String ans="";
    permu(str,ans);
   }

   public static void permu(String str,String ans){
    if(str.length()==0){
        System.out.println(ans);
    }
    for(int i=0;i<str.length();i++){
        char curr=str.charAt(i);
        String newstring=str.substring(0, i) +str.substring(i+1);
        permu(newstring,ans+curr);
    }

   
   }

    
}
