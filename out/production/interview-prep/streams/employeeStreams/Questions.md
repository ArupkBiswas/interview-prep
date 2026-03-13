**Q1: How many employees are there in the organisation?**
- [numOfEmployees()](EmployeeStream.java)
  - This method will return the total number of employees in the organisation.
  - It uses the `count()` method of the Stream API to count the number of elements in the stream.

**Q2: Sort the List of Employee objects based on salary in descending order.**
- [empListSalDesc()](EmployeeStream.java)
  - This method will sort the list of employees based on their salary in descending order.
  -     
// Sort the List of Employee objects based on salary in Descending order
//empListSalDesc();

//How many male and female employees are there in the organization?
//maleAndFemaleEmployeesCount();

//Sort the List of Employee objects based on salary in Ascending order
// empSalAscending();

//DoubleSummeryStatistics implementation for max,min,avg,total,count
// employeeStats();

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

youngestMaleEmployeeDetailsInPD();

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
