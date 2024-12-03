package maps;

//@author Tejaswi Allam

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentMap {
	 private Map<Integer, Map<String, String>> studentMap;
	 
	 public StudentMap() {
	        studentMap = new LinkedHashMap<>();
	    }
	 
	 public void insertStudentDetails(Student s) {
	        Map<String, String> studentinfo = new HashMap<>();
	        studentinfo.put("name", s.getName());
	        studentinfo.put("branch", s.getBranch());
	        studentinfo.put("courseRegistered", s.getRegisteredCourse());
	        studentinfo.put("school", s.getSchool());
	        
	        studentMap.put(s.getsID(), studentinfo);
	    }
	 
	 public void printStudentDetails() {
	        System.out.println("Student Details are:");
	        for (Map.Entry<Integer, Map<String, String>> entry : studentMap.entrySet()) {
	            int sID = entry.getKey();
	            Map<String, String> studentinfo = entry.getValue();
	            System.out.println("*****************");
	            System.out.println("Student ID: " + sID);
	            System.out.println("name: " + studentinfo.get("name"));
	            System.out.println("branch: " + studentinfo.get("branch"));
	            System.out.println("courseRegistered: " + studentinfo.get("courseRegistered"));
	            System.out.println("school: " + studentinfo.get("school"));
	        }
	        System.out.println("*****************");
	    }
	 
	 public void updateStudentCourse(int sID, String course) {
	        if (studentMap.containsKey(sID)) {
	            studentMap.get(sID).put("courseRegistered", course);
	        } else {
	            System.out.println("Student ID not found.");
	        }
	    }
	 
	 public void deleteStudent(int sID) {
	        if (studentMap.containsKey(sID)) {
	            studentMap.remove(sID);
	        } else {
	            System.out.println("Student ID not found.");
	        }
	    }

}
