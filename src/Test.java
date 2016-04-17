
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShellSort s = new ShellSort();
		int[] tab = s.generate(100000, 100000);
		long stop, start;
		
		System.out.println("ShellSort, wersja InsertSort");
		start =System.currentTimeMillis();
		int[] tab1 = tab.clone();
		s.shellSort1(tab1, 1);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja a: " + (stop-start) + " ms");
		
		int[] tab2 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort1(tab2, 2);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja b " + (stop-start) + " ms");
		
		int[] tab3 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort1(tab3, 3);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja c: " + (stop-start) + " ms");
		
		int[] tab4 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort1(tab4, 4);
		stop =System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja d: " + (stop-start) + " ms");
		
		System.out.println("----------------------------------------");
		
		System.out.println("ShellSort, wersja z insertSort i bubbleSort");
		
		int[] tab5 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort2(tab5, 1);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja a: " + (stop-start) + " ms");
		
		int[] tab6 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort2(tab6, 2);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja b: " + (stop-start) + " ms");
		
		int[] tab7 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort2(tab7, 3);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja c: " + (stop-start) + " ms");
		
		int[] tab8 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort2(tab8, 4);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja d: " + (stop-start) + " ms");
		
		System.out.println("----------------------------------------");
		
		System.out.println("ShellSort, wersja z bubbleSort i insertSort");
		int[] tab9 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort3(tab9, 1);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja a: " + (stop-start) + " ms");
		
		int[] tab10 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort3(tab10, 2);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja b: " + (stop-start) + " ms");
		
		int[] tab11 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort3(tab11, 3);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja c: " + (stop-start) + " ms");
		
		int[] tab12 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort3(tab12, 4);
		stop =System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja d: " + (stop-start) + " ms");
		System.out.println("----------------------------------------");
//		s.shellSort2(tab, h);
//		s.wyswietl(tab);
	}

}
