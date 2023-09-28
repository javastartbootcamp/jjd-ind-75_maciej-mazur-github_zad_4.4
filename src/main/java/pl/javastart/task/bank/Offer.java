package pl.javastart.task.bank;

class Offer {

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

    public boolean isValid() {
        return valid;
    }

    public double getValue() {
        return value;
    }

    public double getPercentage() {
        return percentage;
    }
}
