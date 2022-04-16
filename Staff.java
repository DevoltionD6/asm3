import java.sql.Date;

public abstract class Staff {
    private String staffID; // id nhan vien
    private String name;
    private int age;
    private double coefSalary; // hệ số lương
    private Date startDate; // ngày bắt đầu làm việc
    private String departmentName; // tên bộ phận
    private long salary; // lương

    public Staff(String staffID, String name, int age, double coefSalary, Date startDate,
            String departmentName) {
        this.staffID = staffID;
        this.name = name;
        this.age = age;
        this.coefSalary = coefSalary;
        this.startDate = startDate;
        this.departmentName = departmentName;
    }

    public Staff(String staffID2, String name2, int age2, double coefSalary2, Date startDate2, String departmentName2,
            long salary2) {

    }

    public String getStaffID() {
        return this.staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCoefSalary() {
        return this.coefSalary;
    }

    public void setCoefSalary(double coefSalary) {
        this.coefSalary = coefSalary;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public long getSalary() {
        return this.salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public abstract void displayInformation();

}
