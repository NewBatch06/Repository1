class Condition4{

public static void main(String [] args)
{

 
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter Week number");
int a=scn.nextInt();
//Switch case Statement
//Syntax
    switch(a)
      {
        case 1:
              System.out.println("Today is Sunday");
              break;
        case 2:
              System.out.println("Today is Monday");
               break;
        case 3:
              System.out.println("Today is Tuesday");
               break;
        case 4:
              System.out.println("Today is Wednesday");
               break;
        case 5:
              System.out.println("Today is Thursday");
                break;
        case 6:
              System.out.println("Today is Friday");
                 break;
        case 7:
              System.out.println("Today is Saturday");
              break;
        default:
                  System.out.println("Invalid Week number");
         }



        }
}