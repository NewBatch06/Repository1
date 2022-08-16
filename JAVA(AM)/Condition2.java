class Condition2{

public static void main(String [] args)
{

//if else if condition 
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=scn.nextInt();
System.out.println("Enter 2nd number");
int b=scn.nextInt();
if(a>b){
             System.out.println("a is greater than b"); 

       }else if(b>a)
       {
         System.out.println("b is greater than a");
        }
        else {
               System.out.println("a is equals to b");
           }



}
}