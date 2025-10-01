class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
	void print(String msg){
		System.out.println(msg);
	}
	double FtoC(double Fahrenheit){
    double C = (Fahrenheit - 32)* 5/9.0;
	return C;
	}
	double SphereVol(double Radius){
		double Volume = (4/3.0) * Math.PI * Math.pow(Radius, 3);
		return Volume;
	}
	double coneVolume(double Radius, double Height){
		double V = (1/3.0) * Math.PI * Math.pow(Radius, 2) * Height;
		return V;
	}
  	void init(){
	print("hello");
	double m = FtoC(212);
	System.out.println("The temperature in celsius is " + m);
	double v = SphereVol(34);
	System.out.println("The volume is " + v);
	double Volume = coneVolume(20, 30);
	System.out.println("The volume is " + Volume);
	
	}

}

  
 
