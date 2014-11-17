import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
	public ArrayList<DataRow> DRarraylist;
	private static int indVarNum;
	public int numofRows;
	private static String filename;

	DataSet(String filename) {
		DataSet.filename = filename;
		DRarraylist = new ArrayList<DataRow>();
	}
	
	public ArrayList<DataRow> getDRarraylist() {
		return DRarraylist;
	}

	public void addDataRow(DataRow newDataRow) {
		DRarraylist.add(newDataRow);
	}

	public void readData(Scanner file) {
		indVarNum = file.nextInt();
		numofRows = file.nextInt();

		for(int i = 0; i <= numofRows-1; i++) {
			DRarraylist.add(i,new DataRow());
			DRarraylist.get(i).setY(file.nextDouble());
			for(int j = 1; j<= indVarNum; j++ ) {
				DRarraylist.get(i).addX(file.nextDouble(), (j-1));
			}
		}
	}
}
