import java.util.*;

public class strings {
    public static void main(String args[]) {
        // String str1="abcd";
        // String str2=new String ("abcd");
        // System.out.println(str1+"|"+str2);
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        // ***concatenation***
        /*
         * String firstname="nishant kumar";
         * String lastname="jha";
         * String fullname=firstname+" "+lastname;
         * System.out.println(fullname);
         * char ch=fullname.charAt(8);
         * System.out.println(ch);
         * for(int i=0;i<fullname.length();i++){
         * System.out.println(fullname.charAt(i));
         * }
         */

        // String is a palindrome

        Scanner sc = new Scanner(System.in);
      /*   String name = "noon";
        
        System.out.println(palindrome(name));
    }

    public static int palindrome(String name) {
        int n = name.length();

        for (int i = 0; i <= n / 2; i++) {
            if (name.charAt(i) != name.charAt(n - i - 1)) {

                return 0;
            }

        }
        return 1;
    }
    */

//shortest path
/* 

String path="WNEENESENNN";

System.out.println(path(path));
}

public static double path (String path){
    int x=0,y=0;
    for(int i=0;i<path.length();i++){
        if(path.charAt(i)=='N'){
            y++;
        }
        if(path.charAt(i)=='S'){
            y--;
        }
        if(path.charAt(i)=='E'){
            x++;
        }
        if(path.charAt(i)=='W'){
            x--;
        }
    }
    int X=x*x;
    int Y=y*y;
    return Math.sqrt(X+Y);
}*/



/*substring 

String name="nishant";

int start=sc.nextInt();
int end=sc.nextInt();
substring(name,start,end);
}
public static void substring(String name,int start,int end) {
String sub="";


for(int i=start;i<=end;i++){
sub+=name.charAt(i);
}
System.out.println(sub);

*/

    
}
}
