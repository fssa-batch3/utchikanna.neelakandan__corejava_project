package day01.practice;

public class AccessModifier {
	private static String a;
	private static String b;
	private static String c;
	private static String d;

	public void setFirst(String a) {
		this.a = a;

	}

	public String getFirst() {
		return a;
	}

	public void setSecond(String b) {
		this.b = b;
	}

	public String getSecond() {
		return b;
	}

	public void setThird(String c) {
		this.c = c;
	}

	public String getThird() {
		return c;
	}

	public void setFourth(String d) {
		this.d = d;
	}

	public String getFourth() {
		return d;
	}

	public static void main(String[] args) {

		AccessModifier one = new AccessModifier();

		one.setFirst("a");
		one.setSecond("b");
		one.setThird("c");
		one.setFourth("d");

		System.out.println(one.getFirst());
		System.out.println(one.getSecond());
		System.out.println(one.getThird());
		System.out.println(one.getFourth());
	}
}