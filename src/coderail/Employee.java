package coderail;

public abstract class Employee implements Payee {
    private String name;
    private int bankAccount;
    protected double grossWage;

    public Employee(String name, int bankAccount,double grossWage){
        this.name = name;
        this.bankAccount = bankAccount;
        this.grossWage = grossWage;
    }

    public String name(){
        return name;
    }

    public int bankAccount(){
        return bankAccount;
    }
}
