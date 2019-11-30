package RetratosRobot;

import java.util.Scanner;

public class RetratosRobot {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String crear;

		do {
			System.out.print("Hola, ¿deseas generar un retrato? (si/no): ");

			crear = input.next();
			
			
			if (!(crear.equals("si") || crear.equals("no"))) {
				System.out.println("Su respuesta no es valida/n");
			}

		} while (!(crear.equals("si") || crear.equals("no")));

		while (crear.equals("si")) {

			System.out.println("\nPara generar un retrato debera escoger un rasgo, entre las distintas facetas");
			int pelo;
			do {	
			
			System.out.println("\nEscoja el número del rasgo, para la faceta:\n ");

			System.out.println("     PELO");
			System.out.println("1. wwwwwwwww");
			System.out.println("2. \\\\\\//////");
			System.out.println("3. |\"\"\"\"\"\"\"|");
			System.out.println("4. |||||||||\n");

			System.out.print("¿Cual es su opción? (1,2,3 o 4): ");
			pelo = input.nextInt();

			if (!((pelo == 1 || pelo == 2|| pelo == 3 || pelo == 4))) {
				System.out.println("\nSu respuesta no es valida, escoja entre las opciones correctas\n");
			}

			} while (!((pelo == 1 || pelo == 2|| pelo == 3 || pelo == 4)));
			
			
			int ojos;
			do {
			
						
			System.out.println("\nEscoja el número del rasgo, para la faceta:\n ");

			System.out.println("     OJOS");
			System.out.println("1. | O   O |");
			System.out.println("2. |-(· ·)-|");
			System.out.println("3. |-(o o)-|");
			System.out.println("4. | \\   / |\n");

			System.out.print("¿Cual es su opción? (1,2,3 o 4): ");
			ojos = input.nextInt();
			
			if (!((ojos == 1 || ojos == 2|| ojos == 3 || ojos == 4))) {
				System.out.println("\nSu respuesta no es valida, escoja entre las opciones correctas\n");
			}

			} while (!((ojos == 1 || ojos == 2|| ojos == 3 || ojos == 4)));
			
			
			int nariz;
			
			do {
			
			
			System.out.println("\nEscoja el número del rasgo, para la faceta:\n ");

			System.out.println("     NARIZ");
			System.out.println("1. @   J   @");
			System.out.println("2. {   \"   }");
			System.out.println("3. [   j   ]");
			System.out.println("4. <   -   >\n");

			System.out.print("¿Cual es su opción? (1,2,3 o 4): ");
			 nariz = input.nextInt();

			
			if (!((nariz == 1 || nariz == 2|| nariz == 3 || nariz == 4))) {
				System.out.println("\nSu respuesta no es valida, escoja entre las opciones correctas\n");
			}

			} while (!((nariz == 1 || nariz == 2|| nariz == 3 || nariz == 4)));
			
			
			int boca;
			do {
				
			System.out.println("\nEscoja el número del rasgo, para la faceta:\n ");	
				
			System.out.println("     BOCA");
			System.out.println("1. |  ===  |");
			System.out.println("2. |   -   |");
			System.out.println("3. |  ___  |");
			System.out.println("4. |  ---  |\n");

			System.out.print("¿Cual es su opción? (1,2,3 o 4): ");
			boca = input.nextInt();
			
			
			
			if (!((boca == 1 || boca == 2|| boca == 3 || boca == 4))) {
				System.out.println("\nSu respuesta no es valida, escoja entre las opciones correctas\n");
			}

			} while (!((boca == 1 || boca == 2|| boca == 3 || boca == 4)));
			
			
			int barbilla;
			
			do {
			
			System.out.println("\nEscoja el número del rasgo, para la faceta:\n ");

			System.out.println("    BARBILLA");
			System.out.println("1. \\_______/");
			System.out.println("2. \\,,,,,,,/\n");
			

			System.out.print("¿Cual es su opción? (1 o 2): ");
			
			barbilla = input.nextInt();
			
						
			if (!((barbilla == 1 || barbilla == 2))) {
				System.out.println("\nSu respuesta no es valida, escoja entre las opciones correctas\n");
			}

			} while (!((barbilla == 1 || barbilla == 2)));
		
			
			System.out.println("\nESTE ES EL RETRATO QUE HAS GENERADO\n");
			
			
			
			switch (pelo) {
			
			case 1:
				
				System.out.println("wwwwwwwww");
				break;
			
			case 2:	
				System.out.println("\\\\\\//////");
				break;
			
			case 3:
				
				System.out.println("|\"\"\"\"\"\"\"|");
				break;
			case 4:
				
				System.out.println("|||||||||");
				break;

			}
			
switch (ojos) {
			

			case 1:
				
				System.out.println("| O   O |");
				break;
			
			case 2:	
				System.out.println("|-(· ·)-|");
				break;
			
			case 3:
				
				System.out.println("|-(o o)-|");
				break;
			case 4:
				
				System.out.println("| \\   / |");
				break;

			}



switch (nariz) {


case 1:
	
	System.out.println("@   J   @");
	break;

case 2:	
	System.out.println("{   \"   }");
	break;

case 3:
	
	System.out.println("[   j   ]");
	break;
case 4:
	
	System.out.println("<   -   >");
	break;

}



switch (boca) {


case 1:
	
	System.out.println("|  ===  |");
	break;

case 2:	
	System.out.println("|   -   |");
	break;

case 3:
	
	System.out.println("|  ___  |");
	break;
case 4:
	
	System.out.println("|  ---  |");
	break;

}

switch (barbilla) {


case 1:
	
	System.out.println("\\_______/\n");
	break;

case 2:	
	System.out.println("\\,,,,,,,/\n");
	break;
}

	do {
		System.out.print("¿Deseas Jugar de Nuevo? (si/no): ");

		crear = input.next();
        
		if (!(crear.equals("si") || crear.equals("no"))) {
			System.out.println("Su respuesta no es valida/n");
		}

		} while (!(crear.equals("si") || crear.equals("no")));
		
	
		}
	System.out.print("\nMuchas gracias, espero verte pronto.");

					
		
		input.close();
	
	}
}
