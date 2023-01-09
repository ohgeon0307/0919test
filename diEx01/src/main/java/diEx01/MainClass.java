package diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 일반적으로 개발자가 직접 객체간의 의존을 주입하는 방법

		A a = new A(); // 부품

		a.setData1("데이터1 입니다");
		a.setData2("데이터2 입니다");

		B b = new B(); // 완제품
		b.setA(a); // 의존 주입 (setter 주입)

		b.infoA();

		// ioc 컨테이너를 사용하여 객체 생성 및 의존 주입하기

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		B springB = ctx.getBean("b",B.class); //bean id가 'b'인 객체를 B 클래스 타입으로 꺼내라.
		
		springB.infoA();
		
		// 일반적으로 개발자가 생성자 주입을 사용하여 객체간 의존을 주입하는 방법
		
		A conA = new A();
		
		conA.setData1("생성자데이터1");
		conA.setData2("생성자데이터2");
		
		C c = new C(conA); //생성자 의존 주입
		
		c.infoA();
		
		//스프링 ioc 컨테이너가 객체를 생성하고, 생성자 의존 주입을 했을 때 사용하는 방법.
		
		//위에서 객체가 생성될 때 수정된 xml을 새로 읽어들이기 때문에, 다시 xml을 읽어들일 필요가 없다.
		
		C springC = ctx.getBean("iocC",C.class);
		
		springC.infoA();
		
		
	}

}
