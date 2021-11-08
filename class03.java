class Testx{
	int english;
	int math;
	String x;
		
	void namex (String x) {
		System.out.println("name : " + x);
	}
	
	void scoreA(int eng,int m){
		english = eng;
		math = m;
		System.out.println("english = " + eng);
		System.out.println("math = " + m);
	}
	
	void avg(int eng,int m) {
		english = eng;
		math = m;
		System.out.println("avg = "+ (eng + m)/2.0);
	}
}	

class Testy{	
	int english;
	int math;
	String y;
	
	void namey (String y) {
		System.out.println("name : " + y);;
	}
	
	void scoreB(int eng,int m) {
		english = eng;
		math = m;		
		System.out.println("english = " + eng);
		System.out.println("math = " + m);
	}
	
	void avg(int eng,int m) {
		english = eng;
		math = m;
		System.out.println("avg = "+(eng + m)/2.0);
	}
}

public class Class03 {
	
	public static void main(String[] args) {
		Testx a = new Testx();
		Testy b = new Testy();
		a.namex("Annie");
		a.scoreA(85,92);
		a.avg(85,92);
		
		b.namey("Brian");
		b.scoreB(77,56);
		b.avg(77, 56);
	}
}
