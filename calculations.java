public class calculations 
{
    //credit
    private double creditSales;
    private double visaCard;
    private double lottoPaidOut;
    private double voucherSold;
    private double voucherRedeemed;
    private double driveOff;
    private double delayedPayment;
    private double shopPurchase;
    private double outstandingPayment;
    private double creditInternal;

    //money in till
    private double fiveC;
    private double tenC;
    private double twentyC;
    private double fiftyC;
    private double oneEuro;
    private double twoEuro;
    private double notes;

    //cashdrop
    private double cashDrop;

    //reconciliation summary
    private double closeFloatTill;
    
    //sales summary
    private double fuelPrintOut;
    private double shopPrintOut;

    public double creditCalculation()
    {
        double total = creditSales + visaCard + lottoPaidOut + voucherRedeemed + driveOff + delayedPayment + shopPurchase + outstandingPayment;
        total -= voucherSold;
        return total;
    }

    public double calculateMoneyTotal()
    {
        return fiveC + tenC + twentyC + fiftyC + oneEuro + twoEuro + notes;
    }

    public double calculateFloatDrop(double total)
    {
        return total - 500.00;
    }

    public double cashDropTotalCalculation(double floatDrop)
    {
        
    }
}
