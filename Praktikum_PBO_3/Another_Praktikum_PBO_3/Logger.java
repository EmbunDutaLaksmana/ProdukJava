package Praktikum_PBO_3.Another_Praktikum_PBO_3;

public class Logger {
public int debuglevel;

 public Logger(){
  debuglevel=10;
 }
 public void debug(String logline){
     System.out.println("Debug :"+logline);
 }
  public void info(String logline){
      System.out.println("Info :"+logline);
  }
}
