public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String employeeID, String title, int birthYear, double annualSalary) {
        super(firstName, lastName, employeeID, title, birthYear, 0); // Call the constructor of the superclass
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52.0; // Weekly pay is the annual salary divided by 52 weeks
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return "Weekly Salary: $" + calculateWeeklyPay(hoursWorked);
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}