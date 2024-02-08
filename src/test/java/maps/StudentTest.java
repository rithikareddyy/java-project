package maps;

import java.util.HashMap;

public class StudentTest {

    public static void main(String[] args) {
        // Create a HashMap with student objects (Key: FirstName, Value: Student Object)
        HashMap<String, Student> studentHashMap = createStudentHashMap();

        // Test the method to get a student by name
        String studentNameToFind = "Emma";
        Student foundStudent = getStudentByName(studentHashMap, studentNameToFind);

        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student not found with name: " + studentNameToFind);
        }
    }

    // Method to create a HashMap of students
    private static HashMap<String, Student> createStudentHashMap() {
        HashMap<String, Student> studentHashMap = new HashMap<>();

        // Adding students to the HashMap
        studentHashMap.put("John", new Student("John", "Doe", 3.8));
        studentHashMap.put("Alice", new Student("Alice", "Smith", 3.9));
        studentHashMap.put("Bob", new Student("Bob", "Johnson", 3.7));
        studentHashMap.put("Emma", new Student("Emma", "Williams", 3.5));
        studentHashMap.put("James", new Student("James", "Brown", 3.6));
        studentHashMap.put("Sophia", new Student("Sophia", "Miller", 4.0));
        studentHashMap.put("Michael", new Student("Michael", "Jones", 3.8));
        studentHashMap.put("Olivia", new Student("Olivia", "Davis", 3.9));

        return studentHashMap;
    }

    // Method to get a student by name from the HashMap
    private static Student getStudentByName(HashMap<String, Student> studentHashMap, String name) {
        return studentHashMap.get(name);
    }
}
