package console.program;

public abstract class Course {
    // PROTECTED FIELDS VARIABLES
    protected String courseName;
    protected String year;
    protected String mode;
    protected String dayOfLecture;
    protected int startTime;
    protected double duration;
    

    // CONSTRUCTOR
    public Course(String courseName, String year, String mode, String dayOfLecture, int startTime, double duration) {
        this.courseName = courseName;
        this.year = year;
        this.mode = mode;
        this.dayOfLecture = dayOfLecture;
        this.startTime = startTime;
        this.duration = duration;
    }
    
    // GETTERS
    public String getCourseName() {
        return courseName;
    }

    public String getDayOfLecture() {
        return dayOfLecture;
    }

    public int getStartTime() {
        return startTime;
    }

    public double getDuration() {
        return duration;
    }


    // METHOD TO CHECK IF THERE IS SPACE AVAILABLE FOR ENROLLMENT
    public abstract boolean hasRoom();
}
