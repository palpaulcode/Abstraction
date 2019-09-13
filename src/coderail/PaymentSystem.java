package coderail;

import java.util.ArrayList;
import java.util.List;

public class PaymentSystem {
    private List<Payee> payees;

    public PaymentSystem(){
        payees = new ArrayList<>();
    }

    public void addPayee(Payee payee){
        if (!payees.contains(payee)){
            payees.add(payee);
        }
    }

    public void processPayment(){
        for (Payee payee : payees){
            double grossPayment = payee.grossPayment();
            System.out.println("paying to " + payee.name());
            System.out.println("\tGross\t " + grossPayment);
            System.out.println("\tTransferred to Account : " + payee.bankAccount());
        }
    }
}
