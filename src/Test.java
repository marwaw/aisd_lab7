
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShellSort s = new ShellSort();
		int ile = 100000;
		int[] tab = s.generate(ile, ile);
		int[] odstepy1 = s.odstepy1(ile);
		int[] odstepy2 = s.odstepy2(ile);
		int[] odstepy3 = s.odstepy3(ile);
		int[] odstepy4 = s.odstepy4(ile);
		long stop, start;
//		s.wyswietl(tab);
		
		System.out.println("ShellSort, wersja InsertSort");
		start =System.currentTimeMillis();
		int[] tab1 = tab.clone();
		s.shellSort1(tab1, odstepy1);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja a: " + (stop-start) + " ms");
		
		int[] tab2 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort1(tab2, odstepy2);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja b " + (stop-start) + " ms");
		
		int[] tab3 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort1(tab3, odstepy3);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja c: " + (stop-start) + " ms");
		
		int[] tab4 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort1(tab4, odstepy4);
		stop =System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja d: " + (stop-start) + " ms");
		
		System.out.println("----------------------------------------");
		
		System.out.println("ShellSort, wersja z insertSort i bubbleSort");
		
		int[] tab5 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort2(tab5, odstepy1);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja a: " + (stop-start) + " ms");
		
		int[] tab6 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort2(tab6, odstepy2);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja b: " + (stop-start) + " ms");
		
		int[] tab7 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort2(tab7, odstepy3);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja c: " + (stop-start) + " ms");
		
		int[] tab8 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort2(tab8, odstepy4);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja d: " + (stop-start) + " ms");
		
		System.out.println("----------------------------------------");
		
		System.out.println("ShellSort, wersja z bubbleSort i insertSort");
		int[] tab9 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort3(tab9, odstepy1);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja a: " + (stop-start) + " ms");
		
		int[] tab10 = tab.clone();
		start = System.currentTimeMillis();
		s.shellSort3(tab10, odstepy2);
		stop = System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja b: " + (stop-start) + " ms");
		
		int[] tab11 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort3(tab11, odstepy3);
		stop=System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja c: " + (stop-start) + " ms");
		
		int[] tab12 = tab.clone();
		start =System.currentTimeMillis();
		s.shellSort3(tab12, odstepy4);
		stop =System.currentTimeMillis();
		System.out.println("Czas sortowania, wersja d: " + (stop-start) + " ms");
		System.out.println("----------------------------------------");
	}

}
