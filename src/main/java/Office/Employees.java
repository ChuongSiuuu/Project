package Office;

public class Employees {
    private int id;
    private String Full_name;
    private String birth_date;
    private String gender;
    private String address;
    private String date_join;
    private String phone;
    private String email ;
    private double salary;
    private int managerID;
    private int position;
    private int dept;

    public Employees() {
    }

    public Employees(int id, String full_name, String birth_date, String gender, String address, String date_join, String phone, String email, int salary, int managerID, int position, int dept) {
        this.id = id;
        Full_name = full_name;
        this.birth_date = birth_date;
        this.gender = gender;
        this.address = address;
        this.date_join = date_join;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.managerID = managerID;
        this.position = position;
        this.dept = dept;
    }
}
