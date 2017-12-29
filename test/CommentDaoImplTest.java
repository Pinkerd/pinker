import com.pinker.dao.CommentDao;
import com.pinker.dao.impl.CommentDaoImpl;
import com.pinker.entity.Comment;
import com.pinker.service.CommentService;
import com.pinker.service.serviceimpl.CommentServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

public class CommentDaoImplTest {
    private CommentDao com=new CommentDaoImpl();
    private CommentService comm=new CommentServiceImpl();

    /**
     * 增加的测试
     * @throws Exception
     */
    @Test
    public void savecom() throws Exception {
        Comment comment=new Comment(1,1,"你好",new Date());
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
        Comment getselect = comm.getselect(1);

        System.out.println(getselect.getUser().toString()+getselect.getBlog());


    }

    /**
     * 查询多个测试
     * @throws Exception
     */
   @Test
    public void getselectAll() throws Exception {
        List<Comment> comments = comm.getselectAll();
       for (Comment comm:comments
            ) {
           System.out.println(comm.getUser().toString()+comm.getBlog());
       }
        System.out.println(comments);
    }

}