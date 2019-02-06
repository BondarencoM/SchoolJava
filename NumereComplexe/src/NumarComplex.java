
public class NumarComplex {
	float re,im;
	public NumarComplex(float re, float im) {
		this.re = re;
		this.im = im;
	}
	
	public String toString() {
		return this.re + " + (" + this.im + "i)";
	}
	public static void main(String args[]) {
		
		NumarComplex a = new NumarComplex(4,2);
		NumarComplex b = new NumarComplex(2,3);
		
		System.out.println(Operatii.add(a, b));
		System.out.println(Operatii.substract(a, b));
		System.out.println(Operatii.divide(a, b));
		System.out.println(Operatii.multiply(a, b));
		
		
	}
}
