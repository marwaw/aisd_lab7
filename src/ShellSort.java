import java.util.ArrayList;
import java.util.Random;

public class ShellSort {
	
	public ShellSort(){}
	
	public int[] generate(int size, int range) {
		int[] tablica = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			tablica[i] = r.nextInt(range);
		}
		return tablica;
	}
	
	public void swap(int[] arr, int left, int right) {
		int pom = arr[left];
		arr[left] = arr[right];
		arr[right] = pom;
	}
	
	public int[] odstepy1(int n){
		ArrayList<Integer> arr = new ArrayList<>();
		int h = 1;
		while (h<n){
			arr.add(h);
			h = 3*h+1;
		}
		int[] odstepy = new int[arr.size()];
		for(int i=0; i<arr.size(); i++){
			odstepy[i] = arr.get(i);
		}
		return odstepy;
	}
	
	public int[] odstepy2(int n){
		ArrayList<Integer> arr = new ArrayList<>();
		int k = 2;
		int h = 1;
		while (h<n){
			arr.add(h);
			h = (int)Math.pow(2, k)-1;
			k++;
		}
		int[] odstepy = new int[arr.size()];
		for(int i=0; i<arr.size(); i++){
			odstepy[i] = arr.get(i);
		}
		return odstepy;
	}
	
	public int[] odstepy3(int n){
		ArrayList<Integer> arr = new ArrayList<>();
		int k = 1;
		int h = 1;
		while (h<n){
			arr.add(h);
			h = (int)Math.pow(2, k)+1;
			k++;
		}
		int[] odstepy = new int[arr.size()];
		for(int i=0; i<arr.size(); i++){
			odstepy[i] = arr.get(i);
		}
		return odstepy;
	}
	
	public int[] odstepy4(int n){
		ArrayList<Integer> arr = new ArrayList<>();
		int k = 1;
		int h = 1;
		while (h<n){
			arr.add(h);
			int pom = h;
			h = h+ k;
			k = pom;
		}
		int[] odstepy = new int[arr.size()];
		for(int i=0; i<arr.size(); i++){
			odstepy[i] = arr.get(i);
		}
		return odstepy;
	}
	
	public void shellSort1(int[] arr, int[] odstepy){
		int size = arr.length;
//		int[] odstepy = chooseOption(od, size);
		int n = odstepy.length-1;
		int h = odstepy[n];
		
		while(h>=1 && n >= 0){
			h = odstepy[n];
			insertSort(arr,size,h);
			n--;
		}
	}
	
	public void shellSort2(int[] arr, int[] odstepy){
		int size = arr.length;
		int n = odstepy.length-1;
		int h = odstepy[n];
		
		while(h >= 2 && n >= 1){
			insertSort(arr,size,h);
			n--;
			h = odstepy[n];
		}
		bubbleSort2(arr, size, h);
	}
	
	public void shellSort3(int[] arr, int[] odstepy){
		int size = arr.length;

		int n = odstepy.length-1;
		int h = odstepy[n];
		
		while(h >= 2 && n >= 1){
			bubbleSort2(arr, size, h);
			n--;
			h = odstepy[n];
		}
		insertSort(arr,size,h);
	}
	
	public void insertSort(int[] arr, int n, int h){
		int temp,j;
		for(int i = h; i < n; i++){
			temp = arr[i];
			for(j = i; j >= h && temp < arr[j-h]; j-=h){
				arr[j] = arr[j-h];
			}
			arr[j] = temp;
		}
	}
	
	public void bubbleSort(int[]arr, int n, int h){
		for(int i = h; i < n; i++){
			for(int j = 0; j>=0 && j+h < n; j+=h){
				if(arr[j] > arr [j+h]){
					swap(arr, j, j+h);
				}
			}
		}
	}
	
	public void bubbleSort2(int[] arr, int n, int h){
		int lastSwap = n-1;
		
		while(lastSwap>0){
			int end = lastSwap;
			lastSwap = 0;
			for(int i = 0; i+h < end; i++){
				if(arr[i] > arr [i+h]){
					int temp = arr[i];
					while(i+h < end && temp > arr[i+h]){
						arr[i] = arr[i+h];
						i=i+h;
					}
					lastSwap = i;
					arr[i] = temp;
				}
			}
		}
	}
	
	public int[] chooseOption(int op, int size){
		int[] arr;
		switch(op){
		case 1: arr = odstepy1(size); break;
		case 2: arr = odstepy2(size); break;
		case 3: arr = odstepy3(size); break;
		case 4: arr = odstepy4(size); break;
		default: arr = new int[]{1};
	}
		return arr;
		
	}
	
	public void wyswietl(int[] tablica) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.println(tablica[i]);	
		}
	}
	
}
