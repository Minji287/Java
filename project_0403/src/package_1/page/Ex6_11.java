package package_1.page;

import package_1.page_2.*;

class Data_1 {
	int value;
}

class Data_2 {
	int value;
	Data_2() {}
	Data_2(int x) {    // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // 기본생성자가 없으면 compile error발생
	}
}