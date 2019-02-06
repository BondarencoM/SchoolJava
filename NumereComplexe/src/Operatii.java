public class Operatii {
	public static NumarComplex add(NumarComplex a, NumarComplex b) {
		return new NumarComplex(a.re + b.re, a.im+b.im);
	}
	public static NumarComplex substract (NumarComplex a, NumarComplex b) {
		return new NumarComplex(a.re - b.re, a.im - b.im);
	}
	public static NumarComplex multiply (NumarComplex a, NumarComplex b) {
		return new NumarComplex(a.re*b.re - a.im*b.im, a.re * b.im + a.im*b.re);
	}
	public static NumarComplex divide (NumarComplex a, NumarComplex b) {
		return new NumarComplex((a.re*b.re + a.im*b.im)/(b.im * b.im + b.re * b.re), (a.re * b.im - a.im*b.re)/(b.im * b.im + b.re * b.re));
	}
}
