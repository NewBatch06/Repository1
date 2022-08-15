class Info{

public static String Studentinfo(String name,int age,String sub){

return "Name:-"+name+",Age:-"+age+"Subject:-"+sub;


}


public static boolean M1(boolean status){
return status;

}
//Method Overloading in java
public static double add(double d1,double d2)
{


return d1+d2;


}
public static int add(int i,int j)
{


return i+j;


}
public static int add(int i,int j,int k)
{


return i+j+k;


}
public static void main(String[] args){

System.out.println("Starts main");
String s=Studentinfo("Deeepsh",34,"Science");
System.out.println(M1(true));
System.out.println(add(45.53,65.76));
System.out.println(add(3,5));
System.out.println(add(76,87,34));
System.out.println(s);
System.out.println("ENds main");


}

}