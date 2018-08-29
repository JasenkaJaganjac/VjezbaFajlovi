
/*Napisati program koji prima kao argument ime filea. Nakon �to je program u�itao file, vra�a korisniku sve re�enice iz filea sa razmacima
izme�u rije�i uklonjenim. */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class BezRazmaka {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi ime filea: ");
		String imeFilea = input.nextLine();
		File file = new File(imeFilea + ".txt");
		if (file.exists()) {
			Scanner unos = new Scanner(file);
			while (unos.hasNextLine()) {
				String linija = unos.nextLine();
				for (int i = 0; i < linija.length(); i++) {
					if (linija.charAt(i) != ' ')
						System.out.print(linija.charAt(i));
				}

			}

		} else
			System.out.println("Ne postoji fajl sa tim imenom.");

	}

}
