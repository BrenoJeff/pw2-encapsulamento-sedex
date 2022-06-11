
public class TestaCaixa {
	public static void main(String[] args) {
		int diametro;
		Caixa c = new Caixa();
		c.setAltura(9);
		c.setLargura(12);
		c.setProfundidade(97);
		diametro = 10;
		System.out.println(c.cabeDentro(diametro) );
	}
}
