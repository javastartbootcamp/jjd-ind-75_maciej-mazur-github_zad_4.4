package pl.javastart.task.bank;

class SalesRepresentative {

    private Config config;

    SalesRepresentative() {
        this.config = new Config();
    }

    Offer createLoanOffer(int requestedAmount, int earnings) {
        if (earnings >= config.getMinRequiredEarnings()) {
            boolean valid = true;
            double percentage = config.getPercentage();
            return new Offer(valid, requestedAmount, percentage);
        }
        return new Offer();  // przeładowany konstruktor ustawiający valid jako false
    }

}
