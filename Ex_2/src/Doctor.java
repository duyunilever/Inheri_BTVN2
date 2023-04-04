public class Doctor extends Person{
    private String department;
    private double workTime;

    public Doctor() {
    }

    public Doctor(int id, String name, int age, String department, double workTime) {
        super(id, name, age);
        this.department = department;
        this.workTime = workTime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }
}
