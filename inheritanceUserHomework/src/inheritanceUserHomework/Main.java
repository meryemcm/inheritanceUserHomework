package inheritanceUserHomework;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.id=1;
		Student student = new Student();
		student.id=2;
		Instructor instructor = new Instructor();
		instructor.id=3;
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		
		userManager.login(user);
		studentManager.studentGrade();
		instructorManager.intructorLesson();
		

	}

}
