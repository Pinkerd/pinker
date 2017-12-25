import com.pinker.util.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class WTYTest {

    @Test
    public void testConn(){
        Connection conn=JDBCUtils.getConnection();
        System.out.println(conn);
    }
}
