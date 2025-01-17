import java.util.UUID;
public class Student {
    private String studentId;
    private String name;
    private String address;
    private String email;
    private Course course;
    public Student(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.studentId = generateStudentId();
    }
    public String getStudentId() {
        return studentId;
    }
    public String generateStudentId() {
        return UUID.randomUUID().toString();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}