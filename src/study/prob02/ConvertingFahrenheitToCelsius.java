package study.prob02;

public class ConvertingFahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit = 100;
		float celcius = (int)((5/9f) * (fahrenheit - 32)*100 + 0.5)/100f;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
		

	}

}
