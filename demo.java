import java.util.Scanner;
public class demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String");
        String str = sc.nextLine();
        Student s = new Student(num,str);
        s.display();
    }

}
class Student
{
    int num;
    String str;
    Student(int num,String str)
    {
        this.num=num;
        this.str=str;
    }
    void display()
    {
        System.out.println(num+" "+str);
    }


}
