package sorting;

import java.util.Arrays;
import java.util.Random;

public class question1 {

	public static Long[] generateRandomKeys() {
		int keysToGenerate = 1000000;
		Random random = new Random();
		Long[] newArray = new Long[keysToGenerate+1];

		for (int item = 0; item < keysToGenerate; item++) {
			long randomKey = random.nextLong();
			newArray[item] = randomKey;
		}
		return newArray;	
	}
	
	public static long dualPivotQuickSort(Long[] randomLongArray) {
		long dualPivotQuickSortStartTime = System.nanoTime();
		Arrays.sort(randomLongArray);
		long dualPivotQuickSortEndTime = System.nanoTime();
		return dualPivotQuickSortEndTime-dualPivotQuickSortStartTime;
	}
	
	public static long mergeSort(Long[] randomLongArray) {
		long mergeSortStartTime = System.nanoTime();
		System.out.println( mergeSortStartTime);
		Sort.mergeSort(randomLongArray);
		long mergeSortEndTime = System.nanoTime();
		System.out.println( mergeSortEndTime);
		return mergeSortEndTime-mergeSortStartTime;
	}
	
	public static long quickSort(Long[] randomLongArray) {
		long quickSortStartTime =System.nanoTime();
		Sort.quicksort(randomLongArray);
		long quickSortEndTime = System.nanoTime();
		return quickSortEndTime-quickSortStartTime;
	}
	
	public static long heapSort(Long[] randomLongArray) {
		long heapSortStartTime = System.nanoTime();
		Sort.heapsort(randomLongArray);
		long heapSortEndTime = System.nanoTime();
		return heapSortEndTime-heapSortStartTime;
	}

	public static void main( String [ ] args )
	{
		Long[] randomLongArray = generateRandomKeys();
		long dualPivotQuickSortTotalTime = 0;
		long mergeSortTotalTime = 0;
		long quickSortTotalTime = 0;
		long heapSortTotalTime = 0;
		int repetitions = 10;
		for( int item = 0; item < repetitions; item++) {
			System.out.println(randomLongArray[item]);
			mergeSortTotalTime += mergeSort(randomLongArray);
			quickSortTotalTime += quickSort(randomLongArray);
			heapSortTotalTime += heapSort(randomLongArray);
			dualPivotQuickSortTotalTime += dualPivotQuickSort(randomLongArray);
		}
		System.out.println( "1.");
		System.out.println( "  Merge Sort: "+(mergeSortTotalTime/repetitions)+" ns");
		System.out.println( "  Quick Sort: "+(quickSortTotalTime/repetitions)+" ns");
		System.out.println( "  Heap Sort: "+(heapSortTotalTime/repetitions)+" ns");
		System.out.println( "  Dual-Pivot Quick Sort: "+(dualPivotQuickSortTotalTime/repetitions)+" ns");
	}
}
