import java.io.*;

class Commandline

{
public static void main(String args[])
{

int x,z,y,sum;

x=Integer.parseInt(args[0]);
z=Integer.parseInt(args[1]);
y=Integer.parseInt(args[2]);

sum=x+y+z;

System.out.println(sum);

}
}