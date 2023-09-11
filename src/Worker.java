public class Worker {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            return regularPay + overtimePay;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "Weekly Pay: $" + String.format("%.2f", weeklyPay);
    }

    public String formalName() {
        return title + " " + firstName + " " + lastName;
    }
}