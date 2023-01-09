package diEx01;

public class Student {
	private Math math;
	private Kor kor;
	private Eng eng;
	private String name;
	
	
	public Student(Math math) {
		this.math = math;
	}

	public Math getMath() {
		return math;
	}

	public void setMath(Math math) {
		this.math = math;
	}

	public Kor getKor() {
		return kor;
	}

	public void setKor(Kor kor) {
		this.kor = kor;
	}

	public Eng getEng() {
		return eng;
	}

	public void setEng(Eng eng) {
		this.eng = eng;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void avg() {
		System.out.println("------"+name+"의 평균 점수는------");
		System.out.println((math.getMathScore()+kor.getKorScore()+eng.getEngScore())/3.0);
		System.out.println("------------------------------");
	}
	
}
