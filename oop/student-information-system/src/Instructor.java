public class Instructor {
    private String ID;
    private String name;
    private Department department;

    public Instructor(String ID, String name, Department department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}