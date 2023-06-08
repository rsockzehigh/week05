package logger_week05;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
					
	}

	@Override
	public void error(String error) {
		System.out.println("*****************");
		System.out.println("****" + error + "*****");
		System.out.println("*****************");
	}

}
