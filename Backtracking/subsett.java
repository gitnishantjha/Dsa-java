package Backtracking;

public class subsett {
    public static void main (String args[]){
        String str="abc";
        findsubset(str,"",0);
  
    }
    public static void findsubset(String str,String ans ,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
            }
            return;  
        }
   

        //kaam
        //yes
        findsubset(str,ans+str.charAt(i),i+1);
        //no
        findsubset(str,ans,i+1);
    }
  
}
