import java.util.*;

class LB19
{
    public static void main(String[] A) 
    {
        Scanner sobj = new Scanner(System.in);

        int iTotalWaterUsed = 0;
        int iWeeksLate = 0;
        int iWaterCharges = 0;
        int iPenalty = 0;
        int iFixedMeter = 100;
        int iSlab = 500;
        int iWaterChargesPenalty = 0;

        System.out.println("Enter the total units of water consumed : ");
        iTotalWaterUsed = sobj.nextInt();

        iWaterCharges = iFixedMeter + (iSlab * iTotalWaterUsed);
        System.out.println("Total charges is : "+iWaterCharges);

        System.out.println("Enter how many weeks late you are : ");
        iWeeksLate = sobj.nextInt();

        int iPenaltyPercentage = 0;

        iPenaltyPercentage = iWeeksLate * 2;
        iPenalty = (iWaterCharges * iPenaltyPercentage) / 100;
    
        iWaterChargesPenalty = iWaterCharges + iPenalty;
        System.out.println("Total charges with penalty is : "+iWaterChargesPenalty);
    }
}