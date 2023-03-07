package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Num");
		int num = 0;
		try {
			num = Integer.parseInt(sc.next());
			int result = (10 / num);
			System.out.println(result);
//		}catch(Exception e) { //상위 개념.
//			System.out.println("잘못 입력했습니다");
//		}
			
			
		
		} catch (ArithmeticException ae1 ) { // 오류가 들어오면 ae임의로 정해준건데 여기로 들어와
			System.out.println("분모가 0입니다.");
			return;//하면 sc.close 가 진행되지 않는다 그래서 finally 구문을 써줘야한다.
			
		} catch (NumberFormatException ae2) {
			System.out.println("숫자를 입력 하다.");
			return;
		} finally {
			System.out.println("반드시 실행....");
			sc.close();

		}
 
//	    } catch (ArithmeticException | NumberFormatException ae3) {
//		System.out.println("잘못입력했습니다..");
//	    }
//		
		
		System.out.println("End Application....");

	}

}
