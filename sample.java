public class Sample {

	public int performAddition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Sample obj = new Sample();
		
		int sum = obj.performAddition(10, 20);
		System.out.println(sum);
		

	}

}
