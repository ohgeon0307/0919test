package diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//개발자의 순행
		Math math1 = new Math();
		math1.setMathScore(90);
		
		Kor kor1 = new Kor();
		kor1.setKorScore(70);
		
		Eng eng1 = new Eng();
		eng1.setEngScore(88);
		
		Student s1 = new Student(math1);
		s1.setKor(kor1);
		s1.setEng(eng1);
		s1.setName("건시");
		s1.avg();
	
		
		
		//개발자의 역행(ioc 컨테이너)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Student springS = ctx.getBean("student",Student.class);
				
		springS.avg();
		
		
	}

}
