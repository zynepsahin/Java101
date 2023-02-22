public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	double note;
	double perfNote;

	Course (String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.perfNote = 0;
	}
	public void addTeacher(Teacher teacher) {
		if (this.prefix.equals(teacher.branch)) {
			this.courseTeacher = teacher;
			System.out.println("İşlem başarılı");
		}
		else
			System.out.println(teacher.name + " Akademisyeni bu dersi veremez");
	}
}
