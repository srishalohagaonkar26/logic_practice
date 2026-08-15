import java.util.*;

class LB2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the marks of subjects : ");
        int SubMarks1 = sobj.nextInt();
        int SubMarks2 = sobj.nextInt();
        int SubMarks3 = sobj.nextInt();
        int SubMarks4 = sobj.nextInt();
        int SubMarks5 = sobj.nextInt();

        if (SubMarks1 < 35) 
        {
            System.out.println("Failed");    
        }
        else if (SubMarks2 < 35) 
        {
            System.out.println("Failed");    
        }
        else if (SubMarks3 < 35) 
        {
            System.out.println("Failed");    
        }
        else if (SubMarks4 < 35) 
        {
            System.out.println("Failed");    
        }
        else if (SubMarks5 < 35) 
        {
            System.out.println("Failed");    
        }

        int iAverage = 0;
        iAverage = (SubMarks1 + SubMarks2 + SubMarks3 + SubMarks4 + SubMarks5) / 5;

        if (iAverage >= 75) 
        {
            System.out.println("Passed with distinction");    
        }
        else if (iAverage >= 60) 
        {
            System.out.println("Passed with first class");    
        }
        else if (iAverage >= 50) 
        {
            System.out.println("Passed with second class");    
        }
        else if (iAverage < 50) 
        {
            System.out.println("Passed");    
        }

        System.out.println("Total marks : "+iAverage);
    }
}