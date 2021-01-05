package Java8Tester;

/*
 * 变量作用域
 * **/
public class two {

	final static String salutation = "Hello! ";

	public static void main(String args[]) {
		GreetingService greetService1 = message -> System.out.println(salutation + message);
		greetService1.sayMessage("Runoob");
	}

	interface GreetingService {
		void sayMessage(String message);
	}
}