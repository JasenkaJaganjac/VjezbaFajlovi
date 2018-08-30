
/*Napisati program koji kao argument prima ime filea te:
a. vraæa broj karaktera u datom fileu
b. vraæa broj rijeèi u datom fileu
c. vraæa broj linija teksta u datom fileu
Rijeèi su razdvojene jednim spaceom.*/
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class BrojKarakteraRijeciLinija {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi ime filea: ");
		String imeFilea = input.nextLine();
		File file = new File(imeFilea + ".txt");
		int brojKaraktera = 0, brojRijeci = 0, brojLinija = 0;
		if (file.exists()) {
			Scanner unos = new Scanner(file);
			while (unos.hasNextLine()) {
				brojLinija++;
				String linija = unos.nextLine();
				for (int i = 0; i < linija.length(); i++) {
					if (Character.isLetter(linija.charAt(i)))
						brojKaraktera++;
				}

				for (int i = 0; i < linija.length(); i++) {
					if (linija.charAt(i) == ' ') {
						brojRijeci++;
					}
				}
				unos.close();
			}
			System.out.println("Broj karaktera u fajlu iznosi: " + brojKaraktera);
			System.out.println("Broj rijeci u fajlu iznosi: " + brojRijeci);
			System.out.println("Broj linija u fajlu iznosi: " + brojLinija);
		} else
			System.out.println("Ne postoji fajl sa tim imenom.");
		input.close();
	}
}
