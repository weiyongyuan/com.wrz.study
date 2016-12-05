package concurrent_study.com.wrz.study;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JAVASETest {
	
	@Test
	public void testStr(){
		String a = "aaa";
		String b = "aaa";
		String c = new String("aaa");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		updateList(list);
		System.out.println(list);
	}

	private static void updateList(List<Integer> list) {
		list.remove(new Integer(2));
	}


	@Test
	public void test() {
		char[] arr = new char[] { 'a', 'b', 'c' };
		System.out.println(arr);//

		int[] arr1 = new int[] { 1, 2, 3 };
		System.out.println(arr1);//

		double[] arr2 = new double[] { 1.1, 2.2, 3.3 };
		System.out.println(arr2);//
	}

	@Test
	public void testString() {
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);

		System.out.println(sb.length());//

		System.out.println(sb);//

		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1);//
		
		String s = "initial value";
		String s2 = new String("initial value");
		

	}

	@Test
	public void method1() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);

		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);

		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);
	}

	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2);
		System.out.println();
		Object o2;
		if (true)
			o2 = new Integer(3);
		else
			o2 = new Double(2.0);

		System.out.println(o1);
		System.out.println(o2);
	}
}
