package test;

public class TestFile {

	int a = 50;
	static int b = 100;
	
	public void count(int x) {
		TestFile obj1 = new TestFile();
		System.out.println(x + a);
	}
	
	public static void main(String[] args) {
		TestFile obj1 = new TestFile();
		obj1.count(200);
	}
}
