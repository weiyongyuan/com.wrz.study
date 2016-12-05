package concurrent_study.com.wrz.study.sort;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class SortArray {

	private static AtomicInteger count=new AtomicInteger();
	
	
	@Test
	public void testBubbleSort(){
		int[]arr=new int[]{9,10,3,6,8,2,5,1,13,4};
		sort1(arr);
		count.set(0);
		arr=new int[]{9,10,3,6,8,2,5,1,13,4};
		System.out.println("------------");
		bubbleSort(arr);
		
		System.out.println("------------");
		count.set(0);
		arr=new int[]{9,10,3,6,8,2,5,1,13,4};
		int[] selectSort = selectSort(arr);
		for (int i = 0; i < selectSort.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int[]selectSort(int []arr){
		for (int i = 0; i < arr.length-1; i++) {
			//把当前的下标最为最小的下标，并在下面的循环中找出值最小的下标
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[min]>arr[j]) {
					min=j;
				}
				
				//如果min不等于i，说明不是最初赋值是的的min了,需要调换i和min的位置
				if (min!=i) {
					int temp=arr[i];
					arr[i]=arr[min];
					arr[min]=temp;
					count.incrementAndGet();
				}
			}
		}
		System.out.println("selectSort:"+count.get());
		return arr;
	}
	
	/**快速排序
	 * 基本思想：选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，将待排序列分成两部分,一部分比基准元素小,一
	 * 部分大于等于基准元素,此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
	 * @param arr
	 * @return
	 */
	public static int[]qucikSort(int[] arr){
		
		return arr;
	}
	
	/**基本思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
	 * 让较大的数往下沉，较小的往上冒。即：相邻两元素进行比较，如有需要则进行交换。每完成一次循环就将最大元素排在最后(如从小到大排序)。
	 * 下一次的循环是将其它的数进行类似的操作
	 * 冒泡排序：
	 * @param arr
	 */
	public static void bubbleSort(int[]arr){
		for (int i =0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count.incrementAndGet();
				}
			}
		}
		System.out.println("bubbleSort:"+count.get());
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	/**
	 * 什么排序
	 * @param arr
	 */
	public static void sort1(int[]arr){
		
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if (arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					count.incrementAndGet();
//				}
//			}
//		}
		
		for (int i =0; i < arr.length-1; i++) {
			for (int j =0; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					count.incrementAndGet();
				}
			}
		}
		System.out.println("sort1:"+count.get());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
