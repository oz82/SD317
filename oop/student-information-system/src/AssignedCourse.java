public class AssignedCourse extends Course {
    private String instructorID;

    public AssignedCourse(Course course, Instructor instructor) {
        super(course.getID(), course.getTitle(), course.getType());
        this.instructorID = instructor.getID();
    }

    public String getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(String instructorID) {
        this.instructorID = instructorID;
    }

    @Override
    public String toString() {
        return "AssignedCourse{" +
                "course=" + super.toString() +
                ", instructorID='" + instructorID + '\'' +
                '}';
    }
}