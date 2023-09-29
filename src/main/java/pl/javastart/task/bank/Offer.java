package pl.javastart.task.bank;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    Offer(boolean valid, double value, double percentage) {
        this.valid = valid;
        this.value = value;
        this.percentage = percentage;
    }

    Offer() {
        this.valid = false;
    }

    boolean isValid() {
        return valid;
    }

    double getValue() {
        return value;
    }

    double getPercentage() {
        return percentage;
    }

    public void showOffer() {
        if (isValid()) {
            System.out.println("Spełnia pan/pani warunki otrzymania kredytu");
            System.out.printf("Oczekiwana kwota kredytu: %.2f zł\n", getValue());
            System.out.printf("Przewidywana kwota do zwrotu to %.2f zł\n", (getPercentage() + 1) * getValue());
        } else {
            System.out.println("Niestety nie spełnia pan/pani warunków otrzymania kredytu");
        }
    }
}
