package service;

import dao.RainManageDao;
import entity.RainManage;

import java.util.List;

/**
 * @Author:linnian
 * @Description:
 * @Date:Created in 2020/2/18 9:35
 * @Modified By:
 */
public class RainManageService {
    private RainManageDao rainManageDao=new RainManageDao();
    public List<RainManage> getAllInfo() {
        return rainManageDao.getAllInfo();
    }
    public int addNewRainInfo(RainManage rain){
        return rainManageDao.addNewRainInfo(rain);
    }
}
