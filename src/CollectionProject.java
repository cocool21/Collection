import java.util.ArrayList; 
import java.util.Scanner;
import java.util.Collections;
public class CollectionProject {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> fav = new ArrayList<String>();
		String thing=" ";
		System.out.println("Enter your favorite movies or book:");
		thing=sc.nextLine();
		while(thing.equals("")!=true){
		fav.add(thing); 
		System.out.println("Enter your favorite movies or book:");
		thing=sc.nextLine();
		}
		Collections.sort(fav);
		for(String favorites:fav){
			System.out.println(favorites);
		}
		sc.close();
	}

}
