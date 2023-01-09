package diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� ����
		Math math1 = new Math();
		math1.setMathScore(90);
		
		Kor kor1 = new Kor();
		kor1.setKorScore(70);
		
		Eng eng1 = new Eng();
		eng1.setEngScore(88);
		
		Student s1 = new Student(math1);
		s1.setKor(kor1);
		s1.setEng(eng1);
		s1.setName("�ǽ�");
		s1.avg();
	
		
		
		//�������� ����(ioc �����̳�)
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Student springS = ctx.getBean("student",Student.class);
				
		springS.avg();
		
		
	}

}
