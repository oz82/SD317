public class Student {
    public String ID;
    public String name;
    public Department department;
    public String registDate;

    public Student(String ID, String name, Department department, String registDate) {
        if (ID.equals("0000")) {
            System.out.println("Hatali ID nedeniyle nesne olusturulamadi!");
            return;
        }
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.registDate = registDate;
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

    public String getRegistDate() {
        return registDate;
    }

    public void setRegistDate(String registDate) {
        this.registDate = registDate;
    }

    @Override
    public String toString() {
        return ID + ":" + name + "@" + department;
    }
}