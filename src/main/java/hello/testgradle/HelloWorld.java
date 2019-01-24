/**
 * 
 */
package hello.testgradle;

//import java.time.LocalTime;
import org.joda.time.LocalTime;


/**
 * @author mhock
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();

		System.out.println("Current time: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHellow());
	}
}
