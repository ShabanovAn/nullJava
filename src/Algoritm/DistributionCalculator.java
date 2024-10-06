package Algoritm;

import java.util.ArrayList;
import java.util.List;

public class DistributionCalculator {
    public static void calculateDistribution(List<DetailedPosition> positions, double totalQuantity, double totalPrice) {
        // Calculate the total sum
        double totalSum = totalPrice * totalQuantity;

        // Initialize the distribution of kopeks
        double kopeksDistribution = 0.0;

        // Iterate over the positions
        for (DetailedPosition position : positions) {
            // Calculate the rounded quantity
            double roundedQuantity = round(position.getQuantity(), 10);

            // Calculate the sum for this position
            double sum = round(roundedQuantity * totalPrice, 2);

            // Calculate the distribution of kopeks for this position
            double kopeks = sum - roundedQuantity * totalPrice;

            // Add the kopeks to the total distribution
            kopeksDistribution += kopeks;

            // Set the values for this position
            position.setRoundedQuantity(roundedQuantity);
            position.setSum(sum);
            position.setKopeksDistribution(kopeks);
        }

        // Distribute the remaining kopeks
        for (DetailedPosition position : positions) {
            double proportion = position.getQuantity() / totalQuantity;
            position.setKopeksDistribution(position.getKopeksDistribution() + kopeksDistribution * proportion);
        }
    }

    private static double round(double value, int decimalPlaces) {
        double multiplier = Math.pow(10, decimalPlaces);
        return Math.round(value * multiplier) / multiplier;
    }

    public static void main(String[] args) {
        List<DetailedPosition> positions = new ArrayList<>();

        positions.add(new DetailedPosition("Иванов", 30.88848888));
        positions.add(new DetailedPosition("Петров", 5.88848888));
        positions.add(new DetailedPosition("Сидоров", 5.88848888));
        positions.add(new DetailedPosition("Малевин", 5.88848888));
        positions.add(new DetailedPosition("Макаров", 5.88848888));
        positions.add(new DetailedPosition("Сетченко", 1.88848888));
        positions.add(new DetailedPosition("Козлов", 1.88848888));

        double totalQuantity = 58.21942216;
        double totalPrice = 10.0;

        calculateDistribution(positions, totalQuantity, totalPrice);

        for (DetailedPosition position : positions) {
            System.out.println(position.getName() + ":");
            System.out.println("  Rounded Quantity: " + position.getRoundedQuantity());
            System.out.println("  Sum: " + position.getSum());
            System.out.println("  Kopeks Distribution: " + position.getKopeksDistribution());
            System.out.println();
        }
    }
}

class DetailedPosition {
    private final String name;
    private final double quantity;
    private double roundedQuantity;
    private double sum;
    private double kopeksDistribution;

    public DetailedPosition(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getRoundedQuantity() {
        return roundedQuantity;
    }

    public void setRoundedQuantity(double roundedQuantity) {
        this.roundedQuantity = roundedQuantity;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getKopeksDistribution() {
        return kopeksDistribution;
    }

    public void setKopeksDistribution(double kopeksDistribution) {
        this.kopeksDistribution = kopeksDistribution;
    }
}