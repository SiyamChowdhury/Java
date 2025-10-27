class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
  double approxPI(int N){
        double piApprox = 0.0;
        
        for (int k = 0; k < N; k++) {
            piApprox += Math.pow(-1, k) / (2 * k + 1);
        }
        return(piApprox);
      }
  void init(){
    double result = approxPI(25);
    System.out.println("PI is approximately " + result);

  }

  
  
  
}