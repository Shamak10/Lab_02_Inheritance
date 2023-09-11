import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create an ArrayList to store workers
        ArrayList<Worker> workers = new ArrayList<>();

        // Create 3 Worker instances and add them to the list
        workers.add(new Worker("John", "Doe", "W001", "Mr.", 1985, 20.0) {
            @Override
            public double calculateWeeklyPay(double hoursWorked) {
                return 0;
            }

            @Override
            public String displayWeeklyPay(double hoursWorked) {
                return null;
            }

            @Override
            public String formalName() {
                return null;
            }
        });
        workers.add(new Worker("Jane", "Smith", "W002", "Mrs.", 1990, 18.0) {
            @Override
            public double calculateWeeklyPay(double hoursWorked) {
                return 0;
            }

            @Override
            public String displayWeeklyPay(double hoursWorked) {
                return null;
            }

            @Override
            public String formalName() {
                return null;
            }
        });
        workers.add(new Worker("Alice", "Johnson", "W003", "Dr.", 1978, 22.0) {
            @Override
            public double calculateWeeklyPay(double hoursWorked) {
                return 0;
            }

            @Override
            public String displayWeeklyPay(double hoursWorked) {
                return null;
            }

            @Override
            public String formalName() {
                return null;
            }
        });

        // Create 3 SalaryWorker instances and add them to the list
        workers.add(new SalaryWorker("Alice", "Johnson", "S002", "Dr.", 1978, 80000.0) {
            @Override
            public double calculateWeeklyPay(double hoursWorked) {
                return 1442.3076923076924;
            }

            @Override
            public String formalName() {
                return null;
            }

            @Override
            public double getHourlyPayRate() {
                return 1442.3076923076924;
            }
        });
        workers.add(new SalaryWorker("Alice", "Johnson", "S002", "Dr.", 1978, 80000.0) {
            @Override
            public double calculateWeeklyPay(double hoursWorked) {
                return 1442.3076923076924;
            }

            @Override
            public String formalName() {
                return null;
            }

            @Override
            public double getHourlyPayRate() {
                return 1442.3076923076924;
            }
        });
        workers.add(new SalaryWorker("Alice", "Johnson", "S002", "Dr.", 1978, 80000.0) {
            @Override
            public double calculateWeeklyPay(double hoursWorked) {
                return 1442.3076923076924;
            }

            @Override
            public String formalName() {
                return null;
            }

            @Override
            public double getHourlyPayRate() {
                return 1442.3076923076924;
            }
        });

        // Simulate 3 weekly pay periods
        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");
            System.out.println("==================================");

            for (Worker worker : workers) {
                double hoursWorked;

                if (week == 1) {
                    hoursWorked = 40.0;
                } else if (week == 2) {
                    hoursWorked = 50.0;
                } else {
                    hoursWorked = 40.0;
                }

                System.out.println("Employee: " + worker.formalName());
                System.out.println("Hours Worked: " + hoursWorked + " hours");
                System.out.println("Weekly Pay: $" + worker.calculateWeeklyPay(hoursWorked)); // Pass hoursWorked as double
                System.out.println();
            }
        }
    }
}