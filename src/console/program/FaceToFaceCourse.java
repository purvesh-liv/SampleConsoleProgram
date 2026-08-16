package console.program;

public class FaceToFaceCourse extends Course {

    // private extra feilds 
    private int capacity;
    private int currentEnrollments;

    // constructor
    public FaceToFaceCourse(String courseName, String year, String mode, String dayOfLecture, int startTime,
            double duration,int capacity,int currentEnrollments) {
        super(courseName, year, mode, dayOfLecture, startTime, duration);
        this.capacity = capacity;
        this.currentEnrollments = currentEnrollments;

    }
    // overding parent method
    @Override
    public boolean hasRoom(){
     return currentEnrollments < capacity;
}
}