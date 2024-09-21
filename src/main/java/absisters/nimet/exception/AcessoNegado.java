package absisters.nimet.exception;

public class AcessoNegado extends RuntimeException {
	private final String tag;
	
	    public AcessoNegado(String tag) {
	    	this.tag = tag;
	    }
	    
	   // public AcessoNegado(String tag, Throwable cause) {
	   //     super(message, cause);
}
