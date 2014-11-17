public class Divide extends Binop {
	public Divide (Node l, Node r) {
        super(l, r);
    }
	public Divide() {super.lChild = null; super.rChild = null;}
    public double eval(double[] data) {
        return lChild.eval(data) / rChild.eval(data);
    }
//  added toString() for the purpose of printing out the expression
    public String toString() {
    	return "(" + lChild.toString() + "/" + rChild.toString() + ")";	
    }
}
