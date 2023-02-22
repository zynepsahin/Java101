public class Main {
	public static void main(String[] args) {
		Course mat = new Course("Matematik","mat101", "mat");
		Course fizik = new Course("Fizik", "fzk101", "fzk");
		Course kimya = new Course("Kimya", "kmy108", "kmy");

		Teacher t1 = new Teacher("Mahmut", "5555", "mat");
		Teacher t2 = new Teacher("Ahmet", "1111", "fzk");

		//mat.addTeacher(t1);
		//fizik.addTeacher(t2);

		Student s1 = new Student("Zeynep", 4, "654" , mat, fizik, kimya);
		//Student s2 = new Student("Gizem", 4, "123" , mat, fizik, kimya);

		s1.addBulkExamNote(50, 60, 70, 80, 80, 80);
		s1.isPass();
	}
}
