package tugask4;
public class InsertionSort {
    public static void main(String[] args){
     int[] data = {3,2,1,8,2,7,2,1,6,9,1,6};
		//PRINT INPUT
		System.out.print("INPUT: ");
		for(int i = 0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
		
		//BEGIN INSERTION SORT
		for(int i = 0;i<data.length-1;i++){
			int min = data[i];
			int j =i;
			while((j>0)&&(min<data[j-1]))
                        {
                        data[j]=data[j-1];
                        j--;
                        }
                        System.out.print("\nStep-"+i+" --> ");
			for(int h = 0;h<data.length;h++){
				System.out.print(data[h]+" ");
                        data[j]=min;						}
			}
               System.out.print("\nHASIL SORTING: ");
		for (int i=0 ;i<data.length;i++){
			System.out.print(data[i]+",");
    }
    }
}
