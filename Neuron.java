
import java.util.ArrayList;

/**
*
* Описание базового нейрона.
* Description of basic neuron (Dsc of bsc nrn).
*
*/
class Neuron {

	/** */
	private ArrayList<Double> listOfWeightIn;

	/** */
	private ArrayList<Double> listOfWeightOut;

	/** */
	Neuron() {
		// TO-DO
	} // Neuron()

	/** 
	* Initializes listOfWeightIn and
	* listOfWeightOut function with a pseudo
	* random real number
	*/
	public void initNeuron() {
		
		listOfWeightIn = (Math.random() * 10) ;
		listOfWeightOut = (Math.random() * 10) ;
	} // initNeuron()

	/** */
	public void setListOfWeightIn(ArrayList<Double> lst) {

		// TO-DO
	} // setListOfWeightIn

	/** */
	public void setListOfWeightOut(ArrayList<Double> lst) {

		// TO-DO
	} // setListOfWeightOut

	/** */
	public ArrayList<Double> getListOfWeightIn() {

		return listOfWeightIn;
	} // getListOfWeightIn

	/** */
	public ArrayList<Double> getListOfWeightOut() {

		return listOfWeightOut;
	} // getListOfWeightOut
} // Neuron