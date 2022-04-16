import java.sql.Date;

public class Employee extends Staff implements ICalculator {

    private double overTime;

    public Employee(String staffID, String name, int age, double coefSalary, int i,
            String departmentName, String string, double overTime) {
        super(staffID, name, age, coefSalary, i, departmentName, string, overTime);
        this.overTime = overTime;
    }

    // tính lương nhân viên
    public void calculateSalary() {
        long baseSalary = 3000000;
        double salary = baseSalary * getCoefSalary() + overTime * 200000;
        setSalary((long) salary); // ép kiểu lương về long
    }

    @Override
    public void displayInformation() {
        System.out.println("[" + " staffID='" + getStaffID() + ", name='" + getName() + ", age='" + getAge()
                + ", coefSalary='" + getCoefSalary() + ", startDate='" + getStartDate()
                + ", departmentName='" + getDepartmentName() + ", salary='" + getSalary() + "]");
    }

}