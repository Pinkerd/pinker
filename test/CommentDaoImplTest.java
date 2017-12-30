import com.pinker.dao.CommentDao;
import com.pinker.dao.impl.CommentDaoImpl;
import com.pinker.entity.Comment;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

public class CommentDaoImplTest {
    private CommentDao com=new CommentDaoImpl();

    /**
     * 增加的测试
     * @throws Exception
     */
    @Test
    public void savecom() throws Exception {
        Comment comment=new Comment(4,4,"你好",new Date());
        int savecom = com.savecom(comment);

    }

    /**
     * 删除测试
     * @throws Exception
     */
    @Test
    public void getdelct() throws Exception {
        Comment comment=new Comment(2,null,null,null);
        int getdelct = com.getdelct(comment);
    }

    /**
     * 查询一个测试
     * @throws Exception
     */
    @Test
    public void getselect() throws Exception {
        Comment getselect = com.getselect(3);
        System.out.println(getselect.toString());
    }

    /**
     * 查询多个测试
     * @throws Exception
     */
   @Test
    public void getselectAll() throws Exception {
        List<Comment> comments = com.getselectAll();
        System.out.println(comments.toString());
    }

}