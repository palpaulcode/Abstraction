package coderail;

public class PaymentApplication {
    public static void main(final String...args){

        //initialization
        PaymentSystem paymentSystem = new PaymentSystem();

        CommissionEmployee johnSmith = new CommissionEmployee("Joh Smith", 1111, 300.0);
        paymentSystem.addPayee(johnSmith);

        CommissionEmployee paulJones = new CommissionEmployee("Paul Jones", 2222, 350.0);
        paymentSystem.addPayee(paulJones);

        SalaryEmployee maryBrown = new SalaryEmployee("Mary Brown", 3333, 500.0);
        paymentSystem.addPayee(maryBrown);

        SalaryEmployee susanWhite = new SalaryEmployee("Susan White", 4444, 470.0);
        paymentSystem.addPayee(susanWhite);

        //simulate week
        johnSmith.giveCommission(40.0);
        johnSmith.giveCommission(35.0);
        johnSmith.giveCommission(45.0);
        johnSmith.giveCommission(50.0);

        paulJones.giveCommission(45.0);
        paulJones.giveCommission(51.0);
        paulJones.giveCommission(23.0);
        paulJones.giveCommission(57.3);
        paulJones.giveCommission(6.5);

        paymentSystem.processPayment();

    }
}
