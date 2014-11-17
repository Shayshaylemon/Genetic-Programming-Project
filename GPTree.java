import java.util.Random;


public class GPTree {
	private Node root;
    public double sum = 0;

    GPTree() { root = null; }
    GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
        root = o.getOperator(rand);
        root.addRandomKids(o, t, maxDepth, rand);
    }
    public String toString() { return root.toString(); }
    public double eval(double[] data) { return root.eval(data); }
//    use eval(double[] data) to create the method with a diffrent argument : dataset
    public double eval(DataSet dataset) { 
    	for( int i = 0; i < dataset.numofRows; i++) {
    		sum = sum + Math.sqrt((root.eval((dataset.DRarraylist.get(i).getXarray()))) - dataset.DRarraylist.get(i).getY());
    	}
    	return sum;
    }
}
