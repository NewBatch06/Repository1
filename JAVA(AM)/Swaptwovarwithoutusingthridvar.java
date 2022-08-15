class Swaptwovarwithoutusingthridvar
{




public static void main(String[] args)
{

    int a=200;//100
    int b=100;//200
//op a=100 b=200
       a=a+b;
        b=a-b;
        a=a-b;
      System.out.println("a="+a);
      System.out.println("b="+b);
 

}
}