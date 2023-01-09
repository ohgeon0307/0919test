package diEx01;

public class B {
	
	private A a;

	public A getA() {
		return a;
	}
	
	// @Resource -> 이름이 a인 bean을 주입하라는 말.
	// @Autowired -> 타입기준. A타입인 setter로 의존을 주입해라.
	// @Qualifier(value = "a2") -> 타입은  A이고, 이름은 a2인 객체 주입.  
	public void setA(A a) {
		this.a = a;
	}
	
	public void infoA() {
		System.out.println("-------B객체 infoA() 시작--------");
		System.out.println("a.data1 =>"+a.getData1());
		System.out.println("a.data2 =>"+a.getData2());
		System.out.println("-------B객체 infoA() 종료--------");
	}
}
