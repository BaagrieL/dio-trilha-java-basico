package exceptions;

public class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException() {
        super("Erro: dados de entrada inválidos");
    }
	
	public ParametrosInvalidosException(String msg) {
        super(msg);
    }
}
