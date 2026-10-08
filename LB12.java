import java.util.Scanner;

class LB12
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iMarks = 0;
        int iAttendance = 0;
        int FamIncome = 0;

        System.out.println("Enter your marks percentage : ");
        iMarks = sobj.nextInt();

        System.out.println("Enter your attendance percentage : ");
        iAttendance = sobj.nextInt();

        System.out.println("Enter your family income : ");
        FamIncome = sobj.nextInt();

        if (iMarks >= 80 && iAttendance >= 75 && FamIncome >= 300000) 
        {
            System.out.println("You are eligible for scholarship");
        }
        else
        {
            System.out.println("You are not eligible for this scholarship");
        }
    }
}