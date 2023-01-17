package RECURSIVEBASICS;

public class removeduplicate {
  
public static void main(String args[]){
    String str="appnacollege";
  
    
    remDup(str,0,new StringBuilder(""),new boolean[26]);
}
public static void remDup(String str,int i,StringBuilder newstr,boolean map[]){
    if(i==str.length()){
        System.out.println(newstr);
        return;
    }
    else{
       
        char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
          remDup(str,i+1,newstr,map);
        }
        else{
            map[currchar-'a']=true;
            remDup(str, i+1, newstr.append(currchar), map);
        }

    }
}
    
}
