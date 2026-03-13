package streams.employeeStreams.mockData;

import java.util.ArrayList;
import java.util.List;

public class CompanyData {
    public static List<EmployeeData> employeeData() {
        List<EmployeeData> data = new ArrayList<>();
        data.add(new EmployeeData(23, "Aman", 24, "Male", "Engineering", 2020, 40000));
        data.add(new EmployeeData(23, "Ashish", 55, "Male", "Management", 2022, 50000));
        data.add(new EmployeeData(23, "Ramitha", 60, "Female", "HR", 2000, 60000));
        data.add(new EmployeeData(23, "Ashok", 30, "Male", "Engineering", 2005, 20000));
        data.add(new EmployeeData(23, "Naveen", 34, "Male", "Engineering", 2000, 1000000));
        data.add(new EmployeeData(23, "Ruchi", 32, "Female", "Finance", 2023, 10000));
        data.add(new EmployeeData(23, "Pavan", 27, "Male", "Backoffice", 2021, 90000));
        data.add(new EmployeeData(23, "Ross", 28, "Male", "Inventory", 2007, 60000));
        data.add(new EmployeeData(23, "Mike", 45, "Male", "Engineering", 2010, 70000));
        data.add(new EmployeeData(23, "Alen", 54, "Male", "HR", 2025, 80000));
        data.add(new EmployeeData(23, "Roma", 40, "Female", "Engineering", 2024, 300000));
        return data;
    }
}
