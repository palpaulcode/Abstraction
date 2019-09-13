package coderail;

public class CommissionEmployee extends Employee {
    private double grossCommission = 0.0;

    public CommissionEmployee(String name, int bankAccount, double grossWage){
        super(name,bankAccount,grossWage);
    }

    public double grossPayment(){
        return grossWage + doCurrentCommission();
    }

    private double doCurrentCommission(){
        double commission = grossCommission;
        grossCommission = 0.0;
        return commission;
    }

    public void giveCommission(Double amount){
        grossCommission += amount;
    }
}
