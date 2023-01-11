import java.util.*;
public class arrays {
    /* linear search
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
/* 

      //largest number in a array
public static void largest(int number[]){
int n=Integer.MIN_VALUE;
for(int i=0;i<=number.length-1;i++){
    if(n<number[i]){
        n=number[i];
    }
    }
System.out.println(n);

}
public static void main(String args[]){
    int number[]={44,77,101,700,99};
    largest(number);
    
      }
    }*/
//BINARY SERACH
/*  
public static int binary(int num[],int key){
  int mid;
   int start=0;
   int end=num.length-1;
   while(start<=end){

    mid=((start+end)/2);

    if( num[mid]<key){
        start=mid+1;
    }
    if(num[mid]>key){
        end=mid-1;
    }
    if(num[mid]==key){
       return mid;
        
    }
    
  }
  return -1;
}
public static void main(String args[]){
int num[]={2,4,6,8,10,12,14};
int key=10;

int search=binary(num,key);
System.out.println(search);
}   
} 
 */

/*
 //REVERSE OF ARRAY
public static void reverse(int num[]){
  int temp;
  int start=0;
int end=num.length-1;
  while(start<end){
    temp=num[end];
    num[end]=num[start];
    num[start]=temp;
    start++;
    end--;
  }
}
public static void main(String args[]){
int num[]={2,4,6,8,10};
reverse(num);
for(int i=0;i<num.length;i++){
System.out.print(num[i]+ " ");
}
}

}
*/
// print total no of pairs in an array
/* 
public static void pairs(int num[]){
for(int i=0;i<=num.length-1;i++){
  for(int j=i+1;j<=num.length-1;j++){
    System.out.print("("+num[i]+","+num[j] +")");
  }
  System.out.println();
}
}
public static void main(String args[]){
int num[]={2,4,6,8,10};
pairs(num);
}
*/

//PRINTING SUBARRAY
/* 
public static void  subarrays(int num[]){
  for(int i=0;i<num.length;i++){

    for(int j=i+1;j<num.length;j++){
      int sum=0;
      for(int k=i;k<=j;k++){
        System.out.print( num[k]+" ");
        sum=sum+num[k];
      }
      //for(int l=i;l<=j;j++){
       //sum= sum+num[l];
      //}
      System.out.print("(sum is "+ sum+")");
      System.out.print(" "); 
    }
    System.out.println();
  } 

  
} 

public static void main(String args[]){
  int num[]={2,4,6,8,10};
  subarrays(num);
  }
}
*/
//BRUTE ORCE TECHNIQUE TO FIND MAX SUBARRAY 
/* 
public static void maxsum(int  num[]){
  int maxvalue=Integer.MIN_VALUE;
  int cs=0;
  for(int i=0;i<num.length;i++){
   int start=i;
   for(int j=start;j<num.length;j++){
    int end=j;
    cs=0;
    for(int k=start;k<=end;k++){
      cs +=num[k];
    }
    if(cs>maxvalue){
      maxvalue=cs;
    }
   }

  }
  System.out.println(maxvalue);
}
public static void main(String args[]){
int num[]={1,-2,6,-1,3};
maxsum(num);
}
}
*/
// prefix method to find max sum of subarray 
/* 
public static void prefixsum(int num[]){
  int cs=0;
  int ms=Integer.MIN_VALUE;
  
  int prefix[]=new int[num.length];
  prefix[0]=num[0];
  for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+num[i];
  }
  for(int i=0;i<num.length;i++){
    int start=i;
    cs=0;
    for(int j=i;j<num.length;j++){
    int end=j;
    cs=start==0?prefix[end]:prefix[end]-prefix[start];
    if(cs>ms){
      ms=cs;
    }
    
    }
  }
  System.out.println(ms);
}
public static void main(String args[]){
int num[]={1,-2,6,-1,3};

prefixsum(num);
}
}
*/

//****KADANS METHOD****
/* 
public static void kadans(int num[]){
  int cs=0;
  int ms=Integer.MIN_VALUE;
  for(int i=0;i<num.length;i++){
   cs=cs+num[i];
   if(cs<0){
    cs=0;
   }
   if(cs>ms){
   ms=cs;
  }
  }
 
    System.out.println(ms);

}

public static void main(String args[]){
  int num[]={-2,-3,4,-1,-2,1,5,-3};
  // int num[]=new int [50];
  // Scanner sc=new Scanner (System.in);

  // for(int i=0;i<8;i++){
  //   num[i]=sc.nextInt();
  // }
  kadans(num);
}
}*/

//TRAPPED RAINWATER



/* 
public static void main(String args[]){
  int height[]={4,2,0,6,3,2,5};
  
  System.out.println(trappingwater(height));
}
public static int trappingwater(int height[]){
//leftmax boundary-array
int n=height.length;
    int leftmax[]=new int[n];
    leftmax[0]=height[0];
    for(int i=1;i<n;i++){
    leftmax[i]=Math.max(height[i],leftmax[i-1]);
   }
 //rightmax boundary-array
   int rightmax[]=new int[n];
   rightmax[n-1]=height[n-1];
   for(int i=n-2;i>=0;i--){
   rightmax[i]=Math.max(height[i],rightmax[i+1]);
   }
   //water level
   int trappedwater=0;
   for(int i=0;i<=n-1;i++){
   int waterlevel=Math.min(leftmax[i],rightmax[i]);
    trappedwater=(waterlevel-height[i])+trappedwater;
  }

  //trapped water
 
  return trappedwater;
}
*/
/*
public static void main(String args[]){
  int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
spiral(array);
}

public static void spiral(int arr[][]){
  int n=4,m=4;
  // for(int i=0;i<n;i++){
  // for(int j=0;j<m;j++){
   while(true){
    for(int i=0;i<n;i++){
      System.out.println(arr[0][i]);
    }
    for(int j=1;j<m;j++){
      System.out.println(arr[j][3]);
    }
    for(int i=2;i>=0;i--){
      System.out.println(arr[3][i]);
    }
    for( int j=2;j>=1;j--){
      System.out.println(arr[j][0]);
    }
    
    break;
  }
} */

/*search in sorted matrix 
public static void main(String args[]){
  int array[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
  staircase(array);
}
public static void staircase(int array[][]){
  int i,j;
  int top=0;
  int col=array[0].length-1;
  int row=0;
  System.out.println("enter the key element");
  Scanner sc=new Scanner(System.in);
  int key=sc.nextInt();
  while(row<array.length && col>=0){
  if(key<array[row][col]){
    col--;
  }
  else if(key>array[row][col]){
     row++;}
  else{
    System.out.println("key element is found at position: "+ row+col);
    break;
  }
}

}
*/

public static void main(String args[]){
int arr[]={5,4,3,2,1};
//Scanner sc =new Scanner(System.in);
//for(int i=0;i<5;i++){
 //  arr[i]= sc.nextInt();
//}
insertion(arr);
}
public static void insertion(int arr[]){
  int i;
  for(i=1;i<arr.length;i++)
  {
    int curent=arr[i];
    int previous=arr[i-1];
    int k=i-1;
    int temp;
    while(previous>curent && k>=0 ){
      temp=previous;
      previous=curent;
      curent=temp;
      k--;
    } System.out.println(arr);
  }
 

}
}




































