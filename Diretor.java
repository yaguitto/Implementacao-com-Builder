package lab6_poo_builder;

public class Diretor {
	
	private KitLuxo builder;
	
	public Diretor(KitLuxo builder) {
		this.builder = builder;
	}
	public Veiculo fabricar(String tipo ) {
		if(tipo.equals("moto")) {
		builder.cor("preto");
		builder.ano(2019);
		builder.km(0);
		builder.rodas(2);
		builder.potencialEmHp(50);
		builder.marca("yahama");
		builder.modelo("MT-O9");
		
		builder.conversivel(false);
		}
		else if(tipo.equals("carro")){
			builder.ano(2019);
			builder.cor("azul");
			builder.janelas(4);
			builder.km(0);
			builder.marca("honda");
			builder.modelo("civic");
			builder.portas(4);
			builder.rodas(4);
			builder.potencialEmHp(170);
			
			builder.conversivel(false);
		}
		return builder.build();
		
	}
}
