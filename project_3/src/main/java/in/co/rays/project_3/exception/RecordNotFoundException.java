package in.co.rays.project_3.exception;

public class RecordNotFoundException extends Exception{
	/**
	 * @author Uttam Singh
	 */
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String msg){
		super(msg);
	}
}
