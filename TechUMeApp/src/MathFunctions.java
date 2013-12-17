
public class MathFunctions {
	public String getVertexToStandard(int a, int H, int K){
		int A;
		int B;
		int C;
		
		B= H*2;
		C= (int)Math.pow(H, 2);
		A=a;
		B= B*a;
		C= C*a;
		C= C+K;
		//Print numbers back and insert into string with ax^2+bx+c
			
			
		return Ans;
	}
	
	public String getVertexToFactored(int a, int H, int K){
		int s;
		int t;
		int A;
		int B;
		int C;
		
		//converting to standard
		B= H*2;
		C= (int)Math.pow(H, 2);
		A=a;
		B= B*a;
		C= C*a;
		C= C+K;
		//converting to factored from standard
		
	
		//Print numbers back and insert into string with a(x-s)(x-t)
			
			
		return Ans;
	}
	
	public String getFactoredToStandard(int a, int s, int t){
		int A;
		int B;
		int C;
		
		B= (s+t)*a;
		C= s*t*a;
		
		//Print numbers back and insert into string with ax^2+bx+c
			
			
		return Ans;
	}

	public String getFactoredToVertex(int a, int s, int t){
		int H;
		int K;
		int x1;
		int x2;
		
		
		H= (s+t)/2;
		x1=H;
		x2=H;
		K= (x1-s)*(x2-t);
		K= a*x1*x2;
		
		
		//Print numbers back and insert into string with a(x-H)^2+K
			
			
		return Ans;
	}
	
	public String getStandardToFactored(int a, int s, int t){
		int H;
		int K;
		
		
		
		//Print numbers back and insert into string with a(x-s)(x-t)
			
			
		return Ans;
	}
	
	public String getStandardToVertex(int A, int B, int C){
		int H;
		int K;
		int b2;
		int b3;
		
		B= B/A;
		b2= (B/2); 
		b2=(int) Math.pow(b2, 2);
		b3= b2-(2*b2);
		b3= b3*A;
		//if b is negative multiply H by (-1)
		H=(int) Math.sqrt(b2);
		if (B<0) {
			H=H*(-1);
		}
		K=b3+C;
		
		//Print numbers back and insert into string with a(x-H)^2+K
			
			
		return Ans;
	}
}

