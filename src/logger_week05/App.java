package logger_week05;

public class App {
	
	public static void main (String [] args) {
		
		
		Logger asteriskLogger = new AsteriskLogger ();
		asteriskLogger.log("Friday");
		System.out.println();
		
		asteriskLogger.error("Wahoo!");
		
		Logger spacedLogger = new SpacedLogger ();
		spacedLogger.log("Friday");
		System.out.println();
		
		spacedLogger.error("oh No!");
		
	}
	

}
