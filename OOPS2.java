public class OOPS2 {
    public static void main(String args[]){
    BankAccount myacc=new BankAccount();
    myacc.setpassword("a1b2c3");
    myacc.setusername("nishant");
    System.out.println(myacc.username);
    System.out.println(myacc.password);
    }

}
class BankAccount{
    public String username;
    public String password;
    public void setpassword(String pwd){
        password=pwd;

    }
    public void setusername(String name){
       
        username=name;
    }

}