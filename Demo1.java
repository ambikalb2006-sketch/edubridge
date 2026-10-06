package citnc;

public class Demo1 {
	int a=11; 
	int b=12;
	void m1(int c, int d) {
	 c=a;
	 d=b;
		
	
	 
		System.out.println("sum:"+(c+d));
}
		
	
	public static void main(String[] args) {
		Demo1 tt=new Demo1();
		tt.m1(4,6);

	}

}
