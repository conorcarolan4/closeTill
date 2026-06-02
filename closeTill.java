import java.util.Scanner;

public class closeTill
{
    public static void main(String [] args)
    {
        calculations calculations = new calculations();
        Scanner scan = new Scanner(System.in);

        //variables needed for the calculations
        double creditSales;
        double visaCard;
        double lottoPaidOut;
        double voucherSold;
        double voucherRedeemed;
        double driveOff;
        double delayedPayment;
        double shopPurchase;
        double outstandingPayment;
        double creditInternal;
        double fiveC;
        double tenC;
        double twentyC;
        double fiftyC;
        double oneEuro;
        double twoEuro;
        double notes;
        double totalMoney;
        double cashDrop;
        double floatDrop;
        double coinCup;
        double closeFloatTill;
        double recSum;
        double salesSum;
        double fuelPrintOut;
        double shopPrintOut;

        //asking the user for the information needed to ...
        //... complete the calculations
        System.out.println("Please enter below the following information.");
        System.out.println("Credit Sales: ");
        creditSales = scan.nextDouble();
        System.out.println("Visa Card: ");
        visaCard = scan.nextDouble();
        System.out.println("Lotto Paid Out: ");
        lottoPaidOut = scan.nextDouble();
        System.out.println("Vouchers Sold: ");
        voucherSold = scan.nextDouble();
        System.out.println("Vouchers Redeemed: ");
        voucherRedeemed = scan.nextDouble();
        System.out.println("Drive Off: ");
        driveOff = scan.nextDouble();
        System.out.println("Delayed Payment: ");
        delayedPayment = scan.nextDouble();
        System.out.println("Shop Purchase: ");
        shopPurchase = scan.nextDouble();
        System.out.println("Outstanding Payment: ");
        outstandingPayment = scan.nextDouble();
        System.out.println("5c: ");
        fiveC = scan.nextDouble();
        System.out.println("10c: ");
        tenC = scan.nextDouble();
        System.out.println("20c: ");
        twentyC = scan.nextDouble();
        System.out.println("50c: ");
        fiftyC = scan.nextDouble();
        System.out.println("1 euro: ");
        oneEuro = scan.nextDouble();
        System.out.println("2 euro: ");
        twoEuro = scan.nextDouble();
        System.out.println("Notes: ");
        notes = scan.nextDouble();
        System.out.println("Fuel Print Out: ");
        fuelPrintOut = scan.nextDouble();
        System.out.println("Shop Print Out: ");
        shopPrintOut = scan.nextDouble();

        //instantiating variables with methods
        creditInternal = calculations.creditCalculation(creditSales, visaCard, lottoPaidOut, voucherRedeemed, voucherSold, driveOff, delayedPayment, shopPurchase, outstandingPayment);
        totalMoney =  calculations.calculateMoneyTotal(fiveC, tenC, twentyC, fiftyC, oneEuro, twoEuro, notes);
        floatDrop = (calculations.calculateFloatDrop(totalMoney) - 500.00);
        coinCup = calculations.calculateCoinCup(totalMoney);
        cashDrop = calculations.cashDropTotalCalculation(floatDrop);
        closeFloatTill = 500.00 + coinCup;
        recSum = calculations.reconciliationSummary(closeFloatTill, cashDrop, creditInternal);
        salesSum = calculations.salesSummary(fuelPrintOut, shopPrintOut);

        //printing out final values for user to use.
        System.out.println("Credit Internal: " + creditInternal);
        System.out.println("Cash Drops: " + cashDrop);
        System.out.println("Float Drop: " + floatDrop);
        System.out.println("Total Money: " + totalMoney);
        System.out.printf("Coin Cup: %.2f%n", coinCup);
        System.out.printf("Close Float Till: %.2f%n", closeFloatTill);
        System.out.println("Fuel Print Out: " + fuelPrintOut);
        System.out.println("Shop Print Out: " + shopPrintOut);
        System.out.println("Reconcilliation: " + recSum);
        System.out.println("Sales Summary: " + salesSum);
        calculations.shortOverCheck(recSum, salesSum);

        scan.close();
    }
}