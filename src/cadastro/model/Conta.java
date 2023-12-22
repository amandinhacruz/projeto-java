package cadastro.model;

public class Conta {

private int numero;
private String usuario;
private int senha;
private int carrinho;

public Conta(){
	super();
}

public Conta(int numero, String usuario, int senha, int carrinho) {
	this.numero = numero;
	this.usuario = usuario;
	this.senha = senha;
	this.carrinho = carrinho; 
}

public int getCarrinho() {
	return carrinho;
}

public void setCarrinho(int carrinho) {
	this.carrinho = carrinho;
}

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public void visualizar() {
	System.out.println("***********************");
	System.out.println("Número da conta: "+ this.numero);
	System.out.println("Usuário: " +this.usuario);
	System.out.println("Carrinho: "+this.carrinho);
}

}
