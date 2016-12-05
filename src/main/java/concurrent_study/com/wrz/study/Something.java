package concurrent_study.com.wrz.study;

public class Something {
	public static void main(String[] args) {
		Other o = new Other();
		System.out.println(o.hashCode());
		new Something().addOne(o);
		System.out.println(o.hashCode());
		new Something().doSomething();
	}

	public void addOne(final Other o) {
		o.i++;
	}

	int i;

	public void doSomething() {
		System.out.println("i = " + i);
	}
}

class Other {
	public int i;
}




