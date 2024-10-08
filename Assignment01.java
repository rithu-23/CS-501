/*
 * Name:
 * CWID:
 */
public class Assignment01 {
	
	public static double calculateTriArea(double a, double b, double c) {
		// TODO Implement this
		return 0.0;
	}
	
	public static String switchCase(String str) {
		// TODO Implement this
		return "";
	}
	
	public static String reverse(String str) {
		// TODO Implement this
		return "";
	}
	
	public static long fib(int ith) {
		// TODO Implement this
		return 0;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Testing calculateTriArea():");
		System.out.print("(3, 4, 5) -> ");
		System.out.println(calculateTriArea(3, 4, 5));
		System.out.print("(3, 3, 3) -> ");
		System.out.println(calculateTriArea(3, 3, 3));
		
		System.out.println("\nTesting switchCase():");
		System.out.print("abc -> ");
		System.out.println(switchCase("abc"));
		System.out.print("AbC -> ");
		System.out.println(switchCase("AbC"));
		System.out.print("123 -> ");
		System.out.println(switchCase("123"));
		
		System.out.println("\nTesting reverse():");
		System.out.print("xyz -> ");
		System.out.println(reverse("xyz"));
		System.out.print("0xff -> ");
		System.out.println(reverse("0xff"));
		
		System.out.println("\nTesting fib():");
		for (int i = 0; i < 13; i++) {
			System.out.print("fib(" + i + ") -> ");
			System.out.println(fib(i));
		}
		
	}

}
