package coderail;

public class SalaryEmployee extends Employee {
    public SalaryEmployee(String name,int bankAccount,double grossWage){
        super(name,bankAccount,grossWage);
    }

    public double grossPayment(){
        return grossWage;
    }
}
