package test2;

/*
 * 날짜 : 2025/07/10
 * 이름 : 이다은
 * 내용 : 자바 배열 역순으로 정렬 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
	
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i=0; i<10; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("\n");
		
		for (int j=0; j<arr.length/2; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9-j] = temp;
		}
		
		for (int n:arr) {
			System.out.print(n+", ");
		}
	}
}
