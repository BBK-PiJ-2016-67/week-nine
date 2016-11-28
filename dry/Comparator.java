public class Comparator {
	private boolean isGreater(int a, int b) {
		return a > b;
	}
	
	public int getMax(int n, int m) {
		return isGreater(n, m) ? n : m;
	}

	public double getMax(double d1, double d2) {
		return isGreater((int)d1, (int)d2) ? d1 : d2;
	}

	public String getMax(String number1, String number2) {
		return isGreater(Integer.parseInt(number1), Integer.parseInt(number2)) ? number1 : number2;
	}
}