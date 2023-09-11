public class PersonWorker extends Person {
    private double hourlyPayRate;

    public PersonWorker(String firstName, String lastName, String ID, int YOB, double hourlyPayRate) {
        super(); // Provide an empty string for title or use a default value
        this.hourlyPayRate = hourlyPayRate;
    }

    public PersonWorker(String firstName, String lastName, String title, int yearOfBirth) {
        super();
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
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
        }

        double totalPay = regularPay + overtimePay;

        return "Regular Pay (40 hours): $" + regularPay + "\n" +
                "Overtime Pay: $" + overtimePay + "\n" +
                "Total Pay: $" + totalPay;
    }
}