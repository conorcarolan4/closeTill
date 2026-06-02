import java.util.Scanner;

public class calculations 
{
    Scanner scan = new Scanner(System.in);

    //calculates the credit section of the till closing procedure
    public double creditCalculation(double creditSales, double visaCard, double lottoPaidOut, double voucherRedeemed, double voucherSold, 
        double driveOff, double delayedPayment, double shopPurchase, double outstandingPayment)
    {
        double total = creditSales + visaCard + lottoPaidOut + voucherRedeemed + driveOff + delayedPayment + shopPurchase + outstandingPayment;
        total -= voucherSold;
        return total;
    }

    //adds up all the different money values to give a total value
    public double calculateMoneyTotal(double fiveC, double tenC, double twentyC, double fiftyC, double oneEuro, double twoEuro, double notes)
    {
        return fiveC + tenC + twentyC + fiftyC + oneEuro + twoEuro + notes;
    }

    //calculates the float drop.
    //float drop should be divisible by 5 and must always leave the till with 500 left over + coin cup ...
    //... i decided to do that in the main as I thought it would be easier.
    public double calculateFloatDrop(double total)
    {
        return Math.floor(total / 5) * 5;
    }

    //calculates coin cup.
    //subtracts the total money from float drop to leave us with the spare change aka coin cup
    public double calculateCoinCup(double total)
    {
        return total - calculateFloatDrop(total);
    }

    //calculates the total value of cash drops including the float drop.
    //since there isnt a set number of cash drops per shift I decided to ask the user how many ...
    //... cash drops they had in their shift and worked from there. not sure if thats the most efficient...
    //... way to do it but its the way I came up with.
    public double cashDropTotalCalculation(double floatDrop)
    {
        System.out.println("Enter Number of Cash Drops: ");
        int cashDropNum = scan.nextInt();
        double cashDropTotal = 0;

        if (cashDropNum > 0)
        {
            for (int i = 0; i < cashDropNum; i++)
            {
                cashDropTotal += scan.nextDouble();
            }
        }
        else
        {
            cashDropNum = 0;
            cashDropTotal = 0;
        }

        return cashDropTotal + floatDrop;
    }

    //adds up all the variables needed for the reconcilliation part of the close procedure.
    //1885.00 is a set number for the till and will never change.
    public double reconciliationSummary(double closeFloatTill, double cashDrop, double credit)
    {
        return 1885.00 + closeFloatTill + cashDrop + credit;
    }

    //adds up all the variables needed for the sales summary part of the close procedure.
    //1885.00 and 500.00 are set values for the till that will never change.
    public double salesSummary(double fuelPrintOut, double shopPrintOut)
    {
        return fuelPrintOut + shopPrintOut + 500.00 + 1885.00;
    }

    //this checks to see if the till is over or under.
    //I used this opportunity to learn about formatting print statements to get the decimals correct.
    public void shortOverCheck(double recSum, double salesSum)
    {   

        if (recSum > salesSum)
        {
            double over = recSum - salesSum;
            over = Math.round(over * 100.0) / 100.0;
            System.out.printf("Over: %.2f%n", over); 
        }
        else if (recSum < salesSum)
        {
            double under = salesSum - recSum;
            under = Math.round(under * 100.0) / 100.0;
            System.out.printf("Short: %.2f%n", under); 
        }
    }
}
