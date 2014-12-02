package gyarab;

public class Pole {

	static int len(double[] a) {
		int len = 0;
		for(double b : a) {
			len = len + 1;
		}
		return len;
	}
	

	static int len1(double[] a) {
		int len = 0;
		for(int i = 0; i < a.length; i++) {
			len = len + 1;
		}
		return len;
	}
		 
		
	static double sum(double[] a) {
		double sum = 0;
		for(double car : a) {
			sum = sum + car;
		}
		return sum;
	}
	
	static double sum2(double[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	
	static double arit_prumer(double[] a) {
		return sum(a) / len(a);
	}
	static double nasobeni(double[] a) {
		double mul = 1;
		for(int i = 0; i < a.length; i++){
			mul = mul * a[i];
		}
		return  mul;
	}
	static double root(int n, double p) {
		return Math.exp( Math.log(p)*1/n );
	}
	
	static double geometr_prumer(double[] a){
		return root(len(a), nasobeni(a));		
	} 
	static double slozeni_mocnin(double[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {		
			sum = sum + a[i] * a[i];
		}
		return sum;
	}
	static double kvadr_prumer(double[] a) {
		return Math.sqrt(slozeni_mocnin(a) / len1(a));
	}  
	
	static double vahy(double[] a, double[] b){
		double sum = 0;
		for(int i = 0; i < a.length; i++) {		
			sum = sum + a[i] * b[i];
		}
		sum = sum / len(a);
		return sum;
	}
	static boolean log_soucin(boolean[] a) {
		for(boolean b : a) {
			if (! b) return false;
		}
		return true;
	}
	
	static boolean log_soucet(boolean[] a){
		for(boolean b : a){
			if (b) return true;
		}
		return false;
	}
	static double[] klonovani(double[] a){
		double[] b = new double[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = a[i];
		}
		return b;
	}
	
	static double[] spojovani(double[] a, double[] b){
		double[] ab = new double[a.length + b.length];
		for(int i = 0; i < a.length; i++){
			ab[i] = a[i];
		}
	    for(int i = 0; i < b.length; i++){
	    ab[i + a.length] = b[i];	
	    }
	    return ab;
	}
	static void napis_pole(double[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(i + ":" + a[i] + " ");
		}
		System.out.println();
	}
	static void napis_pole_boolean(boolean[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(i + ":" + a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		double[] a = {1, 213, 32, 21, 43};
		double[] b = {2, 34, 13, 7, 3};
		boolean[] c = {true, false, false, true, true, true};
		
		System.out.print("a:");
		napis_pole(a);

		System.out.print("b:");
		napis_pole(b);

		System.out.print("c:");
		napis_pole_boolean(c);
		
		System.out.println("len:" + len(a));
		System.out.println("sum:" + sum(a));
		System.out.println("arit. prumer:" + arit_prumer(b));
		System.out.println("geometr. prumer:" + geometr_prumer(a));
		System.out.println("kvadr.prumer:" + kvadr_prumer(a));
		System.out.println("vazen.prumer:" + vahy(a, b));
		System.out.println("soucin:" + log_soucin(c));
		System.out.println("soucet:" + log_soucet(c));
		
		System.out.print("klonovani:");
		napis_pole(klonovani(a));
		
		System.out.print("spojovani:");
		napis_pole(spojovani(a, b));

	}
	
}
