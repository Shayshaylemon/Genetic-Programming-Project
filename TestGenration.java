import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class TestGenration {
	static int numIndepVars = 3;
    static int maxDepth = 3;
    static Random rand = new Random();
    
	public static void main(String[] args) {
		
	System.out.println("please type the data filename");
	Scanner keyboard = new Scanner(System.in);
	String filename = keyboard.nextLine();
	DataSet newDataSet = new DataSet(filename);
	Scanner file = null;
	
	try {
	    file = new Scanner(new File(filename));
	}
	catch (FileNotFoundException f) {
	    System.out.println("Sorry, couldn't find that file.");
	    System.exit(0);
	}
	
    Node[] ops = {new Plus(), new Minus(), new Mult(), new Divide()};
    OperatorFactory o = new OperatorFactory(ops);
    TerminalFactory t = new TerminalFactory(numIndepVars);
    Generation generation = new Generation(500, o, t, maxDepth, rand);
   
	newDataSet.readData(file);
	generation.evalAll(newDataSet);
