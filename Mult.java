public class Mult extends Binop {
	public Mult (Node l, Node r) {
        super(l, r);
    }
	public Mult() {super.lChild = null; super.rChild = null;}
    public double eval(double[] data) {
        return lChild.eval(data) * rChild.eval(data);
    }
//    added toString() for the purpose of printing out the expression
    public String toString() {
		return "(" + lChild.toString() + "*" + rChild.toString() + ")";	
      }
}
