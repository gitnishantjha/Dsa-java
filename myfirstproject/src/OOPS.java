public class OOPS {
    public static void main (String args[]){
        pen p1= new pen();
        p1.setcolor("blue");
         System.out.println(p1.color);
    }
}
class pen{
    String color;
    int tip; 
    void setcolor(String newcolor){
        color=newcolor;

    }
    void settip(int newtip){
        tip=newtip;
    }
}