import java.util.Arrays;

public class bubbleshort {
	public static void main(String[] args) {
	Double[] bilangan = {10.0 , 50.1 , 11.2 , 14.3 , 78.4 , 19.5 , 40.6 , 30.7};
	
	System.out.println("Data Awal : "+Arrays.toString(bilangan));
	System.out.println();
	System.out.println("Proses Bubble Sort :");
	System.out.println();
	
	for(int a = 0; a < bilangan.length; a++) {
		
		for(int b = 0; b < bilangan.length-1; b++) {
			if(bilangan[b] > bilangan[b+1]) {
				Double temp = bilangan[b];
				bilangan[b] = bilangan[b+1];
				bilangan[b+1] = temp;
			}
			System.out.println("Step->"+(a+1)+", Min = "+bilangan[b+1]+" Swap("+(a+1)+","+bilangan[b+1]+")"+" -> "+Arrays.toString(bilangan));
		}
		
		System.out.println();
	}
	System.out.println("Hasil Sorting Bubble : "+Arrays.toString(bilangan));
	}
}