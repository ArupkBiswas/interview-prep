package streams.employeeStreams;

import streams.employeeStreams.mockData.CompanyData;
import streams.employeeStreams.mockData.EmployeeData;

import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {
        //How many employees are there in the organisation?
        //System.out.println("\nTotal Number of employees in the Org : " + numOfEmployees());

        // Sort the List of Employee objects based on salary in descending order
        System.out.println("\nEmployee List based on their salary :\n " + empListSalDesc());

        //How many male and female employees are there in the organization?
        //maleAndFemaleEmployeesCount();

        //Sort the List of Employee objects based on salary in ascending order
        System.out.println("Employee list based on there salary in ascending order"+empSalAscending());

        //DoubleSummeryStatistics implementation for max,min,avg,total,count
        System.out.println("Average salary of each employee: "+employeeStats("avg"));

        //All Employees in each Department
        // listOfEmployeesInEachDepartments();

        //Get the name of all the department
        // getAllDeptName();

        //Find the average salary of the male and female employee
        //averageSalInEachEmployee();

        //Highest Paid Employee
        //highestPaidEmployee();

        //Fetch the highest-paid male and female employee
        //highestPaidMaleAndFemaleEmployee();

        //Fetch the lowest-paid male and female employee
        //lowestPaidMaleAndFemaleEmployee();

        //Get the highest-paid employee in each department
        //highestPaidEmployeeInEachDept();

        //Get the details of the highest paid employee in the organization
        //detailsOfHighestPaidEmployeeInOrg();

        //Find the average salary of each department
        //averageSalInEachDept();

        //Get the details of the youngest male employee in the product development department

        //youngestMaleEmployeeDetailsInPD();

        //Find who has the most working experience in the organization.
        //mostExperiencedEmpDetails();

        //Who is the oldest employee in the organization
        //oldestEmployee();

        //What is the average salary and total salary of the whole organization?
        /*For this query, we use Collectors.summarizingDouble() on Employee::getSalary which will
        return statistics of the employee salary like max, min, average and total.*/
        // -->

        //List down the names of all employees in each department
        /*For this query, we will be using Collectors.groupingBy() method
        by passing Employee::getDepartment as an argument.*/
        // -->

        //Separate the employees who are younger or equal to 30 years from those older than 30 years.
        /*For this query, we will be using Collectors.partitioningBy() method
        which separates input elements based on supplied Predicate.*/
        // -->

    }



    /**
     * This method will return the number of employees in the organization.
     * We will use the count() method of Stream API to get the count of employees.
     */
    private static Integer numOfEmployees() {
        return CompanyData.employeeData().size();
    }

    private static List<Double> empListSalDesc() {
        return CompanyData.employeeData().stream().map(EmployeeData::getSalary).sorted().collect(Collectors.toList());
    }

    private static List<Double> empSalAscending() {
        return CompanyData.employeeData().stream().map(EmployeeData::getSalary).sorted().toList().reversed();
    }

    private static double employeeStats(String ch) {

        DoubleSummaryStatistics empStats = CompanyData
                .employeeData()
                .stream()
                .collect(
                        Collectors.summarizingDouble(EmployeeData::getSalary)
                );

        return switch (ch) {
            case "avg" -> empStats.getAverage();
            case "sum" -> empStats.getSum();
            case "min" -> empStats.getMin();
            case "max" -> empStats.getMax();
            default -> 0.0;
        };
    }

}