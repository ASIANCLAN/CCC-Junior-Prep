import java.util.Scanner;
public class Solution {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					isSorted = false;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
