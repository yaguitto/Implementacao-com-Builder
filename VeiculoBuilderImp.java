package lab6_poo_builder;

public class VeiculoBuilderImp implements VeiculoBuilder, KitLuxo{
	
	private Veiculo veiculo;
	
	public VeiculoBuilderImp() {
		this.veiculo = new Veiculo();
	}
	@Override
	public void portas(int portas) {
		veiculo.setPortas(portas);
	}

	@Override
	public void janelas(int janelas) {
		veiculo.setJanelas(janelas);
	}

	@Override
	public void rodas(int rodas) {
		veiculo.setRodas(rodas);
	}

	@Override
	public void marca(String marca) {
		veiculo.setMarca(marca);
	}

	@Override
	public void modelo(String modelo) {
		veiculo.setModelo(modelo);
	}

	@Override
	public void ano(int ano) {
		veiculo.setAno(ano);
	}

	@Override
	public void km(int km) {
		veiculo.setKm(km);
	}

	@Override
	public void potencialEmHp(int potencialEmHp) {
		veiculo.setPotencialEmHp(potencialEmHp);
	}

	@Override
	public void cor(String cor) {
		veiculo.setCor(cor);
	}

	@Override
	public Veiculo build() {
		return veiculo;
	}
	@Override
	public void conversivel(Boolean com) {
		// TODO Auto-generated method stub
		
	}
	
}
