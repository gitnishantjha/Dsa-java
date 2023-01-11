public class OOPS5 {
    
public static void main(String args[]) {
    
        Penn p1= new Penn(); 
         p1.setcolor("you became a millionere");
         System.out.println(p1.color);
       }
}
   class Penn{
       String color;
       int tip;
       void setcolor(String newcolor){
       color=newcolor;
   } 
   }

