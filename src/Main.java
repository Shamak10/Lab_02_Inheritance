class BiweeklySalaryWorker extends SalaryWorker {
    public BiweeklySalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, annualSalary);
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        // Implement the logic to calculate weekly pay for a biweekly salaried worker
        return getAnnualSalary() / 26; // Assuming 26 biweekly pay periods in a year
    }

    // Use the same access modifier as in the superclass (public)
    @Override
    public double getHourlyPayRate() {
        return 0;
    }

    // Use the same access modifier as in the superclass (public)
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary(); // Call the superclass method
    }
}