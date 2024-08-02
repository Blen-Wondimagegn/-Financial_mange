package fms;

import java.util.List;

import static fms.FinancialOperations.*;

public class Main {
    public static void main(String[] args) {

    try {
//        fms.Employee emp = new fms.Employee();
        List<Employee> employees = CSVReader2.readEmployeeFromCsv("file.csv");
        System.out.println(employees);
        CSVWriter.writeEmployeesToCSV(employees, "output_employees.csv");
        System.out.println("***********getHourlyRateSum**********");
        System.out.println(getHourlyRateSum(employees));
        System.out.println("***********sum DepartmentSalary**********");
        System.out.println(sumDepartmentSalary(employees, "Finance"));
        System.out.println("***********getAverageSalaryByDepartment**********");
        System.out.println(getAverageSalaryByDepartment(employees, "Finance"));
        System.out.println("***********sumDepartmentHourlyRate**********");
        System.out.println(sumDepartmentHourlyRate(employees, "Finance"));
        System.out.println("***********getAverageHourlyRateByDepartment**********");
        System.out.println(getAverageHourlyRateByDepartment(employees, "Finance"));
        System.out.println("***********getTotalSalaryByDepartment**********");
        System.out.println(getTotalSalaryByDepartment(employees));
        System.out.println("***********getAverageSalaryByDepartment**********");
        System.out.println(getAverageSalaryByDepartment(employees));
        System.out.println("***********getAverageHourlyRateByDepartment**********");
        System.out.println(getAverageHourlyRateByDepartment(employees));



    }catch(IllegalArgumentException exception)
    {
        System.out.println("Invalid Inputs :"+exception.getMessage());
    }

    }

}