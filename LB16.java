import java.util.*;

class LB16
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iDays = 0;
        String WardType = "";
        int iMedicineBill = 0;
        int iConsultationFee = 0;
        String insured = "";

        System.out.println("Enter the no of days : ");
        iDays = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Enter the ward type : ");
        WardType = sobj.nextLine();

        System.out.println("Enter your medicine bill : ");
        iMedicineBill = sobj.nextInt();

        System.out.println("Enter your consultation fee : ");
        iConsultationFee = sobj.nextInt();
        sobj.nextLine();

        System.out.println("Is it insured?");
        insured = sobj.nextLine();

        int iTotalBill = 0;
        int iInsuranceCover = 0;
        int iICUExtra = 0;
        int iPercentCap = 0;

        if (WardType.equalsIgnoreCase("ICU")) 
        {
            iICUExtra = 2000;    
        }
        
        iTotalBill = iConsultationFee + iMedicineBill + (iDays * 600) + iICUExtra;
        System.out.println("Your Total Bill is : "+iTotalBill);

        if(insured.equalsIgnoreCase("Yes"))
        {
            iPercentCap = (iTotalBill * 70) / 100;
            if(iPercentCap < 50000)
            {
                iInsuranceCover = iPercentCap;
            }
            else
            {
                iInsuranceCover = 50000;
            }
        }
        else
        {
            System.out.println(iTotalBill);
        }

        System.out.println("Your Insurance Cover is : "+iInsuranceCover);

        System.out.println("Your Final Bill is : "+(iTotalBill - iInsuranceCover));
    }
}