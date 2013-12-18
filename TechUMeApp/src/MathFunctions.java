
public class MathFunctions {
	public String getVertexToStandard(double a, double H, double K){
		double A;
		double B;
		double C;
		
		B= H*2;
		C= (int)Math.pow(H, 2);
		A=a;
		B= B*a;
		C= C*a;
		C= C+K;
		//Print numbers back and insert into string with ax^2+bx+c
		
		return A + ", " + B + ", " + C;
	}
	
	public String getVertexToFactored(double a, double H, double K){
		double s = 0;
		double t = 0;
		double A;
		double B;
		double C;
		
		//converting to standard
		String standard = getVertexToStandard(a, H, K);
		String[] StandardInfo = standard.split(", ");
		A = Double.parseDouble(StandardInfo[0]);
		B = Double.parseDouble(StandardInfo[1]);
		C = Double.parseDouble(StandardInfo[2]);
		
		//converting to factored from standard
		getStandardToFactored(A, B, C);
	
	
		//Print numbers back and insert into string with a(x-s)(x-t)
			
			
		return a + ", " + s+ ", " + t;
	}
	
	public String getFactoredToStandard(double a, double s, double t){
		double A=a;
		double B;
		double C;
		
		B= (s+t)*a;
		C= s*t*a;
		
		//Print numbers back and insert into string with ax^2+bx+c
			
			
		return A + ", " + B + ", " + C;
	}

	public String getFactoredToVertex(double a, double s, double t){
		double H;
		double K;
		double x1;
		double x2;
		
		H= (s+t)/2;
		x1=H;
		x2=H;
		K= (x1-s)*(x2-t);
		K= a*x1*x2;
		
		
		//Print numbers back and insert into string with a(x-H)^2+K
			
			
		return a + ", " + H+ ", " + K;
	}
	
	public String getStandardToFactored(double A, double B, double C){
		double a=A;
		double s;
		double t;
		
		
		double sqB = Math.pow(B, 2);// We square numB
		  double Cal4AC = (4 * A * C);// We multiply 4 by numA and numC  - 4AC
		  double inner = sqB - Cal4AC;// We combine the values for B^2-4AC
		  /* 
		   * Total Explanation
		   * We will solve for the Square root first, since it is shared
		   * between the two zero's equations.
		   */
		  inner = Math.sqrt(inner);// We square root the result of B^2 - 4AC
		  s= -B + inner;// We combine -B + InnerVar(Refer to above calculation of B^2-4AC)
		  t= -B - inner;// We combine -B + InnerVar(Refer to above calculation of B^2-4AC)
		
		//Print numbers back and insert into string with a(x-s)(x-t)
			
		  return a + ", " + s+ ", " + t;	
		  
	}
	
	public String getStandardToVertex(double A, double B, double C){
		double H;
		double K;
		double b2;
		double b3;
		double a=A;
		
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
			
			
		return a + ", " + H+ ", " + K;
	}
}

