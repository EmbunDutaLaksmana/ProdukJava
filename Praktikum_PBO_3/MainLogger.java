package Praktikum_PBO_3;
import Praktikum_PBO_3.Another_Praktikum_PBO_3.Logger;
public class MainLogger {
    public static void main(String[] args) {
        Logger logger=new Logger();
        
        logger.debug("Debug with level "+logger.debuglevel);
        
        logger.debuglevel=20;
        logger.info("info with level "+logger.debuglevel);
    }
   
}