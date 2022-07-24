package test;

public class Main {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i=1; i<10001; i++) {
			int n = test(i);
			
			// 10000이 넘는 수는 필요가 없음.
			// 출력하면 안되는 수는 true로 바꿔준다.
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		// false인 인덱스만 출력
		for(int i=1; i<10001; i++) {
			if(!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static int test(int number) {
		int sum = number;
		
		//number가 0이 아닐때까지 반복
		while(number !=0) {
			sum = sum + (number%10); //첫째자릿수를 더한다.
			number = number / 10; //1234입력시 123으로 줄임.
		}
		return sum;
		//return이 된다는 것은 생성자가 있는 수,
		// 즉 출력하면 안 되는 수이다.
	}
}