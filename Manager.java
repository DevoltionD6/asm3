import java.sql.Date;

public class Manager extends Staff implements ICalculator {
    private String title; // chức vụ

    public Manager(String staffID, String name, int age, double coefSalary, Date startDate, Date endDate,
            String departmentName, String title) {
        super(staffID, name, age, coefSalary, startDate, departmentName);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // lương trách nhiệm
    public double calculateBonus() {
        long bonus = 0;
        return bonus += title.equalsIgnoreCase("Business Leader") ? 8000000
                : (title.equalsIgnoreCase("Project Leader") ? 5000000 : 6000000);

    }

    // tính lương quản lý
    public void calculateSalary() {
        long baseSalary = 5000000;
        double salary = getCoefSalary() * baseSalary;
        setSalary((long) salary);
    }

    @Override
    public void displayInformation() {
        System.out.println("[" + " staffID='" + getStaffID() + ", name='" + getName() + ", age='" + getAge()
                + ", coefSalary='" + getCoefSalary() + ", startDate='" + getStartDate()
                + ", departmentName='" + getDepartmentName() + ", salary='" + getSalary() + "]");
    }
}
