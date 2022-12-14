package chap3;
/*
 * 단항 연산자 : 연산자에 피연산자가 한 개인 연산자.
 * 			   대부분 우선 순위가 높다.
 * 	1. 증감연산자 : ++, --
 * 		++ : 변수의 값을 1 증가
 * 		-- : 변수의 값을 1 감소
 */
public class OpEx1 {

	public static void main(String[] args) {
		int x=5, y=5;
		// 후위형 : 우선순위가 낮다.
		x++;	//x의 값을 1 증가. 6
		y--;	//y의 값을 1 감소. 4
		System.out.println("x="+x+",y="+y);	// 6,4
		
		//전위형 : 우선순위가 높다.
		++x;	//x의 값을 1 증가. 7
		--y;	//y의 값을 1 감소. 3
		System.out.println("x="+x+",y="+y);	// 7,3
		
		x=y=5;
		y = ++x;	// 1. ++x, 2. y에 대입
		System.out.println("x="+x+",y="+y);	// 6,6
		
		y = x++;	// 1. y에 대입, 2. x++
		System.out.println("x="+x+",y="+y);	// 7,6
		
		x=y=5;
		y = x++;	
		System.out.println("x="+x+",y="+y);	// 6,5
		
		y = ++x;	
		System.out.println("x="+x+",y="+y);	// 7,7
		
		x=5;
		System.out.println("x=" + x++);	// x = 5
		System.out.println("x=" + ++x);	// x = 7
		
	}

}
