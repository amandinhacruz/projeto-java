package conta.repository;

public interface IContaRepository {
	//CRUD
	public void procurarPorNumero(int numero);
	public void listarContas();
	public void cadastrar(String usuario);
	public void remedio();
	public void visualizar();
	public void finalizarPagamento();
	

}
