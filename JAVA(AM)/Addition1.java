class Addition1{

public static void Addition(int a,int b){

int sum=a+b;
System.out.println("Sum="+sum);

}


public static void main(String[] args)
{
System.out.println("main starts");
java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("Enter 1st number");
    int a=sc.nextInt();
 System.out.println("Enter 2nd number");
    int b=sc.nextInt();
Addition(a,b);
System.out.println("Main ends");
}

}