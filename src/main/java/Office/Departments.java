package Office;

public class Departments {
    private int Dept_id;
    private String Dept_name;

    public Departments() {
    }

    public Departments(int dept_id, String dept_name) {
        Dept_id = dept_id;
        Dept_name = dept_name;
    }

    public int getDept_id() {
        return Dept_id;
    }

    public void setDept_id(int dept_id) {
        Dept_id = dept_id;
    }

    public String getDept_name() {
        return Dept_name;
    }

    public void setDept_name(String dept_name) {
        Dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Departments[" +
                "Dept_id=" + Dept_id +
                ", Dept_name='" + Dept_name + '\'' +
                ']';
    }
}
