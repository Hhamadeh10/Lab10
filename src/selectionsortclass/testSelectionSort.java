package selectionsortclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixes();
		testDuplicates();
		}
		public void testPositive(){
			int[] arr = new int[5];
		arr[0] = 8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 12;
		SelectionSort temp1 = new SelectionSort();
		int sorted[] = temp1.basicSelectionSort(arr);
		int[] correct = {7,8,9,10,12};
		for (int i = 0; i < sorted.length; ++i) {
			System.out.println(sorted[i]);
		}
	/** add tests to check for this unit test **/
		assertArrayEquals(correct,sorted);
		//System.out.println(maxValue);
		}
		public void testNegative(){
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = -9;
			arr[2] = -7;
			arr[3] = -10;
			arr[4] = -2;
			SelectionSort temp1 = new SelectionSort();
			int sorted[] = temp1.basicSelectionSort(arr);
			int[] correct = {-10,-9,-8,-7,-2};
			for (int i = 0; i < sorted.length; ++i) {
				System.out.println(sorted[i]);
			}
		/** add tests to check for this unit test **/
			assertArrayEquals(correct,sorted);
			//System.out.println(maxValue);
		}
		public void testMixes(){

		}
		public void testDuplicates() {

		}
		
		}
