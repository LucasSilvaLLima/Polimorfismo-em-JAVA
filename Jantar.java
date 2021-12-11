package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.40);
		
		Comida arroz = new Arroz(0.3);
		Comida feijao = new Feijao(0.1);
		Comida sorvete = new Sorvete(0.2);
		
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		convidado.comer(sorvete);
		convidado.comer(sorvete);
		
		
		System.out.println(convidado.getPeso());
	}
}
