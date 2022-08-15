class Methodoverload1
{

public static double add(int i,int j)
{


return i+j;


}
public static int add(int i,int j)
{


return i+j;
}
public static void main(String[] args){

System.out.println("Starts Main");
System.out.println(add(45,65));
System.out.println(add(54.65,52.76));
System.out.println("Main ends");




}






}