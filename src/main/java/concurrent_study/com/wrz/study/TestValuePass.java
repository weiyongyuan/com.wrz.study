package concurrent_study.com.wrz.study;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestValuePass {

	
	public static void main(String[] args) {
		int i=1;
		Person p=new Person();
		TestValuePass test = new TestValuePass();
		test.valuePassPrimitiveType(i);
		System.out.println("值传递后i="+i);
		test.valuePassReferenceType(p);
		System.out.println("值传递后p="+p+" hashcode="+p.hashCode());
		test.valuePassReferenceType2(p);
		System.out.println("值传递后p2="+p+" hashcode="+p.hashCode());
		Collection<String>list=new ArrayList<String>();
		Map<String,String>map=new HashMap<String,String>();
	}
	
	public  void valuePassPrimitiveType(int y){
		System.out.println("changePass y="+ ++y);
	}
	
	public  void valuePassReferenceType(Person p){
		System.out.println("传入的："+p);
		p.setName("张三");
	}
	public  void valuePassReferenceType2(Person p){
		System.out.println("传入的p2："+p);
		p=new Person("李四", 23, '男');
	}
}
