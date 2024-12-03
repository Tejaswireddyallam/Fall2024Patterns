package maps;

//@author Tejaswi Allam

public class Student {
	
	private int sID;
    private String name;
    private String branch;
    private String registeredCourse;
    private String school;
    
	public Student(int sID, String name, String branch, String registeredCourse, String school) {
		super();
		this.sID = sID;
		this.name = name;
		this.branch = branch;
		this.registeredCourse = registeredCourse;
		this.school = school;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRegisteredCourse() {
		return registeredCourse;
	}

	public void setRegisteredCourse(String registeredCourse) {
		this.registeredCourse = registeredCourse;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
    
    

}
