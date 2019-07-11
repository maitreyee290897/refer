package slf4jdemo;

//import java.util.logging.Logger;
import org.slf4j.*;
import org.slf4j.LoggerFactory;

public class MyApp {

	private static Logger logger = (Logger) LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args) {
		logger.info("hello world");
		int res = add(10,20);
		System.out.println("result " + res);
	}

	public static int add(int a,int b) {
		return a+b;
	}
}
