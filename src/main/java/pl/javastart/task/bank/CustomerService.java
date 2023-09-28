package pl.javastart.task.bank;

public class CustomerService {
    public void payoutOffer(int requestedAmount, int earnings) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(requestedAmount, earnings);

        if (offer.isValid()) {
            System.out.printf("Wypłacono %.2f zł\n", offer.getValue());
            System.out.printf("Do zwrotu będzie %.2f zł\n", (offer.getPercentage() + 1) * offer.getValue());
        } else {
            System.out.println("Odmowa wypłaty");
        }
    }
}
