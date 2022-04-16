
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class HumanResources {
    private static Scanner sc = new Scanner(System.in);
    private static Calendar cal = Calendar.getInstance();
    final static LocalDate today = LocalDate.now(); // lấy ngày hiện tại
    final int currentYear = cal.get(Calendar.YEAR); // lấy năm hiện tại
    static DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private static ArrayList<Staff> staffList = new ArrayList<Staff>();
    private static ArrayList<Manager> managerList = new ArrayList<Manager>();
    private static ArrayList<Department> departmentList = new ArrayList<Department>();
    private static int optionFuntion; // lựa chọn tùy theo chỉ mục

    // tạo nhân viên ban đầu

    public static void main(String[] args) {
        Department teamTechnicians = new Department("TECH", "ky thuat vien", 4);
        Department teamIt = new Department("IT", "Lap trinh vien", 3);
        Department teamMarketing = new Department("MKT", "Truyen thong", 5);
        Department teamSaler = new Department("SALE", "Ban Hang", 3);
        departmentList.add(teamTechnicians);
        departmentList.add(teamIt);
        departmentList.add(teamMarketing);
        departmentList.add(teamSaler);
        double overTime;
        Staff employee1 = new Employee("TE003", "Tran Hao Nam", 29, 2, 22/10/2019, "ky thuat vien", "", 4)
        do {
            optional();
            optionFuntion = checkIntNumber(8, "Luc chon chuc nang");

        } while (true);
    }

    // đưa ra lựa chọn
    public static void optional() {
        System.out.println("Lua Chon");
        System.out.println("1. Hien thi danh sach hien co trong công ty");
        System.out.println("2. Hien thi cac bo phan trong công ty");
        System.out.println("3. Hien thi cac nhan vien theo tung bo phan");
        System.out.println("4. Them nhan vien moi vao cong ty");
        System.out.println("5. Tim kiem thông tin nhan vien theo tên hoac ma nhan vien");
        System.out.println("6. Hien thi bảng luong của nhan vien toan công ty");
        System.out.println("8. Hien thi bang luong theo thu tu giam dan");
        System.out.println("7. Hien thi bang luong theo thu tu tang dan");
        System.out.println("0. Thoat");
        System.out.println(".");
    }

    // lựa chọn sau khi thao tác chức năng
    public static void optionEndFuntion() {
        System.out.println("");
        System.out.println("0. Thoat khoi chuong trinh");
        System.out.println("1. Quay lai menu chinh");
        System.out.println("");
        optionFuntion = checkIntNumber(1, "");
    }

    public static void optionEndFuntion(String mess) {
        System.out.println("");
        System.out.println("0. Thoat khoi chuong trinh");
        System.out.println("1. Quay lai menu chinh");
        System.out.println("2. " + mess);
        optionFuntion = checkIntNumber(2, "");
    }

    //
    //
    //
    // bắt lỗi khi nhập lựa chọn
    public static int checkIntNumber(int maxNumber, String mess) {
        int option;
        while (true) {
            try {
                System.out.print(mess);
                option = sc.nextInt();
                if (option >= 0 && option <= maxNumber) {
                    break;
                }
            } catch (Exception e) {
                sc.next();
                continue;
            }
        }
        return option;
    }

    // overloading
    public static int checkIntNumber(int minNumber, int maxNumber, String mess) {
        int option;
        while (true) {
            try {
                System.out.print(mess);
                option = sc.nextInt();
                if (option > minNumber && option < maxNumber) {
                    break;
                }
            } catch (Exception e) {
                sc.next();
                continue;
            }
        }
        return option;
    }

    public static double checkDoubleNumber(double maxNumber, String mess) {
        double option;
        while (true) {
            try {
                System.out.print(mess);
                option = sc.nextDouble();
                if (option >= 0 && option <= maxNumber) {
                    break;
                }
            } catch (Exception e) {
                sc.next();
                continue;
            }
        }
        return option;
    }

    // overloading
    public static double checkDoubleNumber(double minNumber, double maxNumber, String mess) {
        double option;
        while (true) {
            try {
                System.out.print(mess);
                option = sc.nextDouble();
                if (option > minNumber && option < maxNumber) {
                    break;
                }
            } catch (Exception e) {
                sc.next();
                continue;
            }
        }
        return option;
    }

    // thông báo bắt lỗi
    public static String scannerString(String mess) {
        System.out.print(mess);
        sc.nextLine();
        return sc.nextLine();
    }

    //
    //
    //
    // hiển thị nhân viên - quản lý
    public static void staffDisplay() {
        for (Staff staff : staffList) {
            staff.displayInformation();
        }
        optionEndFuntion();
    }

    // overloading staffDisplay
    // tìm kiếm nhân viên
    public static void staffDisplay(String departmentName) {
        System.out.println("Danh sach tim bang tu khoa: " + departmentName);
        int cout = 0; // đếm xem tim được bao nhiêu từ giống từ khóa tim kiếm
        for (Staff staff : staffList) {
            if (departmentName.equalsIgnoreCase(staff.getDepartmentName())) {
                cout++;
                staff.displayInformation();
            }
        }
        if (cout == 0) {
            System.out.println("Khong tim thay nguoi nao theo ten: " + departmentName);

        }
        optionEndFuntion("Quay lai menu chinh");
    }

    //
    // hiện danh sách các bộ phận trong công ty
    public static String listofDepartment(String mess) {
        System.out.println("Danh sach cac bo phan cua cong ty:");
        String[] departmentName = new String[departmentList.size() + 1]; //
        int i = 0;
        return departmentName[0] = mess;

    }

    public static void managerDisplay() {
        for (Manager manager : managerList) {
            manager.displayInformation();
        }
    }

    //
    //
    //
    // thêm nhân viên - quản lý mới
    public static void addStaff() {
        String date;
        System.out.println("1. Them nhan vien");
        System.out.println("2. Them quan ly");
        System.out.println("Quay ve menu chinh");
        System.out.println("0. Thoat chuong trinh");

    }

}
