package zaliczenie.pl;

public class Main {
	public static void main(String[] args) {
		
		kot kot = new kot();
		kot.gatunek = "Kot";
		kot.wiek = 2;
		
		System.out.println("Jednum z kotowatych jest " +kot.gatunek.toString() + ". Który ma " +kot.wiek + " lata a jego pokarmem jest ");
		kot.pokarm();
		
		pies jamnik = new pies();
		jamnik.gatunek = "Jamnik";
		jamnik.wiek = 3;
		System.out.println("Psem domowym jest " +jamnik.gatunek.toString() + ". Który ma " +jamnik.wiek + " lata");
		
	
	}
}
