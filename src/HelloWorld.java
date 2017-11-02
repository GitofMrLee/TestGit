import org.apache.log4j.Logger;

/**
 * 测试git的使用
 *
 * @author liming
 * @create 2017-07-20 11:25
 */

public class HelloWorld {
    private static Logger logger = Logger.getLogger(HelloWorld.class);
    public static void main(String[] args) {
        //System.out.println("hello world!");

        logger.info("this is the info message.");

        logger.debug("this is the debug message.");

        logger.error("this is the error message.");


    }
}
