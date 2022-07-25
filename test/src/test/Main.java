package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(arithmetic_sequence(sc.nextInt()));
		sc.close();
	}
	
	public static int arithmetic_sequence(int num) {
		int cnt=0; // 한수 카운팅
		
		//100보다 작을땐 그 자체로 한수(등차수열)가 된다.
		if(num < 100) {
			return num;
		} else {
			cnt = 99;//최소 등차수열이 99개 존재함.
			
			for(int i=0;i<num;i++) {
				int hun = i/100; //백의 자릿수
				int ten = (i/10)%10; //십의 자릿수
				int one = i%10;
				
				if((hun-ten) == (ten-one)) {//각 자릿수가 수열을 이루면
					cnt++;
				}
			}
			
		}
		return cnt;
	}
}