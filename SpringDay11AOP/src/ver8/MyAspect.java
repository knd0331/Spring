package ver8;

import org.aspectj.lang.JoinPoint;
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
	
	@Pointcut("execution(* makeFood(*))")
	public void my_point() {
	}

	// �ٽɰ��ɻ��� ������ ���޵Ǵ� ���ڰ��� �����޾Ƽ��۾�
	// args �迭�� ũ��� �ٽɰ��ɻ��׿� ���� ������ ����
	
	@Before("my_point()")
	public void my_before(JoinPoint joinPoint) {
		System.out.println("�谡 ������.");
		Object[]args = joinPoint.getArgs();
		System.out.println("before �غ�:"+args[0]);
	}

	// �ٽɰ��ɻ����� ��ȯ���� �ڷ����� �˼������� ������ �׻� 1��
	// Object ���� �ϳ��� �޾ƿ����
	@AfterReturning(pointcut="my_point()", returning="result")
	public void my_after_returning(Object result) {
		System.out.println(result +"������ �Դ´�.");
	}

	// �ٽɰ��ɻ��� ���ܹ߻����� ���ܰ�ü �ڵ鸵�� ���Ѵٸ� ���ܰ�ü �޾ƺ������� 
	@AfterThrowing(pointcut="my_point()", throwing="ex")
	public void my_after_throwing(Exception ex) {
		System.out.println(ex.getMessage()+"������ �θ���.");
	}

	// �ٽɰ��ɻ��� ���� ,���� �̰� ������ �۾�
	@After("my_point()")
	public void my_after() {
		System.out.println("�������� �Ѵ�.");
	}
}
