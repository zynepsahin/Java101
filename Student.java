public class Student {
	String name;
	String stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double average;
	boolean isPass;

	Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
		this.name = name;
		this.classes = classes;
		this.stuNo = stuNo;
		this.mat = mat;
		this.fizik = fizik;
		this.kimya = kimya;
		this.isPass = false;
	}

	public void addBulkExamNote(int mat, int fizik, int kimya, int matPerfnote, int fizikPerfNote, int kimyaPerfNote) {
		if (mat >= 0 && mat <= 100 && matPerfnote >= 0 && matPerfnote <= 100)
			this.mat.note = mat * 0.8 + matPerfnote * 0.2;
		if (fizik >= 0 && fizik <= 100 && fizikPerfNote >= 0 && fizikPerfNote <= 100)
			this.fizik.note = fizik * 0.8 + fizikPerfNote * 0.2;
		if (kimya >= 0 && kimya <= 100 && kimyaPerfNote >= 0 && kimyaPerfNote <= 100)
			this.kimya.note = kimya * 0.8 + kimyaPerfNote * 0.2;
		printNote();
	}
	public void isPass() {
		this.isPass = isCheckPass();
		if (isPass)
			System.out.println("Sınıfı geçti");
		else
			System.out.println("Sınıfta kaldı");
	}
	public boolean isCheckPass() {
		calcAverage();
		return this.average > 55;
	}
	public void calcAverage()
	{
		this.average = ((this.mat.note + this.fizik.note + this.kimya.note) / 3.0);
	}
	public void printNote() {
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Mat notu : " + this.mat.note);
		System.out.println("Fizik notu : " + this.fizik.note);
		System.out.println("Kimya notu : " + this.kimya.note);
	}
}
