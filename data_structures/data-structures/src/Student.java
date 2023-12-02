public class Student {
    String name;
    String department;

    public Student(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + "@" + department;
    }
}