package day30.task;

public class Course {

    private String courseName;
    private String coursecode;

    private Instructor instructor;

    private Integer maxEnrollment;
    private Integer currentEnrollment;


    public Course(String courseName, String coursecode, Instructor instructor, Integer maxEnrollment, Integer currentEnrollment) {
        this.courseName = courseName;
        this.coursecode = coursecode;
        this.instructor = instructor;
        this.maxEnrollment = maxEnrollment;
        this.currentEnrollment = currentEnrollment;
    }

    public void addStudent(){
        if(currentEnrollment<maxEnrollment){
            currentEnrollment++;
        }else{
            System.out.println("Course is full.");
        }

    }


    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursecode='" + coursecode + '\'' +
                ", instructor=" + instructor.toString() +
                ", maxEnrollment=" + maxEnrollment +
                ", currentEnrollment=" + currentEnrollment +
                '}';
    }
}
