package Office;

public class Emp_leaves {
    private int emp_id;
    private String date_join;
    private String date_out;

    public Emp_leaves() {
    }

    public Emp_leaves(int emp_id, String date_join, String date_out) {
        this.emp_id = emp_id;
        this.date_join = date_join;
        this.date_out = date_out;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getDate_join() {
        return date_join;
    }

    public void setDate_join(String date_join) {
        this.date_join = date_join;
    }

    public String getDate_out() {
        return date_out;
    }

    public void setDate_out(String date_out) {
        this.date_out = date_out;
    }

    @Override
    public String toString() {
        return "Emp_leaves[" +
                "emp_id=" + emp_id +
                ", date_join='" + date_join + '\'' +
                ", date_out='" + date_out + '\'' +
                ']';
    }
}
