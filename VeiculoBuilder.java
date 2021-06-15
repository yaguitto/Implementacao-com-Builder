package lab6_poo_builder;

public interface VeiculoBuilder {
	
	void portas(int portas);
	
	void janelas(int janelas);
	
	void rodas(int rodas);
	
	void marca(String marca);
	
	void modelo(String modelo);
	
	void ano(int ano);
	
	void km(int km);
	
	void potencialEmHp(int potencialEmHp);
	
	void cor(String cor);
	
	Veiculo build();
}
