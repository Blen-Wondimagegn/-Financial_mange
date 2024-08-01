package fms;

import java.util.List;

public class FinancialOperations {
    public static double getHourlyRateSum(List<Employee> employees){
        double sum = 0.0;

        for (Employee employee : employees) {
            sum += employee.getHourlyRate();
        }

        return sum;
    }
}
