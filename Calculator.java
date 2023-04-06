public class Calculator{
	public static int add(int num, int num2){
		return num+num2;
	}
	public static int sub(int num, int num2){
		return num-num2;
	}
	public static int mul(int num, int num2){
		return num*num2;
	}
	public static int div(int num, int num2){
		try{
			return num/num2;
		}catch(ArithmeticException e){
			System.out.println("ERROR: Result undefined!");
		}
		return 0;
	}
}