package console.program;

public class OnlineCourse extends Course {

    public OnlineCourse(String courseName, String year, String mode, String dayOfLecture, int startTime, double duration) {
        super(courseName, year, mode, dayOfLecture, startTime, duration);

    }
    // overding parent method
    @Override
    public boolean hasRoom(){
        // online course has no capacity limit so returns true
         return true;
    }
}
