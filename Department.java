
public class Department {
    private String departmentID;
    private String departmentName;
    private int numOfMember;

    public Department(String departmentID, String departmentName, int numOfMember) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.numOfMember = numOfMember;
    }

    public String getDepartmentID() {
        return this.departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumOfMember() {
        return this.numOfMember;
    }

    public void setNumOfMember(int numOfMember) {
        this.numOfMember = numOfMember;
    }

    @Override
    public String toString() {
        String infoDepartment = "";
        return infoDepartment += "[" +
                " ID='" + getDepartmentID() + "'" +
                ", Name='" + getDepartmentName() + "'" +
                ", Members='" + getNumOfMember() + "'" +
                "]";
    }

}
