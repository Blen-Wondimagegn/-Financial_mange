package fms;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    try {
//        fms.Employee emp = new fms.Employee();
        List<Employee> employees = CSVReader2.readEmployeeFromCsv("file.csv");
        System.out.println(employees);
        CSVWriter.writeEmployeesToCSV(employees, "output_employees.csv");

    }catch(IllegalArgumentException exception)
    {
        System.out.println("Invalid Inputs :"+exception.getMessage());
    }

    }

}