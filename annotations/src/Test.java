import java.lang.annotation.*;

public class Test {
	public static void main(String[] args) throws Exception {
		Student stu = new Student("123", "Manju", "Bangalore");
		stu.getStudentDetails();
		
		Class c = stu.getClass();
		Annotation annot = c.getAnnotation(Course.class);
		Course crs = (Course) annot;
		System.out.println("COURSE DETAILS");
		System.out.println("==============");
		System.out.println("COURSE ID: " + crs.c_id());
		System.out.println("COURSE NAME: " + crs.c_name());
		System.out.println("COURSE COST: " + crs.c_cost());
	}
}