public class Test {
    public static void main(String[] args) {
        Department d1 = new Department("CENG", "ENG");
        Department d2 = new Department("EENG", "ENG");
        Department d3 = new Department("BENG", "ENG");
        Department d4 = new Department("CHNG", "ENG");
        Department d5 = new Department("MENG", "ENG");

        Course c1 = new Course("BM101",
                "Bilgisayar Mühendisliğine Giriş", "Z");
        Course c2 = new Course("EM101",
                "Elektrik Mühendisliğine Giriş", "Z");
        Course c3 = new Course("SD317",
                "Güncel Programlama Dilleri", "S");
        Course c4 = new Course("MM101",
                "Maden Mühendisliğine Giriş", "Z");

        Instructor i1 = new Instructor("01", "Ali", d1);
        Instructor i2 = new Instructor("01", "Ayşe", d2);
        Instructor i3 = new Instructor("01", "Zehra", d3);
        Instructor i4 = new Instructor("01", "Mehmet", d4);

        AssignedCourse ac1 = new AssignedCourse(c1, i1);
        AssignedCourse ac2 = new AssignedCourse(c2, i2);
        AssignedCourse ac3 = new AssignedCourse(c3, i3);
        AssignedCourse ac4 = new AssignedCourse(c4, i4);

        Student s1 = new Student("0001",
                "xyz", d1,
                "23.09.2023");
        Student s2 = new Student("0002",
                "abc", d5,
                "23.09.2023");
        Student s3 = new Student("0002",
                "gsd", d5,
                "23.09.2023");
        Student s4 = new Student("0002",
                "sga", d5,
                "23.09.2023");
        Student s5 = new Student("0002",
                "ghj", d5,
                "23.09.2023");
        Student s6 = new Student("0002",
                "asd", d5,
                "23.09.2023");

        CourseSelection.selectCourse(c1, s1);
        CourseSelection.selectCourse(c1, s3);
        CourseSelection.selectCourse(c1, s4);
        CourseSelection.selectCourse(c1, s6);
        CourseSelection.selectCourse(c2, s1);
        CourseSelection.selectCourse(c2, s2);
        CourseSelection.selectCourse(c2, s3);
        CourseSelection.selectCourse(c2, s4);
        CourseSelection.selectCourse(c2, s5);
        CourseSelection.selectCourse(c2, s6);
        CourseSelection.selectCourse(c3, s1);
        CourseSelection.selectCourse(c4, s1);
        CourseSelection.selectCourse(c4, s2);
        CourseSelection.selectCourse(c4, s3);

        CourseSelection.listStudents(c1);

    }
}