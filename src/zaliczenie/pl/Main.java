package zaliczenie.pl;

public class Main {
	public static void main(String[] args) {
		
		kot kot = new kot();
		kot.gatunek = "Kot";
		kot.wiek = 2;
		
		System.out.println("Jednum z kotowatych jest " +kot.gatunek.toString() + ". Kt�ry ma " +kot.wiek + " lata a jego pokarmem jest ");
		kot.pokarm();
	
	}
}
