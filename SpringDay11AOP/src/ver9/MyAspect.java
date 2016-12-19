package ver9;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

	@Pointcut("execution(* makeFood(..))")
	public void my_point() {
	}

	@Around("my_point()")
	public void my_around(ProceedingJoinPoint target) {
		// before
		System.out.println("�谡 ������.");
		// �ٽ� ���ɻ��� ������ �Է� ������ �ޱ�
		Object[] args = target.getArgs();
		System.out.println(args[0] + "�κ� ������ ����ڴ�.");
		try {

			Object result = target.proceed(); // �ٽ� ���ɻ��� �޼ҵ� �������.

			System.out.println(result + "������ �Դ´�.");// after returning ��������
		} catch (Throwable e) {
			// after throwing
			System.out.println(e.getMessage() + "������ �θ���.");
			e.printStackTrace();
		} finally {
			System.out.println("�������� �Ѵ�."); // after
		}
	}

}