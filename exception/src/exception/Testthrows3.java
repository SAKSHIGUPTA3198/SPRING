package exception;

import java.io.*;  
class M{  
 void method()throws IOException{  
	 System.out.println("ddd");
  //throw new IOException("device error");  
 }  
}  
class Testthrows3{  
   public static void main(String args[])throws IOException{//declare exception  
     M m=new M();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  