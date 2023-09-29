package pl.javastart.task.bank;

public class SalesRepresentative {

    private Config config;

    public SalesRepresentative() {
        this.config = new Config();
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        if (earnings >= config.getMinRequiredEarnings()) {
            boolean valid = true;
            double percentage = config.getPercentage();
            return new Offer(valid, requestedAmount, percentage);
        }
        return new Offer();  // przeładowany konstruktor ustawiający valid jako false
    }

}
