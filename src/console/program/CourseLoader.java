package console.program;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CourseLoader {
    
public static List<Course> loadCourses(){
  // Arraylist to store , as we need need fast access
  List<Course> courses = new ArrayList<>();
  try {
    // file reader
    BufferedReader reader = new BufferedReader(new FileReader("course-1.csv"));
    reader.readLine(); // skip header
    String line;
    
    while ((line = reader.readLine()) != null) {
        
        String[] parts = line.split(",");
        String name = parts[0];
        String year = parts[2];
        String mode = parts[3];
        String day = parts[4];

        // converting time to mins
        String[] t = parts[5].split(":");
        int startTime = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);

        double duration = Double.parseDouble(parts[6]);
        int currentEnrolments = Integer.parseInt(parts[7]);

         
        if (parts[1].equalsIgnoreCase("N/A")) {
             //  OnlineCourse
             courses.add(new OnlineCourse(name, year, mode, day, startTime, duration));

        } else {
            // FaceToFaceCourse
            int capacity = Integer.parseInt(parts[1]);
             courses.add(new FaceToFaceCourse(name, year, mode, day, startTime, duration, capacity, currentEnrolments));
        }
    }
    
    reader.close();
    
  } catch (Exception e) {
    // TODO: handle exception
    System.err.println(e);
  }  
  return courses;
}
   
}
