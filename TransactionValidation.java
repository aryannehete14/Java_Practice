public class TransactionValidation {
    public static void main(String[] args) {

        double balance = 50000;
        double amount = 12000;
        double dailyLimit = 15000;

        // Step 1 : Validation

        if (amount > balance) {
            System.out.println("Transaction Failed : Insufficient Balance.");

        } else if (amount > dailyLimit) {
            System.out.println("Transaction Failed : Exceeds Daily Limit");
        } else {
            // Step 2 : Charge Calculation
            double charge = 0;

            if (amount > 10000) {
                charge = amount * 0.02; // 2% charge
            }

            double totalDeducted = amount + charge;
            double remainingBalance = balance - totalDeducted;

            // Step 3 : Output
            System.out.println("Transaction Approved");
            System.out.println("Charge Applied : " + charge);
            System.out.println("Total Deducted : " + totalDeducted);
            System.out.println("Remaning Balance : " + remainingBalance);
        }
    }

}
