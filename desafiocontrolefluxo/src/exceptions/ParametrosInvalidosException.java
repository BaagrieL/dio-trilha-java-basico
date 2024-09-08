package exceptions;

public class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException() {
        super("O segundo número deve ser maior que o primeiro!");
    }
	
	public ParametrosInvalidosException(String msg) {
        super(msg);
    }
}
