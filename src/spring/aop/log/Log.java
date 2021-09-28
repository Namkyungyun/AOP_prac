package spring.aop.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class Log {
	//공통기능
	public void logPrint() {
		System.out.println("log 출력");
	}
		//공통 기능 around
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("-----around log 출력-------");
			
		Object result = pjp.proceed();
			
		System.out.println("-----around log 출력-------");
		return result;
		
		
	}
}
