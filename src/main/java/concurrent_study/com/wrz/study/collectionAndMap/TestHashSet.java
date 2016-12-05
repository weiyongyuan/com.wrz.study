package concurrent_study.com.wrz.study.collectionAndMap;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Test;

import concurrent_study.com.wrz.study.Person;

public class TestHashSet {

	
	@Test
	public void testTreeSet(){
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("1");
		TreeMap<String, String> treeMap = new TreeMap<String,String>();
		treeMap.put("1","位荣芝");
	}
	
	@Test
	public void testHashSet(){
		HashSet<Person> set = new HashSet<Person>();
		Person p1 = new Person(11,"AA");
		Person p2 = new Person(12,"BB");
		set.add(p1);
		set.add(p2);
		System.out.println(set);
		System.out.println("p1的hashcode="+p1.hashCode());
		p1.setName("AA2");
		System.out.println("p1setName后的hashcode="+p1.hashCode());
		System.out.println(set);
		//boolean remove = set.remove(p1);
	//	System.out.println(remove);
		set.add(new Person(11,"cc"));
		System.out.println(set);
		set.add(new Person(11, "AA"));
		System.out.println(set);
		//如果personal没有重写hashCode()和equals()方法,new 的personal即使属性值一样，hashcode值不一样，也会加入set
	}
}
