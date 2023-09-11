public class MonthlySalaryWorker {
    private double annualSalary;

    public MonthlySalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        // Initialize the fields, including the annualSalary
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        // Calculate the weekly pay based on the annual salary
        double weeklyPay = annualSalary / 52; // 52 weeks in a year
        return weeklyPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);

        // Format the weekly pay with two decimal places
        String formattedWeeklyPay = String.format("%.2f", weeklyPay);

        return "Weekly Salary: $" + formattedWeeklyPay;
    }
}