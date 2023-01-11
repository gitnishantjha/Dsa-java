public class Helloo {
    
    
        public static void main (String args[]){
        Pen p1=new Pen();
        p1.setcolor("blue");
        p1.settip(55);
        System.out.println(p1.getcolor());
        System.out.println( p1.gettip());
        }
    }
    class Pen{
        private String color;
        private int tip;
        String getcolor(){
           return this.color;
        }
        int gettip(){
        return this.tip;
        }
        void setcolor(String newcolor){
            this.color=newcolor;
        }
        void settip(int newtip){
          this.tip=newtip;
        }
    }
    

