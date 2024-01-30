package sorting;

import java.util.Arrays;

public class question2 {
	public static String[] genRandomStringArr( int arrLength ) 
	{
		String ranStringArr[] = new String[arrLength];
		for( int tool = 0; tool < arrLength; tool++ ) {
			String charsList = "ABCDEFGHIJK" + "LMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijkl" + "mnopqrstuvxyz"; 
			StringBuilder newBuiltStr = new StringBuilder(10); 
			for (int tool2 = 0; tool2 < 10; tool2++) { 
				int strIndex = (int)(charsList.length() * Math.random());  
				newBuiltStr.append(charsList.charAt(strIndex)); 
			}
			ranStringArr[tool] = newBuiltStr.toString(); 
		}
		return ranStringArr;
	}
	
	public static long dualPivotQuickSort(String[] randomLongArray) {
		long dualPivotQuickSortStartTime = System.nanoTime();
		Arrays.sort(randomLongArray);
		long dualPivotQuickSortEndTime = System.nanoTime();
		return dualPivotQuickSortEndTime-dualPivotQuickSortStartTime;
	}
	
	public static long executeMergeSort(String[] randomLongArray) {
		long MSortStartTime = System.nanoTime();
		Sort.mergeSort(randomLongArray);
		long MSortEndTime = System.nanoTime();
		return MSortEndTime-MSortStartTime;
	}
	
	public static long executeQuickSort(String[] randomLongArray) {
		long QSortStartTime =System.nanoTime();
		Sort.quicksort(randomLongArray);
		long QSortEndTime = System.nanoTime();
		return QSortEndTime-QSortStartTime;
	}
	
	public static long executeHeapSort(String[] randomLongArray) {
		long HSortStartTime = System.nanoTime();
		Sort.heapsort(randomLongArray);
		long HSortEndTime = System.nanoTime();
		return HSortEndTime-HSortStartTime;
	}
	
	public static long executeRadixSort(String[] randomLongArray, int stringLength) {
		long radixSortStartTime = System.nanoTime();
		RadixSort.radixSortA(randomLongArray, stringLength);
		long radixSortEndTime = System.nanoTime();
		return radixSortEndTime-radixSortStartTime;
	}

	public static void main( String [ ] args )
	{
		String[] randomLongArray4 = genRandomStringArr(4);
		long dualPivotQuickSortTotalTime4 =0 ;
		long mergeSortTotalTime4 =0 ;
		long quickSortTotalTime4 =0 ;
		long heapSortTotalTime4 =0 ;
		long radixSortTotalTime4 =0 ;
		int repetitions = 10;
		for( int tool = 0; tool < repetitions; tool++) {
			mergeSortTotalTime4 += executeMergeSort(randomLongArray4);
			quickSortTotalTime4 += executeQuickSort(randomLongArray4);
			heapSortTotalTime4 += executeHeapSort(randomLongArray4);
			dualPivotQuickSortTotalTime4 += dualPivotQuickSort(randomLongArray4);
			radixSortTotalTime4 += executeRadixSort(randomLongArray4, 4);
		}
		System.out.println( "2.");
		System.out.println( "  One Million Strings of length 4");
		System.out.println( "  ===============================");
		System.out.println( "  Merge Sort: "+(mergeSortTotalTime4/repetitions)+" ns");
		System.out.println( "  Quick Sort: "+(quickSortTotalTime4/repetitions)+" ns");
		System.out.println( "  Heap Sort: "+(heapSortTotalTime4/repetitions)+" ns");
		System.out.println( "  Dual-Pivot Quick Sort: "+(dualPivotQuickSortTotalTime4/repetitions)+" ns");
		System.out.println( "  Radix Sort: "+(radixSortTotalTime4/repetitions)+" ns");
		
		String[] randomLongArray6 = genRandomStringArr(6);
		long dualPivotQuickSortTotalTime6 = 0;
		long mergeSortTotalTime6 = 0;
		long quickSortTotalTime6 = 0;
		long heapSortTotalTime6 = 0;
		long radixSortTotalTime6 = 0;
		for( int tool = 0; tool < repetitions; tool++) {
			mergeSortTotalTime6 += executeMergeSort(randomLongArray6);
			quickSortTotalTime6 += executeQuickSort(randomLongArray6);
			heapSortTotalTime6 += executeHeapSort(randomLongArray6);
			dualPivotQuickSortTotalTime6 += dualPivotQuickSort(randomLongArray6);
			radixSortTotalTime6 += executeRadixSort(randomLongArray6, 6);
		}
		System.out.println( "\n");
		System.out.println( "  One Million Strings of length 6");
		System.out.println( "  ===============================");
		System.out.println( "  Merge Sort: "+(mergeSortTotalTime6/repetitions)+" ns");
		System.out.println( "  Quick Sort: "+(quickSortTotalTime6/repetitions)+" ns");
		System.out.println( "  Heap Sort: "+(heapSortTotalTime6/repetitions)+" ns");
		System.out.println( "  Dual-Pivot Quick Sort: "+(dualPivotQuickSortTotalTime6/repetitions)+" ns");
		System.out.println( "  Radix Sort: "+(radixSortTotalTime6/repetitions)+" ns");
		
		String[] randomLongArray8 = genRandomStringArr(8);
		long dualPivotQuickSortTotalTime8 = 0;
		long mergeSortTotalTime8 = 0;
		long quickSortTotalTime8 = 0;
		long heapSortTotalTime8 = 0;
		long radixSortTotalTime8 = 0;
		for( int tool = 0; tool < repetitions; tool++) {
			mergeSortTotalTime8 += executeMergeSort(randomLongArray8);
			quickSortTotalTime8 += executeQuickSort(randomLongArray8);
			heapSortTotalTime8 += executeHeapSort(randomLongArray8);
			dualPivotQuickSortTotalTime8 += dualPivotQuickSort(randomLongArray8);
			radixSortTotalTime8 += executeRadixSort(randomLongArray8, 8);
		}
		System.out.println( "\n");
		System.out.println( "  One Million Strings of length 8");
		System.out.println( "  ================================");
		System.out.println( "  Merge Sort: "+(mergeSortTotalTime8/repetitions)+" ns");
		System.out.println( "  Quick Sort: "+(quickSortTotalTime8/repetitions)+" ns");
		System.out.println( "  Heap Sort: "+(heapSortTotalTime8/repetitions)+" ns");
		System.out.println( "  Dual-Pivot Quick Sort: "+(dualPivotQuickSortTotalTime8/repetitions)+" ns");
		System.out.println( "  Radix Sort: "+(radixSortTotalTime8/repetitions)+" ns");
	}
}
