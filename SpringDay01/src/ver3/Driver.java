package ver3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//���� ��ǰ��
		ApplicationContext context = new
				FileSystemXmlApplicationContext
				  ("/src/ver3/applicationContext.xml");
		
		Car myCar = context.getBean("sonata",Car.class);
		
		Tire tire = context.getBean("chinaTire",Tire.class);
		
		myCar.setTire(tire); //������ ��ü ����
		myCar.printCarInfo();
	}

}
