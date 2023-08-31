package ch02_pjt_01;

public class MyCalculator {
	public void calAdd(int fNum, int sNum) {
		//상위 형변환이 알아서 되고 있죠?
		//calculator.doOperation(fNum, sNum)은 각각 다른 기능을 실행하게 됩니다.
		//calculator가 각자 다른 객체가 들어가기 때문이다.
		
		ICalculator calculator = new CalAdd();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	
	public void calSub(int fNum, int sNum) {
		ICalculator calculator = new CalSub();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	public void calMul(int fNum, int sNum) {
		ICalculator calculator = new CalMul();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
	public void calDiv(int fNum, int sNum) {
		ICalculator calculator = new CalDiv();
		int value = calculator.doOperation(fNum, sNum);
		System.out.println("result : " + value);
	}
}
