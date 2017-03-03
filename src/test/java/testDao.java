import com.raycloud.dao.imp.UserDaoImp;
import com.raycloud.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 001117020015 on 2017/2/27.
 */
public class testDao {
    public static void main(String[] args) {
            ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-web-datasource.xml");
            UserDaoImp dao = (UserDaoImp )context.getBean("UserDaoImp");
            User user =  dao.queryById(1);
            System.out.println(user);

    }

}
