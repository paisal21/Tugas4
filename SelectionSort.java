package tugask4;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args){
     int[] data = {3,2,1,8,2,7,2,1,6,9,1,6};
		//PRINT INPUT
		System.out.print("INPUT: ");
		for(int i = 0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
		
		//BEGIN SELECTION SORT
		for(int i = 0;i<data.length-1;i++){
			int min = data[i];
			int indexNewMin = i;
			for(int j = i+1;j<data.length;j++){
				if(min>data[j]){
					min = data[j];
					indexNewMin = j;
				}
			}
			if(i!=indexNewMin){
				int tempBox = data[i];
				data[i] = data[indexNewMin];
				data[indexNewMin] = tempBox;
			}
			
			System.out.print("\nStep-"+i+" --> ");
			for(int k = 0;k<data.length;k++){
				System.out.print(data[k]+" ");
			}
		}
		//END OF SELECTION SORT
		
		//HASILNYA
		System.out.print("\nHASIL SORTING: ");
		for(int i = 0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}

	}
}
