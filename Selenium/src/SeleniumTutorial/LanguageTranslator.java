package SeleniumTutorial;

import java.lang.reflect.Field;

public class LanguageTranslator {

	
	static {
		try {
			
			Field value = String.class.getDeclaredField("value");
			value.setAccessible(true);
			try {
				value.set("Hello Everyone", value.get("Hallo zusammen"));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				value.set("My name is Anand", value.get("Ich heiﬂe Anand"));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				value.set("Hope you are doing Good", value.get("Ich hoffe, es geht dir gut"));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		} 
		catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Everyone");
		System.out.println("My name is Anand");
		System.out.println("Hope you are doing Good");
	}

}
