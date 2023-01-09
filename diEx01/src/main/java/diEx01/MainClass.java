package diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �Ϲ������� �����ڰ� ���� ��ü���� ������ �����ϴ� ���

		A a = new A(); // ��ǰ

		a.setData1("������1 �Դϴ�");
		a.setData2("������2 �Դϴ�");

		B b = new B(); // ����ǰ
		b.setA(a); // ���� ���� (setter ����)

		b.infoA();

		// ioc �����̳ʸ� ����Ͽ� ��ü ���� �� ���� �����ϱ�

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		B springB = ctx.getBean("b",B.class); //bean id�� 'b'�� ��ü�� B Ŭ���� Ÿ������ ������.
		
		springB.infoA();
		
		// �Ϲ������� �����ڰ� ������ ������ ����Ͽ� ��ü�� ������ �����ϴ� ���
		
		A conA = new A();
		
		conA.setData1("�����ڵ�����1");
		conA.setData2("�����ڵ�����2");
		
		C c = new C(conA); //������ ���� ����
		
		c.infoA();
		
		//������ ioc �����̳ʰ� ��ü�� �����ϰ�, ������ ���� ������ ���� �� ����ϴ� ���.
		
		//������ ��ü�� ������ �� ������ xml�� ���� �о���̱� ������, �ٽ� xml�� �о���� �ʿ䰡 ����.
		
		C springC = ctx.getBean("iocC",C.class);
		
		springC.infoA();
		
		
	}

}
