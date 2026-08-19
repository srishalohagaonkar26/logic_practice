import java.util.Scanner;

class LB14
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);
        
        int iBudgetAmount = 0;
        int iNoofitemsN = 0;
        int iItemPrice = 0;
        int iRemainingBalance = 0;
        int iItemTotal = 0;
        System.out.println("Enter budget amount : ");
        iBudgetAmount = sobj.nextInt();

        System.out.println("Enter the no.of items you took : ");
        iNoofitemsN = sobj.nextInt();

        int i = 0;
        while(i < iNoofitemsN)
        {
            System.out.println("Enter the all item prices : ");
            iItemPrice = sobj.nextInt();
            iItemTotal = iItemTotal + iItemPrice;
            i = i + 1;
        }

        iRemainingBalance = (iBudgetAmount - iItemTotal);
        if (iRemainingBalance < 0) 
        {
            System.out.println("Insufficient balance");
            return;    
        }
        System.out.println("Your remaining balance is : "+iRemainingBalance);
    }
}