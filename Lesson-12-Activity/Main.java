class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}


  String creditCardType(String ccn){
    if(ccn.substring(0,1).equals("4")){
      return "visa";
    }else if(ccn.substring(0,2).equals("34")){
      return "America Express";
    }else if(ccn.substring(0,2).equals("37")){
      return "America Express";
    }else if(ccn.substring(0,2).equals("36")){
      return "Diner Club";
    }else if(ccn.substring(0,2).equals("51")){
      return "Mastercard";
    }else if(ccn.substring(0,2).equals("55")){
      return "Mastercard";
    }else if(ccn.substring(0,4).equals("6011")){
      return "Discovery";
    }else if(ccn.substring(0,2).equals("65")){
      return "Discovery";
    }else {
      return "unknown";
    }
  }
  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }
  String nycLocate(String zp){
    if(zp.substring(0,3).equals("100")||zp.substring(0,3).equals("101")||zp.substring(0,3).equals("102")){
      return "Manhattan";
    }else if(zp.substring(0,3).equals("103")){
      return "Staten Island";
    }else if(zp.substring(0,3).equals("104")){
      return "Bronx";
    }else if(zp.substring(0,3).equals("112")){
      return "Brooklyn";
    }else if(zp.substring(0,3).equals("113")||zp.substring(0,3).equals("114")||zp.substring(0,3).equals("111")){
      return "Queens";
    }else{
      return "Not found";
    }
  }
  void init(){
   creditCardType("55");
   pigLatin("pig");
   nycLocate("114");
  }

  
  
}