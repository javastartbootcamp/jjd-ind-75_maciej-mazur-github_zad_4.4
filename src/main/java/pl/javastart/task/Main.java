package pl.javastart.task;

import pl.javastart.task.bank.CustomerService;
import pl.javastart.task.bank.Offer;
import pl.javastart.task.bank.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
        //salesRepresentative.config.minRequiredEarnings = 0;

        Offer offer1 = salesRepresentative.createLoanOffer(1_000_000, 1000);

        // to również nie powinno być możliwe
//        offer.valid = true;
//        offer.percentage = -0.5;
//        offer.value = 2_000_000;

        offer1.showOffer();
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer1);
        System.out.println("****************************************");
        Offer offer2 = salesRepresentative.createLoanOffer(1_000_000, 2000);
        offer2.showOffer();
        customerService.payoutOffer(offer2);
    }
}