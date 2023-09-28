package pl.javastart.task;

import pl.javastart.task.bank.CustomerService;

public class Main {
    public static void main(String[] args) {
        //SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
        //salesRepresentative.config.minRequiredEarnings = 0;

        //Offer offer = salesRepresentative.createLoanOffer(1_000_000, 1000);  -
        // może się mylę, ale uważam, że powyższe polecenie również nie powinno być z tego poziomu dla usera możliwe do wykonania

        // to również nie powinno być możliwe
//        offer.valid = true;
//        offer.percentage = -0.5;
//        offer.value = 2_000_000;

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(1_000_000, 2000);
        System.out.println("**********************************************");
        customerService.payoutOffer(1_000_000, 1000);
    }
}