package tugask4;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){
        //variabel 
        int[] data = {3, 2, 1, 8, 7, 2, 1, 6, 9, 1, 6};
        //Tampilkan bilangan
        System.out.println("data : "+Arrays.toString(data));
        //Proses
        System.out.println("\nProses Bubble Sort Secara Ascending:");
        for(int a= 0; a<data.length; a++){
        //Tampilkan proses iterasi
        System.out.println("Iterasi "+(a+1));
        for (int b= 0; b<data.length-1; b++){if (data[b]>data[b+1]){
        //Proses pertukaran bilangan
        int temp =data[b];
        data[b] = data[b+1];
        data[b+1] = temp;
        }
        //tampilkan proses pertukaran
        System.out.println(Arrays.toString(data));
        }
        System.out.println();
        }
        //tampilkan hasil akhir
        System.out.println("Hasil akhir setelah disorting: "+Arrays.toString(data));
    }
    
}
