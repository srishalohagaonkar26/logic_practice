import java.util.Scanner;

class LB10
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int TotalTax = 0;
        int AnnualIncome = 0;
        AnnualIncome = sobj.nextInt();

        if (AnnualIncome == 250000) 
        {
            System.out.println("Total tax to pay is 0%");   
            TotalTax = TotalTax + 0; 
        }
        else if (AnnualIncome >= 250001 && AnnualIncome <= 500000) 
        {
            System.out.println("Total tax to pay is 5%");   
            TotalTax = TotalTax + 0.05; 
        }
        else if (AnnualIncome >= 500001 && AnnualIncome <= 1000000) 
        {
            System.out.println("Total tax to pay is 20%");  
            TotalTax = TotalTax + 12500.20;  
        }
        else 
        {
            System.out.println("Total tax to pay is 30%");
            TotalTax = TotalTax + 112500;
        }

        System.out.println("Total tax to be paid is : "+TotalTax);
    }
}