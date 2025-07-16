package streams.employeeStreams.mockData;

import java.util.ArrayList;
import java.util.List;

public class CompanyData {
    public List<EmployeeData> employeeData() {
        List<EmployeeData> data = new ArrayList<>();
        data.add(new EmployeeData(23, "Aman", 24, "Male", "Engineering", 2020, 30000));
        return data;
    }
}
