
import java.util.Random;

public abstract class Node implements Cloneable {
	public int depth;
    public Node() {}
    public double eval(double[] data)
    {	
        System.out.println("Error: eval Node");
        return 0;
    }
    public abstract void addRandomKids (OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);
    
    public Object clone() {
        Object o = null;
        try {
            o =  super.clone();
        }
        catch(CloneNotSupportedException e) {
            System.out.println("SimpleClass can't clone.");
        }
        return o;
    }
}
