public class Teacher {
	Teacher courseTeacher;
	String name;
	String mpno;
	String branch;

	Teacher(String name, String mpno, String branch) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}
	public void print() {
		System.out.println("Öğretmen: " + this.name);
		System.out.println("Tel no: " + this.mpno);
		System.out.println("Ders: " + this.branch);
	}
}
