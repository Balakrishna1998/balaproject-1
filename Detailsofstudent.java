import java.util.*;

class Detailsofstudent
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rollno,semester;
String name,branch;
float marks;
char gender;

System.out.println("enter the details of the student");

System.out.println("enter student name");
name =sc.nextLine();

System.out.println("enter student branch");
branch =sc.nextLine();

System.out.println("enter student rollno");
rollno =sc.nextInt();

System.out.println("enter student semester");
semester =sc.nextInt();

System.out.println("enter student marks");
marks =sc.nextInt();

System.out.println("enter student gender");
gender =sc.next().charAt(0);

System.out.println("enter details of student");

System.out.println("enter name="+name);

System.out.println("enter branch="+branch);

System.out.println("enter rollno="+rollno);

System.out.println("enter semester="+semester);

System.out.println("enter semester="+marks);

System.out.println("enter gender="+gender);

}
}

 