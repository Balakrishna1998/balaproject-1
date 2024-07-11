import java.io.*;
class Commandlineproduct

{
  public static void main (String args[])
{


int b,c;
float a,product;

a=Float.parseFloat(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);

product=a*b*c;

System.out.println(product);
}
}