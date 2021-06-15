package lab6_poo_builder;

public class ClasseCliente {
	public static void main(String[] args) {
	
	var builder = new VeiculoBuilderImp();
	
	var diretor = new Diretor(builder);
	
	var moto = diretor.fabricar("moto");
	System.out.println(moto);
	
	System.out.println();
	
	var carro = diretor.fabricar("carro");
	System.out.println(carro);
	}
}