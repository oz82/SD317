public class Department {
    private String name;
    private String facultyName;

    public Department(String name, String facultyName) {
        this.name = name;
        this.facultyName = facultyName;
    }

    @Override
    public String toString() {
        return name;
    }
}