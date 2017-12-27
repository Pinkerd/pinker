import com.pinker.util.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.sql.Connection;

public class WTYTest {

    @Test
    public void testConn(){
        Connection conn=JDBCUtils.getConnection();
        System.out.println(conn);
    }


    @Test
    public void testIO(){
        File fileOut=new File("E:\\Code\\Test\\output\\out.jpg");
        File fileInput=new File("E:\\Code\\Test\\input\\input.jpg");

    }


}


