import java.util.Random;

public class Variable extends Node {
	public int index;
	double x;
	
	public Variable() {}
    public Variable(double[] data) { 
		Random randomindex = new Random();
		index = randomindex.nextInt(3);
		x = data[index];
    }
	public double eval(double[] data) { 
		return data[index]; }
    public String toString() {
    	return "X" + index;
    }
    public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {}
}
