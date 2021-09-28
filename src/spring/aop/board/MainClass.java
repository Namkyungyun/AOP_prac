package spring.aop.board;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.aop.log.A;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext context = new GenericXmlApplicationContext(); //IoC컨테이너 생성
		context.load("spring/aop/config/board-config.xml"); //컨테이너에 담을 패키지+xml
		context.refresh(); //refresh를 안하면 작동을 안함 필수!
		
		BoardDAO board = context.getBean("board", BoardDAO.class);
		board.selectBoard();
		board.deleteBoard(1);
		board.insertBoard(3);
		board.updateBoard(3, " ������ʹ� ");
		
		context.close();
		
		
	}

}
