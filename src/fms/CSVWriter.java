package fms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {

    public static void writeEmployeesToCSV(List<Employee> employees, String file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("id,name,salary,postiion,department,hourly_rate");
            bw.newLine();
            for (Employee e : employees) {
                bw.write(String.format("\"%d,%s,%.2f,%s,%s,%.2f\"",
                        e.getId(),
                        e.getName(),
                        e.getSalary(),
                        e.getPosition(),
                        e.getDepartment(),
                        e.getHourly_rate()));
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

