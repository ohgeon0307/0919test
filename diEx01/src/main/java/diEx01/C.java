package diEx01;

public class C {
	private A a;

	public C(A a) {
		this.a = a;
	}
	
	public void infoA() {
		System.out.println("-------C��ü infoA() ����--------");
		System.out.println("a.data1 =>"+a.getData1());
		System.out.println("a.data2 =>"+a.getData2());
		System.out.println("-------C��ü infoA() ����--------");
	}
	
	
}
