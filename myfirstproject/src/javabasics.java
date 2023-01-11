//import java.util.*;
//public class javabasics {
    //public static void main(String args[]){
         /*
1. int a = 10;
                int b=5;int c=5;                System.out.println(a);
                System.out.println(b);
                System.out.println("a");
                String hero="tony stark";
                System.out.println(hero);
        
        
                a=50;
                System.out.println(a);
                a=b;
                 System.out.println(a);
                
        
2.SUM OF TWO NUMBERS
        
                int a=5;
                int b=6;
                int sum=a+b;
                System.out.println(sum);
                */
        //Scanner sc = new Scanner(System.in) ;
           /*  String name=sc.nextLine();
          System.out.println(name);
        */

        /* 
3.product of two numbers

        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        System.out.println(product);
         */

        /* 
4. Area of circle

        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println(area);
        */

        /* 
assigtnment 2
        
Q1.
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println(avg);
        
        Q2.
        float side=sc.nextFloat();
        float area=side*side;
        System.out.println(area);
        
Q3.

        System.out.println("enter price of pencil"); 
        float pencil =sc.nextFloat();
        System.out.println("enter price of pen"); 
        float pen =sc.nextFloat();
        System.out.println("enter price of eraser"); 
        float eraser =sc.nextFloat();
        System.out.println("total price");
        pencil=(float)(pencil+(pencil*0.18));
        pen=(float)(pen+pen*0.18);
        eraser=(float)(eraser+eraser*0.18);
        float price=pencil+pen+eraser;
        System.out.println(price);

 CALCULATOR
        
        system.out.println("enter a");
        int a= sc.nextInt();
        system.out.println("enter b");
        int b= sc.nextInt();
        system.out.println("enter operator");
        char operator=sc.next().charAt(0);
        switch(operator){
          case '+' : System.out.println("Addition of two numbers :" +( a+b));
          break;
          case '-' :System.out.println("subtraction of two numbers :" +(a-b));
          break;
          case '*': System.out.println("multiplication of two numbers :" +(a*b));
          break;
          case '%': System.out.println("remainder of two numbers :" +(a%b));
          break;
          case '/': if(b==0)
          {
            System.out.println("division error:");
          }
          else{
            System.out.println("division of two numbers:" +(a/b));
          }
          
          
          default : System.out.println("wrong input");

        }
      
      System.out.println("enter the number a");
      int a=sc.nextInt();
      if(a>0){
        System.out.println("a is positive");
      }

      else if(a<0){
          System.out.println("a is negative");
        }
      else {
        System.out.println("a is neither positive nor negative");
      }
         
      System.out.println("enter the day(1-7) number of week");
      int number=sc.nextInt();
      switch(number){
        case 1: System.out.println("monday");
        break;
        case 2: System.out.println("TUESDAY");
        break;
        case 3: System.out.println("WEDNESDAY");
        break;
        case 4: System.out.println("THURSDAY");        
        break;
        case 5: System.out.println("FRIDAY");
        break;
        case 6: System.out.println("SATURDAY");
        break;
        case 7: System.out.println("SUNDAY: ENJOY BABY");
        break;
      }
      
       System.out.println("enter the year");
      int year=sc.nextInt();
      if(year%4==0){
        if(year%100==0){
          if(year%400==0){
            System.out.println("leap year");
          }
          else{
            System.out.println("not a leap year");
          }
        }
          else{
            System.out.println("leap year");
          }
        }
          else{
            System.out.println(" not a leap year");
          }
          

PRINTING NUMBER TILL THE USER DOSES NOT ENTER MULTIPLE OF 10;
          while(true){
          System.out.println("enter number");

          int num=sc.nextInt();

          if(num%10 ==0 ){ 
           break;
        }
        


DISPLAY ALL NUMBERS ENTERED BY USER EXCPT MULTIPLKES OF 10
          while(true){
            System.out.print("enter number:");
            int num=sc.nextInt();
            if(num%10==0){
              continue;
            }
            else{
              System.out.println("number was:" + num);
            }
        }
        
        System.out.println("enter number");
        int a=sc.nextInt();
        if(a==2){
          System.out.println("number is prime");
        }
         else {
        for(int i=2;i<=a-1;i++){
          if(a%i==0){
            System.out.println("number is not prime");
            break;
*/
/* 
//inverted star pattern
int n= sc.nextInt();
for(int i=1;i<=n;i++){
   for(int j=n;j>=i;j--){
      System.out.print("*");
   }
   System.out.println();
}
//PRINT CHARACTER PATTERN
int n=4;
char ch='A';
for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++){
    System.out.print(ch);
    ch++;
  }
System.out.println();
}

}
}
*/

// FUNCTIONS AND METHODS

/* 
import java.util.*;
public class javabasics{
  
    System.out.println("hello world");
  }
  public static void main(String args[]){
   printhelloworld();
 }
  MULTIPLE OF TWO NUMBERS

  public static int multiply(int num1,int num2){
    
    int multiply= num1*num2;
    return multiply;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in) ;
    int a=sc.nextInt();
    int b=sc.nextInt();
    int prod=multiply(a,b);

    System.out.println(prod);
}
}
*/

