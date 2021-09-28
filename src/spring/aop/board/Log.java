package spring.aop.board;

import org.aspectj.lang.ProceedingJoinPoint;

public class Log {
	//공통기능
	public void beforeLog() {
		System.out.println("b---e---f---o---r---e");
		
	
	}
	public void afterLog() {
		System.out.println("a---f---t---e---r");
		
		
	}
	
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("-----around log start-------");
			
		Object result = pjp.proceed();
			
		System.out.println("-----around log end--------");
		return result;
		
		
	}
}
