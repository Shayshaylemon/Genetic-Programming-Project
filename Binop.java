import java.util.Random;

public class Binop extends Node {
    protected Node lChild, rChild;
    public Binop() {}
    public Binop(Node l, Node r) {
    	lChild = l; rChild = r;
    }
    public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
    if (this.depth == maxDepth){
    	this.lChild = t.getTerminal(rand);
    	this.rChild = t.getTerminal(rand);
    	this.lChild.depth = this.depth + 1;
    	this.rChild.depth = this.depth + 1;
    }else{
    	int num = rand.nextInt(o.getNumOps() + t.getNumIndepVars());
    	if (num < o.getNumOps()) {
    		this.lChild = o.getOperator(rand);
    		this.lChild.depth = this.depth + 1;
    		this.lChild.addRandomKids(o, t, maxDepth, rand);
    		this.rChild = o.getOperator(rand);
    		this.rChild.depth = this.depth + 1;
    		this.rChild.addRandomKids(o, t, maxDepth, rand);
    	}else{
    		this.lChild = t.getTerminal(rand);
    		this.lChild.depth = this.depth + 1;
    		this.rChild = t.getTerminal(rand);
    		this.rChild.depth = this.depth + 1;
