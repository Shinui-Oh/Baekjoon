import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[][] arr = new int[N][2];
		
		for(int i=0 ; i<N ; i++) {
			arr[i][1] = in.nextInt();
			arr[i][0] = in.nextInt();
		}
		
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		}); // 11650번과 마찬가지로 람다식 사용, 위치 변환
		
		for(int i=0 ; i<N ; i++) {
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}
}