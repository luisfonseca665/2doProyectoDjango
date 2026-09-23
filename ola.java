import java.util.Scanner;

public class ola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Contraseña:");
		String contra = sc.nextLine();

		if (contrasena(contra)) {
			System.out.println("La contraseña es válida.");
		} else {
			System.out.println("La contraseña no es válida.");
		}
	}

	public static boolean contrasena(String c) {
		if (c.isEmpty()) {
			System.out.println("Escribe una contraseña papi.");
			return false;
		}

		boolean valida = true;
		
		if (c.length() < 8) {
			System.out.println("Contraseña muy corta amor: debe tener al menos 8.");
			valida = false;
		} else if (c.length() > 32) {
			System.out.println("La contraseña muy larga loco: el máximo es 32.");
			valida = false;
		}

		boolean m = false;
		boolean n = false;
		boolean espacios = false;

		for (int i = 0; i < c.length(); i++) {
			char caracter = c.charAt(i);
			if (Character.isWhitespace(caracter)) {
				espacios = true;
			}
			if (Character.isUpperCase(caracter)) {
				m = true;
			}
			if (Character.isDigit(caracter)) {
				n = true;
			}
		}

		if (!m) {
			System.out.println("Falta una letra mayúscula :')");
			valida = false;
		}
		if (!n) {
			System.out.println("Falta un numero :(");
			valida = false;
		}
		if (espacios) {
			System.out.println("La contraseña no puede contener espacios en blanco.");
			valida = false;
		}

		return valida;
	}
}