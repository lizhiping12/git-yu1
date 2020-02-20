package Test;

import dao.RainManageDao;
import entity.RainManage;
import service.RainManageService;

/**
 * @Author:linnian
 * @Description:
 * @Date:Created in 2020/2/18 16:25
 * @Modified By:
 */
public class TestRainManage {
    public static void main(String[] args) {
        RainManageService service=new RainManageService();
        System.out.println(service.getAllInfo());
    }
}
