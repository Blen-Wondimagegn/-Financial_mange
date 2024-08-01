//package fms;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CSVReader {
//    public static List<Employee> readEmployeesFromCSV(String file){
//        List<Employee> employees = new ArrayList<>();
//
//        try(BufferedReader reader= new BufferedReader(new FileReader(file)){
//            String line;
//            reader.readLine();
//            while ((line = reader.readLine()) != null){
//                String[] parts = line.split(",");
//                if (parts.length == 6) {
//                    int id = Integer.parseInt(parts[0]);
//                    String name = parts[1];
//                    double salary = Double.parseDouble(parts[2]);
//                    String poistion = parts[3];
//                    String department = parts[4];
//                    double hourly_rate = Double.parseDouble(parts[5]);
//                    employees.add(new Employee(id, name, salary, poistion, department, hourly_rate));
//                }
//            }
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        return employees;
//    }
//}
