package spring.aop.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Log {
	//������
	public void logPrint() {
		System.out.println("log ���");
	}
		//���� ��� around
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("-----around log ���-------");
			
		Object result = pjp.proceed();
			
		System.out.println("-----around log ���-------");
		return result;
		
		
	}
}
