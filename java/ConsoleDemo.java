
import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		Console console = System.console();
		
		String name=console.readLine("enter name");
		char ch[] = console.readPassword("Enter password");
		
		System.out.println("Name is "+name);
		System.out.println("password is "+ch);

	}

}
