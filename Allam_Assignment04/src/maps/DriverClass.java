package maps;

//@author Tejaswi Allam
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        StudentMap studentMap = new StudentMap();
		Scanner sc = new Scanner(System.in);
		 for (int i = 0; i < 5; i++) {
			 System.out.print("Enter student id: ");
	            int stuID = sc.nextInt();
	            sc.nextLine();
	            System.out.print("Enter student name: ");
	            String stuname = sc.nextLine();
	            System.out.print("Enter student branch: ");
	            String stubranch = sc.nextLine();
	            System.out.print("Enter student registered course: ");
	            String stucourse = sc.nextLine();
	            System.out.print("Enter student's school: ");
	            String stuschool = sc.nextLine();
	            
	            // Create a Student object and insert into the map
	            Student student = new Student(stuID, stuname, stubranch, stucourse, stuschool);
	            studentMap.insertStudentDetails(student);
		 }
		 
		 // Print student details
	        studentMap.printStudentDetails();
	        
	        System.out.print("Enter any student id to update: ");
	        int studentID = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter the new registered course: ");
	        String newCourse = sc.nextLine();
	        studentMap.updateStudentCourse(studentID, newCourse);

	        // Print updated student details
	        System.out.println("\nAfter updating student details are:");
	        studentMap.printStudentDetails();
	        
	        // Delete student
	        System.out.print("Enter any student id to delete: ");
	        int removalstuID = sc.nextInt();
	        studentMap.deleteStudent(removalstuID);

	        // Print student details after deletion
	        System.out.println("\nAfter removing student details are:");
	        studentMap.printStudentDetails();

        sc.close();
	}

}
