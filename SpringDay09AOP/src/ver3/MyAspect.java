package ver3;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public void my_around(ProceedingJoinPoint target) {
		System.out.println("�谡 ������."); // before
		try {

			target.proceed(); // �ٽ� ���ɻ��� �޼ҵ� �������.

			System.out.println("������ �Դ´�.");// after returning
		} catch (Throwable e) {
			System.out.println(e.getMessage());
			System.out.println("������ �θ���.");
			e.printStackTrace();
		} finally {
			System.out.println("�������� �Ѵ�."); // after
		}
	}

}
