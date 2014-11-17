import java.util.Random;

public class OperatorFactory {
	private Node[] BinopArray;
	public int numOperators;

	public OperatorFactory (Node[] n) {
		BinopArray = n;
		numOperators = n.length;
	}
	
	public Node getOperator(Random rand) {
		Node a = BinopArray[rand.nextInt(4)];
		return (Node)(a.clone());
	}
	
	public int getNumOps() {return numOperators;}
}    
