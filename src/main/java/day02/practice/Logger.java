package day02.practice;

public class Logger {
	
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		// TODO complete this code using the above template
		System.out.println("Info: " + msg);
	}
	
	public static void info (int num) {
		// TODO Complete this code
		System.out.println("Info: " + num);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("Error: " + msg);
	}
	
	public static void error (int num) {
		// TODO Complete this code
		System.out.println("Error: " + num);
	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger.debug("Debug message");
		Logger.debug(13);
		Logger.info("Info message");
		Logger.info(32);
		Logger.error("Error message");
		Logger.error(31);
		

	}

}
