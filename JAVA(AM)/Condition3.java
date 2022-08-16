class Condition3{

public static void main(String [] args)
{

// Nested if condition 
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=scn.nextInt();

if(a%2==0&&a%5==0)
{
      if(a%5==0)
     {
          System.out.println("Number is divisible by 2 & 5 both");
      }else{
             System.out.println("Number is divisible by 2 & but not 5 ");
           }
 }
else{
  System.out.println("Number is not divisible by 2");

}


}
}