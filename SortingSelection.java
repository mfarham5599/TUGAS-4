import java.util.ArrayList;

public class SortingSelection {

	public static void main(String[] args) {
		ArrayList<Double>data = new ArrayList<Double>();
		data.add(10.0);
		data.add(50.1);
		data.add(11.2);
		data.add(14.3);
		data.add(78.4);
		data.add(19.5);
		data.add(40.6);
		data.add(30.7);
		System.out.println("Data Awal : "+data.toString());
		//BEGIN SORTING
		for(int i=0;i<data.size()-1;i++) {
			Double MIN = data.get(i);
			int indexMIN = i;
			/* check the element to be minimum */
			for(int j=i;j<data.size();j++) {
				if(data.get(j)<MIN) {
					MIN = data.get(j);
					indexMIN=j;
				}//end of if
			}//end of for
			if(indexMIN!=i) {//Tukar
				Double tempBOX = data.get(i);
				data.set(i, data.get(indexMIN));
				data.set(indexMIN, tempBOX);
			}
			
			//print langkah
			System.out.println("Step->"+i+", Min = "+indexMIN+" Swap("+i+","+indexMIN+")"+" -> "+data.toString());
		}//end of for
		
		//End Of Sorting
		System.out.println();
		System.out.println("Hasil Sorting Selection : "+data.toString());

	}
}


