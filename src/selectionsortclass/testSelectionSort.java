package selectionsortclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixes();
		testDuplicate();
		}
		public void testPositive(){

		}
		public void testNegative(){

		}
		public void testMixes(){
			int[] arr = new int[5];
			arr[0] = -8;
			arr[1] = 9;
			arr[2] = 7;
			arr[3] = 0;
			arr[4] = 1;
			SelectionSort temp1 = new SelectionSort();
			int sorted[] = temp1.basicSelectionSort(arr);
			int[] correct = {-8,0,1,7,9};
			for (int i = 0; i < sorted.length; ++i) {
				System.out.println(sorted[i]);
			}
		/** add tests to check for this unit test **/
			assertArrayEquals(correct,sorted);
			//System.out.println(maxValue);
		}
		public void testDuplicate() {
			int[] arr = new int[5];
			arr[0] = 1;
			arr[1] = -9;
			arr[2] = 7;
			arr[3] = 0;
			arr[4] = 1;
			SelectionSort temp1 = new SelectionSort();
			int sorted[] = temp1.basicSelectionSort(arr);
			int[] correct = {-9,0,1,1,7};
			for (int i = 0; i < sorted.length; ++i) {
				System.out.println(sorted[i]);
			}
		/** add tests to check for this unit test **/
			assertArrayEquals(correct,sorted);
			//System.out.println(maxValue);
		}
}
