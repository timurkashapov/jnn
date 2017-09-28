/**
*
* The values of the neural net topology are fixed in this class 
* two neurons in the input layer
* two hidden layers with three neurons each, 
* and one neuron in the output layer).
*
* Reminder: It's the first version. 
*
*/
class NeuralNetwork {

	/** An object of the InputLayer class. */
	private InputLayer inputLayer;

	/** An object of the HiddenLayer class. */
	private HiddenLayer hiddenLayer;

	/**  List of the hidden layers. */
	private ArrayList<HiddenLayer> listOfHiddenLayers;

	/** Number of the hidden layers. */
	private int numberOfHiddenLayers;

	/** An object of the OutputLayer class. */
	private OutLayer outputLayer;

	/** */
	NeuralNetwork() {

		// TO-DO
	} // NeuralNetwork()


	/** 
	*
	* Initializes the neural network as a whole.
	* Layers are built, and each list of the 
	* weights of neurons is built randomly.
	* 
	*/
	public initNet() {

		// TO-DO
	} // initNet()

	/**
	*
	* Prints the neural network as a whole.
	* Each input and output weight of each is shown.
	*
	*/
	public void printNet() {

		// TO-DO
	} // printNet()

} // NeuralNetwork