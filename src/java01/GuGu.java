package java01;

// 1. 클래스 생성
public class GuGu {
	
    public void dan(int n) {
//        System.out.println(n*1);
//        System.out.println(n*2);
//        System.out.println(n*3);
//        System.out.println(n*4);
//        System.out.println(n*5);
//        System.out.println(n*6);
//        System.out.println(n*7);
//        System.out.println(n*8);
//        System.out.println(n*9);
    	
    	for (int i = 1; i < 10; i++) {   // i에 1~9 까지의 값이 반복하여 대입된다.
            System.out.println(n * i);
        }
    }
	
	// 2. main 메소드
    public static void main(String[] args) {
    	
    	// 3. 변수
//    	int n = 3;
    	
    	GuGu gugu = new GuGu(); // GuGu 클래스의 객체 생성
    	
//        gugu.dan(n); // 객체를 통해 dan 메소드를 호출
//    	  gugu.dan(2);
//        gugu.dan(3);
//        gugu.dan(4);
//        gugu.dan(5);
//        gugu.dan(6);
//        gugu.dan(7);
//        gugu.dan(8);
//        gugu.dan(9);
    	
        for (int i = 2; i < 10; i++) { 
            gugu.dan(i);
        }
    }
}
