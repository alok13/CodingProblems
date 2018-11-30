import java.io.PrintWriter;
import java.io.StringWriter;

public class TestException {

    public static void main(String args[]) throws Exception {
        try{
           int a= 5/0;
        }catch(Exception e){
            System.out.println(printStackTrace(e));
        }
    }

    private static String printStackTrace(Exception e){
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }
}
