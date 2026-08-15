s1234567-FPAssignment1/
├── src/
│   └── console/
│       └── program/
│           ├── Main.java              // entry point, just launches TimeTable
│           ├── TimeTable.java         // the menu loop + orchestration
│           ├── Course.java            // superclass (shared fields)
│           ├── OnlineCourse.java      // extends Course
│           ├── FaceToFaceCourse.java  // extends Course, adds capacity
│           ├── Student.java           // holds enrolled courses + enrol/withdraw logic
│           └── CourseLoader.java      // reads courses.csv, returns the collection
├── courses.csv                        // the data file
└── (README )