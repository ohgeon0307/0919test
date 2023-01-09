package diEx01;

public class B {
	
	private A a;

	public A getA() {
		return a;
	}
	
	// @Resource -> �̸��� a�� bean�� �����϶�� ��.
	// @Autowired -> Ÿ�Ա���. AŸ���� setter�� ������ �����ض�.
	// @Qualifier(value = "a2") -> Ÿ����  A�̰�, �̸��� a2�� ��ü ����.  
	public void setA(A a) {
		this.a = a;
	}
	
	public void infoA() {
		System.out.println("-------B��ü infoA() ����--------");
		System.out.println("a.data1 =>"+a.getData1());
		System.out.println("a.data2 =>"+a.getData2());
		System.out.println("-------B��ü infoA() ����--------");
	}
}
