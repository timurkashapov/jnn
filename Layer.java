import java.util.ArrayList;

/**
*
* Слой нейронной сети.
* Layer of neural network. (lr of nrl ntw)
*
*/
class Layer {

	/** */
	private ArrayList<Neuron> listOfNeurons;

	/** */
	private int numberOfNeuronsInLayer;

	/** */
	Layer() {

		// TO-DO
	} // Layer()

	/** */
	public ArrayList<Neuron> setListOfNeurons(ArrayList<Neuron> lst) {

		listOfNeurons = lst;
	} // setListOfNeurons()

	/** */
	public ArrayList<Neuron> getListOfNeurons() {

		return listOfNeurons;
	} // getListOfNeurons()

	/** */
	public void setNumberOfNeuronsInLayer(int n) {

		numberOfNeuronsInLayer = n;
	} // setNumberOfNeuronsInLayer()

	/** */
	public int getNumberOfNeuronsInLayer() {

		return numberOfNeuronsInLayer;
	} // getNumberOfNeuronsInLayer()

} // Layer