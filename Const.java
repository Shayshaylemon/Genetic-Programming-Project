import java.util.Random;

public class Const extends Node {
	private double value;
	public Const() {}
    public Const(double d) { value = d; }
    public double eval(double[] data) { return value; }
    public String toString() {
    	return String.valueOf(value);
    }
    public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {}
}
