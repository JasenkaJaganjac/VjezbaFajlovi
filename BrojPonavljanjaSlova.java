
/*Napisati program koji pita korisnika da unese ime filea. Nakon 
 * što je korisnik unio ime filea, program vraæa koliko se puta 
 * koje slovo ponovilo u fileu. Program pravi razliku izmeðu 
 * velikih i malih slova – to jeste, vraæa koliko puta se ponovilo 
 * slovo 'a' i koliko se puta ponovilo slovo 'A'.*/
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class BrojPonavljanjaSlova {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesi  ime fajla: ");
		String imeFajla = input.nextLine()+".txt";
		FileReader fr = new FileReader(imeFajla);
		BufferedReader br = new BufferedReader(fr);
		String linija = "";
		String cijeliTekst = "";
		while ((linija = br.readLine()) != null) {
			cijeliTekst += linija;
		}
		int[] niz = new int[123];
		for (int i = 0; i < cijeliTekst.length(); i++) {
			int index = (int) cijeliTekst.charAt(i);
			niz[index]++;

		}
		for (int i = 65; i < 91; i++) {
			if(niz[i]!=0)
			System.out.println((char) i + ": " + niz[i]);
		}
		for (int i = 97; i < 123; i++) {
			if(niz[i]!=0)
			System.out.println((char) i + ": " + niz[i]);
		}

		input.close();
		br.close();
	}

}
