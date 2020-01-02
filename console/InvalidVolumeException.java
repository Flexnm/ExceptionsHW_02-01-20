package console;

public class InvalidVolumeException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidVolumeException() {
		super("Volume change input causes volume to go out of range.\nCant go lower than 0 or higher than 10.");
	}
	
	

}
