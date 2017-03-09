import com.raycloud.dao.imp.UserDaoImp;
import com.raycloud.entity.User;
import com.taobao.api.*;
import com.taobao.api.internal.tmc.MessageHandler;
import com.taobao.api.internal.tmc.MessageStatus;
import com.taobao.api.internal.tmc.TmcClient;
import com.taobao.api.internal.toplink.LinkException;
import com.taobao.api.internal.toplink.endpoint.Message;
import com.taobao.api.request.AppipGetRequest;
import com.taobao.api.request.TimeGetRequest;
import com.taobao.api.request.TradeFullinfoGetRequest;
import com.taobao.api.response.TimeGetResponse;
import com.taobao.api.response.TradeFullinfoGetResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 001117020015 on 2017/2/27.
 */
public class testDao {
    /*public static void main(String[] args) {
            ApplicationContext context=new ClassPathXmlApplicationContext("spring/spring-web-datasource.xml");
            UserDaoImp dao = (UserDaoImp )context.getBean("UserDaoImp");
            User user =  dao.queryById(1);
            System.out.println(user);
    }*/
    public   static  void main(String[] args) throws ApiException {
       /* 获取淘宝时间
       DefaultTaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "23210640", "2c9bbb14d6bdeea892b85a4301dad830");
        TimeGetRequest request = new TimeGetRequest();
        TimeGetResponse response = null;
        response = client.execute(request);
        System.out.println(response.getBody());*/
       /* sessionKey
       6100207f25f1bad18796e7da1274fd5ab58c7eadd2496582323348933
       */
       /*批量调用api
       BatchTaobaoClient client = new BatchTaobaoClient("http://gw.api.taobao.com/router/batch", "23210640", "2c9bbb14d6bdeea892b85a4301dad830");
        TaobaoBatchRequest batch = new TaobaoBatchRequest();
        TimeGetRequest timeRequest = new TimeGetRequest();
        AppipGetRequest ipRequest = new AppipGetRequest();
        batch.addRequest(timeRequest).addRequest(ipRequest);
        TaobaoBatchResponse response = client.execute(batch);
        System.out.println(response.getBody());
*/
      /*  DefaultTaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "23210640", "2c9bbb14d6bdeea892b85a4301dad830");
        TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
        req.setFields("tid,type,status,payment,orders");
        req.setTid(123456789L);
        TradeFullinfoGetResponse rsp = client.execute(req, " 6100207f25f1bad18796e7da1274fd5ab58c7eadd2496582323348933");
        System.out.println(rsp.getBody());*/


        TaobaoClient client = new DefaultTaobaoClient("http://gw.api.taobao.com/router/batch","23210640", "2c9bbb14d6bdeea892b85a4301dad830");
        UserBuyerGetRequest req = new UserBuyerGetRequest();
        req.setFields("nick,sex");
        UserBuyerGetResponse rsp = client.execute(req, sessionKey);
        System.out.println(rsp.getBody());




    }

}
