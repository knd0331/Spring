package ver6;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//Boy , Girl Ŭ�����鿡 �������� �����ϰ��� �ϴ�
//���� ���ɻ��� Ŭ����
@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(void makeFood())")
	public void point() {
	}

	// �ٽɰ��ɻ��� ������ �۾�
	@Before("point()")
	public void my_before() {
		System.out.println("�谡 ������.");
	}

	// �ٽɰ��ɻ��� ���� ������ �۾�
	@AfterReturning("point()")
	public void my_after_returning() {
		System.out.println("������ �Դ´�.");
	}

	// �ٽɰ��ɻ��� ���� ������ �۾�
	@AfterThrowing("point()")
	public void my_after_throwing() {
		System.out.println("������ �θ���.");
	}

	// �ٽɰ��ɻ��� ���� ,���� �̰� ������ �۾�
	@After("point()")
	public void my_after() {
		System.out.println("�������� �Ѵ�.");
	}
}
