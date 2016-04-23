package homework;

public interface TollBooth {
	
	/**
	 * Method to calculate total amount due
	 * @param truck
	 * @return
	 */
	public int calculateToll(Truck truck);
	
	/**
	 * displays the total on the screen.
	 */
	public void displayReciept();
	
	/**
	 * display toll info on screen
	 */
	
	public void displayToll();
	
	/**
	 * resets the toll system
	 */
	public void resetToll();

}
