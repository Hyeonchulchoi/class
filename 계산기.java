package method;

public class MethodExam6 {

	public static void main(String[] args) {
	 /*
	  * 전자 계산기
	  * 1. 전원켜기 powerOn()
	  * 2. 계산
	  * 3. 전원끄기
	  */

	powrOn();
		int resulPlus = plus(4,3);
		int resulPlus1 = minus(4,3);
		int resulPlus2= multiple(4,3);
		double resulPlus3 = division(1,0);
		//출력형태
		System.out.println("4+3 ="+resulPlus);
		System.out.println("4-3 ="+resulPlus1);
		System.out.println("4*3 ="+resulPlus2);
		System.out.println("4/3 ="+resulPlus3);
		powrOff();
}
	//계산기 켜기
	public static void powrOn() {
		System.out.println("전원을 켭니다");
	}
	//계산기 끄기
	public static void powrOff() {
		System.out.println("전원을 끕니다");
	}
	// 덧셈
	public static int plus(int a,int b){
	return a+b;
}	//빼기
	public static int minus(int a,int b){
		return a-b;
} 	//곱하기
	public static int multiple(int a,int b){
		return a*b;
}
	//나누셈
	public static double division(int a,int b){
			if(b==0) {
				return 0;
			}
			else if(a==0) {
				return 0;
			}
			return (double)a/b;
			
		}}			
