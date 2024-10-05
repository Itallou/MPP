package Casa;

public class Demo {
	    public static void main(String[] args) {
	        Quarto q1 = new Quarto("Quarto");
	        Quarto q2 = new Quarto("Suite");
	        Quarto q3 = new Quarto("Quarto de visita");
	        Quarto[] quartos = { q1, q2, q3 };

	        Pessoa p1 = new Pessoa("Nelson");
	        Pessoa p2 = new Pessoa("Ítallo");
	        Pessoa[] moradores = { p1, p2 };

	        Casa casa = new Casa(quartos, moradores);

	        casa.displayDetalhes();
	}
}
