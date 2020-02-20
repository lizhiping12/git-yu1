package Test;

import dao.RainManageDao;
import entity.RainManage;
import service.RainManageService;

import java.util.Date;

/**
 * @Author:linnian
 * @Description:
 * @Date:Created in 2020/2/18 16:25
 * @Modified By:
 */
public class TestRainManage {
    public static void main(String[] args) {
        RainManageService service=new RainManageService();
        RainManageDao dao=new RainManageDao();
        RainManage rain=new RainManage();

        rain.setRain(3);
        rain.setDistrictName("山东省");
        rain.setMonitoringStation("聊城市");
        rain.setMonitoringAddress("市区");
        rain.setMonitorTime(new Date());

        dao.addNewRainInfo(rain);
    }
}
