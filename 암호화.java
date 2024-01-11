package method;


public class MethodExam5 {

	public static void main(String[] args) {
	 /*
	  * 문자를 이용해서 비밀번호를 암호화 시키고
	  * 다시 복호화 시키는 문제
	  */
String name ="홍길동";			//아이디
String password ="ghdrlfehd";//비번
String realPassword ="";	//암호화
String realPassword1 =""; //암호화 복귀
//암호화 숫자
final int KEY= 3; 
//암호화 
for (int i =0; i < password.length(); i++) {
	realPassword = realPassword + (char)(password.charAt(i)*KEY) ;
}
//암호화 복귀
for (int i =0; i < realPassword.length(); i++) {
	realPassword1 = realPassword1 + (char)(realPassword.charAt(i)/KEY) ;
}
//출력 형태
System.out.println(password);
System.out.println(realPassword);
System.out.println(realPassword1);
}
}
