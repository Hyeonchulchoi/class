package sequence;

import java.util.Scanner;

public class Sequence01 {
	public static void main(String[] args) {
		// 반 학생 10명 이름
		Scanner scan = new Scanner(System.in);
		//String[] name = {"","","","","","","","","","","","",""};
		String[] name= new String[5];
		
		for (int i=0 ; i<=5;i++) {
		System.out.println("이름을 적으시오>>");
		name[i] = scan.next();
		}
		for (int i=0 ; i<=5;i++) {
		System.out.println(name[i]);
		
		}
		 
	}

}
