package Office;

public class Salary {
    private int emp_id;
    private double ranger;
    private double taxable;
    private int insurance;

    public Salary() {
    }

    public Salary(int emp_id, double ranger, double taxable, int insurance) {
        this.emp_id = emp_id;
        this.ranger = ranger;
        this.taxable = taxable;
        this.insurance = insurance;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getRanger() {
        return ranger;
    }

    public void setRanger(double ranger) {
        this.ranger = ranger;
    }

    public double getTaxable() {
        return taxable;
    }

    public void setTaxable(double taxable) {
        this.taxable = taxable;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Salary[" +
                "emp_id=" + emp_id +
                ", ranger=" + ranger +
                ", taxable=" + taxable +
                ", insurance=" + insurance +
                ']';
    }
}
