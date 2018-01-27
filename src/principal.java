import java.io.*;

public class principal {
	
	public static void main(String[] args){
		restaurante mirestaurante=new restaurante();
		int opcion=0;
		addPapasChocos(mirestaurante);
		do{
			menu();
			opcion=opcion();
			ruta(opcion,mirestaurante);
		}while(opcion!=6);
	}

	private static void ruta(int opcion,restaurante mirestaurante) {
		switch(opcion){
		case 1:
			double kpapas=0;
			do{
				System.out.println("Indique los kilos de Papas que desea añadir");
				kpapas=kilos();
			}while(kpapas<=0);
			mirestaurante.addPapas(kpapas);
			break;
		case 2:
			do{
				System.out.println("Indique los kilos de Papas que desea añadir");
				kpapas=kilos();
			}while(kpapas<=0);
			mirestaurante.addPapas(kpapas);
			break; 
		case 3:
			System.out.println("El número de comensales disponibles es " + mirestaurante.getComensales()+ " comensales");
			break;
		case 4:
			System.out.println("En el almacén quedan " +mirestaurante.showPapas()+ " kilos de Papas disponibles");
			break;
		case 5:
			System.out.println("En el almacén quedan " +mirestaurante.showChocos()+ " kilos de Chocos disponibles");
			break;
		case 6:
			System.out.println("Ha elegido salir del programa");
			break;
		default:
			System.out.println("La opción elegida no existe.");
			break;
		}
	}

	private static int opcion() {
		int opcion=0;
		System.out.println("Introduzca la opción");
		opcion=intdatos();
		if (opcion<1 || opcion>6) System.out.println("La opción elegida no existe. Elija entre 1 y 6");
		return opcion;
	}

	private static int intdatos() {
		String teclado=null;
		int datos=0;
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		try {
			teclado=leer.readLine();
			datos=Integer.parseInt(teclado);
		} catch (IOException e) {
			System.out.println("Por favor, introduce un número, no un carácter");
			datos=-1;
		}
		return datos;
	}

	private static void menu() {
		System.out.println("Seleccione una opción de entre las siguientes:");
		System.out.println("1. Añadir kilos de Papas");
		System.out.println("2. Añadir kilos de Chocolate");
		System.out.println("3. Ver número de comensales disponibles");
		System.out.println("4. Ver los kilos de Papas en el almacén");
		System.out.println("5. Ver los kilos de Chocos en el almacén");
		System.out.println("6. Salir");
	}

	private static void addPapasChocos(restaurante mirestaurante) {
		double kpapas=0, kchocos=0;
		do{
			System.out.println("Indica los kilos de Papas para el restaurante");
			kpapas=kilos();
		}while(kpapas<=0);
		do{
			System.out.println("Indica los kilos de Chocos para el restaurante");
			kchocos=kilos();
		}while(kchocos<=0);
		mirestaurante.addChocos(kchocos);
		mirestaurante.addPapas(kpapas);
	}

	private static double kilos() {
		String teclado=null;
		double kilos=0;
		BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
		try {
			teclado=leer.readLine();
			kilos=Double.parseDouble(teclado);
		} catch (IOException e) {
			System.out.println("Por favor, introduce un número, no un carácter");
			kilos=-1;
		}
		return kilos;
	}
}
