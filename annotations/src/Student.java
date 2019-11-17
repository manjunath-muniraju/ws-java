@Course(c_id="C-333", c_name="Java", c_cost=30000)
public class Student {
	String s_id;
	String s_name;
	String s_addr;
	
	public Student(String sid, String sname, String saddr) {
		this.s_id = sid;
		this.s_name = sname;
		this.s_addr = saddr;
	}
	
	public void getStudentDetails() {
		System.out.println("STUDENT DETAILS");
		System.out.println("===============");
		System.out.println("STUDENT ID      : " + this.s_id);
		System.out.println("STUDENT NAME    : " + this.s_name);
		System.out.println("STUDENT ADDRESS : " + this.s_addr);
	}
}