public class OOPS7 {
  public static void main(String args[]){
    BankAccount myacc =new BankAccount();
     myacc.setusername("Nishant");
  System.out.println(myacc.username);
  myacc.setpassword("nkj123");
  System.out.println(myacc.password);
  }  
}
class BankAccount{
     String username;
     private String password;
     void setusername(String name){
    username=name;
    }
  
  void setpassword(String pass){
        password= pass;
    }
    
}
