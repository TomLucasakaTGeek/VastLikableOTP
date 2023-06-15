import java.util.Random;
class Main {
  public static void main(String[] args){
       int lenth = 4;
        System.out.println(OTP(lenth));
  }
   static char[] OTP(int len){
     System.out.print("Your OTP : ");   
      String numbers = "0123456789";
       Random ob = new Random();      //Object for random class
       char[] otp = new char[len];    //array that will hold OTP
      for(int i=0;i<len;i++)
       otp[i]=numbers.charAt(ob.nextInt(10));  //generating OTP

        return otp;
   }
  }
