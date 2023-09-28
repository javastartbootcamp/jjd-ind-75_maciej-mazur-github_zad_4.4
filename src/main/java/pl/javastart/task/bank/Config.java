package pl.javastart.task.bank;

class Config {
    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    double getPercentage() {
        return percentage;
    }
}
