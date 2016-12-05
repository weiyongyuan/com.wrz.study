package concurrent_study.com.wrz.study;

public class Test1 {

	String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
    	//一个新的引用也叫str，执行一个新的常量对象
        str = "test ok";
        System.out.println("方法中的str="+str);
        ch[0] = 'g';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }

}
