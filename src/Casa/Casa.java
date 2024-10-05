package Casa;

public class Casa {
	Quarto[] quartos;
    Pessoa[] moradores;

    public Casa(Quarto[] quartos, Pessoa[] moradores) {
        this.quartos = quartos;
        this.moradores = moradores;
    }

    public void displayDetalhes() {
        System.out.println("A casa possui os quartos:");
        for (Quarto quarto : quartos) {
            System.out.println("Tipo: " + quarto.getTipo());
        }

        System.out.println("\nA casa tem os moradores:");
        for (Pessoa pessoa : moradores) {
            System.out.println("Moradores: " + pessoa.getNome());
        }
    }
}
