import java.util.Scanner;

public class RewardValue {
    private double conversionRate = 0.0035;

    public static void main(String[] args) {
        RewardValue myClass = new RewardValue();
        myClass.calculateValues();
    }

    public void calculateValues() {
        int cashValue = getCashValue();
        int milesValue = getMilesValue();

        convertCashValue(milesValue);
        convertMilesValue(cashValue);
    }

    public int getCashValue() {
        System.out.println("Enter cash value: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getMilesValue() {
        System.out.println("Enter miles value: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void convertCashValue(int milesValue) {
        double cashConversionTotal = milesValue * conversionRate;
        System.out.println(milesValue + " miles would get you £" + cashConversionTotal);
    }

    public void convertMilesValue(int cashValue) {
        double milesConversionTotal = cashValue / conversionRate;
        System.out.println("£" + cashValue + " would get you " + milesConversionTotal + " miles");
    }
}
