package calculadora;

public class calculadora {

	public static void main(String[] args) {

		// 1. El resultado de multiplicar 80 por 3 da 240
		System.out.println(calculadora.multiplicar(80, 3));

		// 2. El resultado de sumar 150 y 180, dividido por 3, da 110
		System.out.println(calculadora.dividir(sumar(150, 180), 3));

		// 3. El resultado de restar 90 y 50, multiplicado por 15, no da 605.
		System.out.println(calculadora.restar(90, 50) * 15);

		// 4. El resultado de sumar 70 y 40, multiplicado por 25, no da 2700
		System.out.println(calculadora.multiplicar(sumar(70, 40), 25));

	}

	public static double sumar(double unNumero, double otroNumero) {
		double sumar = 0;
		sumar = unNumero + otroNumero;

		return sumar;
	}

	public static double restar(double unNumero, double otroNumero)

	{
		double restar = 0;
		restar = unNumero - otroNumero;
		return restar;

	}

	public static double multiplicar(double unNumero, double otroNumero) {
		double multiplicar = 0;

		multiplicar = unNumero * otroNumero;

		return multiplicar;

	}

	public static double dividir(double unNumero, double otroNumero) {
		double dividir = 0;

		dividir = unNumero / otroNumero;

		return dividir;

	}
}