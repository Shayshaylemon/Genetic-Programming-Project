import java.util.Random;


public class TerminalFactory {
	private int numIndepVars;
	
	public TerminalFactory(int n) {
		numIndepVars = n;
	}
	
	public int getNumIndepVars() {
		return numIndepVars;
	}
	
	public Node getTerminal(Random rand) {
		Node a = null;
		int randomnum = rand.nextInt(numIndepVars + 1);
		if (randomnum < numIndepVars) {
			Variable b = new Variable();
			b.index = randomnum;
			a = b;
		}else if(randomnum == numIndepVars){
			Double num = rand.nextDouble(); 
			Const b = new Const(num);	
			a = b;
			}
		return a;
