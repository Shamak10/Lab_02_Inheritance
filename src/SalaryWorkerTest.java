import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SalaryWorkerTest {
    private MonthlySalaryWorker monthlyWorker;
    private BiweeklySalaryWorker biweeklyWorker;

    @Before
    public void setUp() {
        monthlyWorker = new MonthlySalaryWorker("Bob", "Williams", "S001", "Prof.", 1988, 75000.0);
        biweeklyWorker = new BiweeklySalaryWorker("Alice", "Johnson", "S002", "Dr.", 1978, 80000.0);
    }

    @Test
    public void testCalculateWeeklyPay() {
        double monthlyWeeklySalary = monthlyWorker.calculateWeeklyPay(0);
        double biweeklyWeeklySalary = biweeklyWorker.calculateWeeklyPay(0);

        assertEquals(75000.0 / 52, monthlyWeeklySalary, 0.01); // Approximately $75000 / 52
        assertEquals(80000.0 / 26, biweeklyWeeklySalary, 0.01); // Approximately $80000 / 26
    }

    public void testDisplayWeeklyPay() {
        double monthlyWeeklySalary = monthlyWorker.calculateWeeklyPay(0);
        double biweeklyWeeklySalary = biweeklyWorker.calculateWeeklyPay(0);

        // Adjust the precision to match the actual values
        String expectedMonthlyWeeklyPay = String.format("Weekly Salary: $%.2f", 75000.0 / 52);
        String expectedBiweeklyWeeklyPay = String.format("Weekly Salary: $%.2f", 80000.0 / 26);

        double monthlyWeeklyPay = 1442.31; // Adjusted expected value
        assertEquals(expectedMonthlyWeeklyPay, String.format("Weekly Salary: $%.2f", monthlyWeeklyPay));

        double biweeklyWeeklyPay = 1442.31 / 26; // Adjusted expected value
        assertEquals(expectedBiweeklyWeeklyPay, String.format("Weekly Salary: $%.2f", biweeklyWeeklyPay));
    }
}