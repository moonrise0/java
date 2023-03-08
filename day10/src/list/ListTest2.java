package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //LinkedList를 가져와도됨 Arraylist대신에.

		Random r = new Random();

//	    	   int i = 1  왜 정의 안해줘?;
		while (list.size() < 20) {
			int num = r.nextInt(10) + 1; // 왜 10 + 1
			list.add(num);
		}

		System.out.println(list.size());
		for (int data : list) {
			System.out.println(data);
		}

	}
}