import java.util.*;
public class javabasics{
  /* 
public static int fact(int n) {
  int fact=1;
  for(int i=n;i>=1;i--){
 fact= i*fact;
  }
 return fact;
}
public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
 int n=sc.nextInt();
 int r=sc.nextInt();

   int nfact=fact(n);
   int rfact=fact(r);
   int nmrfact=fact(n-r);
   int binco=nfact/(rfact*nmrfact);
   System.out.println(binco);
}
}
*/
/*FIND PRIME NUMBER
public static boolean isprime(int n){
   boolean isprime=true;
  
  if(n==2){
    isprime=true;
  } 
  else{
  for(int i=2;i<=Math.sqrt(n);i++){
    if(n%i==0){
      isprime=false;
      break;
    }
  }
  }
  return isprime;
}  

public static void main(String args[]){
 boolean i= isprime(17);
System.out.println(i);
}
*/
/* 
FUNCTION ASSIGNMENT
public static float avg( float a,float b,float c){
  float avg= (a+b+c)/3;
  return avg;

}
public static void main(String args[]){

float average=avg(2f,4f,5f);
System.out.println(average);

}

Q 2. public static boolean EVEN(int n){
  boolean EVEN=false;
  if(n%2==0){
    EVEN= true;
  }
  return EVEN;
}
public static void main(String args[]){
 boolean result= EVEN(9);
 System.out.println(result);
}
*/

//Q5. PALINDROME
/* 
public static int pal(int n){
  int sum=0;
  while(n>0){
  int lastdigit=n%10;
  n=n/10;
  sum=(sum*10)+lastdigit;
  }
  return sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if (num==pal(num)){
System.out.println("given number is palindrome");
  }
  else{
    System.out.println("not a palindrome");
  }
}
*/
/* 
PRINT SUM OF DIGIT OF AN INTEGER
public static int sum(int n){
int num= n ;
int lastdigit;
 int sum=0;
while(n>0){
  lastdigit=n%10;
  n=n/10;
  sum=sum+lastdigit;
}
return sum;
}
public static void main(String args[]){
  int add=sum(87537277);
  System.out.println(add);
}
*/
/* 
HOLLOW RECTANGLE
public static void HWRECT(int m,int n){
  for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(i==1||i==m||j==1||j==n){
          System.out.print("*");
        }
          else{
            System.out.print(" ");
          }
      }
      System.out.println();
    }
 }
  public static void main(String args[]){
    HWRECT(12,6);
  }
  */ 
  /* 
  public static void main(String args[]){
    Scanner sc= new Scanner (System.in);

    int m=sc.nextInt();
    int n=sc.nextInt();
    for(int i=1;i<=m;i++){
      for(int j=1;j<=n;j++){
        if(i+j<n+1){
          System.out.print(" ");

        }
        else{
          System.out.print("*");
        }
      }
      System.out.println();
  }
  }
  */
  /* 

INVERTED HALF PYRAMID PATTERN WITH NUMBER
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    for( int i=1;i<=n;i++){
      for(int j=1; j<=n+1-i;j++){
        System.out.print(j);

      }
      System.out.println();
    }
    */
/* 
ZERO ONE TRIANGLE

    public static void zero_one(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          if((i+j)%2==0){
            System .out.print("1");
          }
          else{
            System.out.print("0");
        }
      }
      System.out.println();
    }}
    public static void main(String args[]){
         zero_one(5);
    }

*/
/* 
BUTTERFLY PATTERN
public static void butterfly(int n){
  for(int i=1;i<=n;i++){
  //print star
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
  }
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}
for(int i=n;i>=1;i--){
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }
  for(int j=1;j<=2*(n-i);j++){
    System.out.print(" ");
  }
  for(int j=1;j<=i;j++){
    System.out.print("*");
  }

System.out.println();
}

}
public static void main(String args[]){
butterfly(8);
}

*/
/* 
SOLID RHOMBUS PATTERN
public static void solidrhom(int n){
  for (int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
     System.out.print(" ");
    }
    for(int j=1;j<=n-1;j++){
      System.out.print("*");
    }
    System.out.println();
  }
}
public static void main(String args[]){
  solidrhom(6);
}
*/
/*HOLLOW TITLTED RHOMBUS
public static void hollowrhom(int n){ 
for(int i=1;i<=n;i++){
  for(int j=1;j<=(n-i);j++){
    System.out.print(" ");
  }
  for(int j=1;j<=n;j++){
    if(i==1||i==n||j==1||j==n){
      System.out.print("*");
    }
    else{
      System.out.print(" ");
    }
  }
System.out.println();
}
}

public static void main(String args[]){
  
hollowrhom(5);
}
*/
/*DIAOMOND PATTERN
public static void diamond(int n){
for(int i=1;i<=n;i++){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  for(int j=1;j<=2*i-1;j++){
    System.out.print("*");
  }
  System.out.println();
}
for(int i=n;i>=1;i--){
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  for(int j=1;j<=2*i-1;j++){
    System.out.print("*");
  }
  System.out.println();
}
}
public static void main(String args[]){
  diamond(4);
}
*/

/* 
//NUMBER PYRAMID
public static void numpyramid(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
      System.out .print(" ");
    }
    for(int j=1;j<=i;j++){
       System.out.print(i);
       System.out.print(" ");
    }
    System.out.println();
  }
}
public static void main(String args[]){
  numpyramid(6);
}
*/

/*ARRAYS


public static void update(int marks[]){
  for(int i=0;i<marks.length;i++){
    marks[i]=marks[i]+1;
  }

}
public static void main(String args[]){
  int marks[]={77,83,95};
update(marks);
for(int i=0;i<marks.length;i++){
System.out.println(marks[i]);
}
System.out.println();
}
}
*/
/*LINEAR SEARCH
public static int linearsearch(int number[],int key){
  for(int i=0;i<number.length;i++){
    if(number[i]==key){
    return i;
    }
  }
  return -1;
}
public static void main (String args[]){
  int number[]={1,2,3,4,};
  int key=3;
  int sort=linearsearch(number,key);

  if(sort==-1){
    System.out.println("not found");
  }
  else{
    System.out.println("found at"+ sort);
  }
}
}
*/
}









