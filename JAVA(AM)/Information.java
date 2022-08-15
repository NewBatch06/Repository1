class Information

{

public static void main(String[] args)
{
    java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter the name"); 
   
String name=sc.next();
System.out.println("Enter Age"); 
int age=sc.nextInt();
System.out.println("Enter salary");
double sal=sc.nextDouble(); 
System.out.println("Enter Gender");
  char c=sc.next().charAt(2);
System.out.println("Name:-"+name+",Age:-"+age+ ",Salary="+sal+"gender="+c);
}
}