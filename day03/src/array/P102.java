package array;

public class P102 {

	public static void main(String[] args) {
		     
		         int a = 100;
		
                int arr[] = new int[3];
                arr[0] = 10;
                arr[1] = 20;
                arr[2] = 50;
                System.out.println(arr);
                
                for(int i=0; i< arr.length ; i++) {
                	System.out.printf("%d \t", arr[i]); //일련번호있을때만 주로 ,위치파악 용이
                }
                System.out.println("Type 2");
                for(int data:arr) {
                	System.out.printf("%d \t", data); //보통은 이렇게 ,끄집어내서 화면 출력할떄 좋고
                }

	}

}
