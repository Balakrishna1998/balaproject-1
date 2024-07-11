import jva.io.*;
class Charectercheck
{
public static void main(String args[])
{
  int a=151;
  String result;

  result=(a%10==a/100)?"palindrome":"not a palindrome";

System.out.println(result);
}
}