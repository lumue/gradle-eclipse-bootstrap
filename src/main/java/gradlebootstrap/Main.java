package gradlebootstrap;

import java.time.Clock;

public class Main {

	public static void main(String[] args) {
		String timeString;
		Clock clock=Clock.systemDefaultZone();
		timeString=clock.toString();
		System.out.println("Hello World! The Time is:"+timeString);
	}

}
