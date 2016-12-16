package test01_beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	 
    public static void main(String[] args) {
        ApplicationContext context = 
                new ClassPathXmlApplicationContext
                ("test01_beanScope/applicationContext.xml");
        Sample s1 = (Sample) context.getBean("sample1");
        Sample s2 = (Sample) context.getBean("sample1");
        Sample s3 = (Sample) context.getBean("sample1");
         
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);     
        
       //���� ����� �ڹ� �ҽ��ڵ�δ� �Ʒ��� �������� �ؼ�����
//        Sample s = new Sample();
//        Sample s_1 = s;
//        Sample s_2 = s;
//        Sample s_3 = s;
        
        Sample s4 = (Sample) context.getBean("sample2");
        Sample s5 = (Sample) context.getBean("sample2");
        Sample s6 = (Sample) context.getBean("sample2");
        
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);    
        
        //���� ����� �ڹ� �ҽ��ڵ�δ� �Ʒ��� �������� �ؼ�����
//      Sample s_4 = new Sample();
//      Sample s_5 = new Sample();
//      Sample s_6 = new Sample();
    }
 
}
