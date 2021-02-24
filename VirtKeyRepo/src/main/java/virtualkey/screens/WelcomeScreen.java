package virtualkey.screens;

public class WelcomeScreen implements Screen {
	
	private static String welcomeText = "Welcome to Virtual Key"; 
	private static String developerText = "Developer: Matt Stallman";

	@Override
	public void show() {
		
		System.out.println(welcomeText);
		System.out.println(developerText);
	}
}
