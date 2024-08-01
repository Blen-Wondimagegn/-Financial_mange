package fms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CSVReader2 {
    public static List<Employee> readEmployeeFromCsv(String file){
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine(); // Skip header line
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                double salary = Double.parseDouble(values[2]);
                String position = values[3];
                String department = values[4];
                double hourlyRate = Double.parseDouble(values[5]);
                employees.add(new Employee(id, name, salary, position, department, hourlyRate));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
