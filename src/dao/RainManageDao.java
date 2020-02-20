package dao;

import entity.RainManage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:linnian
 * @Description:
 * @Date:Created in 2020/2/18 9:34
 * @Modified By:
 */
public class RainManageDao extends BaseDao {
        Connection conn = null;
        ResultSet rs = null;

        /**
         * 查询所有的雨量监测信息，并且按照时间倒序排列
         *
         * @return
         */
        public List<RainManage> getAllInfo() {
            List<RainManage> rainManageList = new ArrayList<RainManage>();
            RainManage rainManage = null;
            try {
                //编写SQL语句
                String sql = "SELECT id,districtName,monitorTime,rain,monitoringStation,monitoringAddress from `rainquality` ORDER BY monitorTime DESC ";
                //获取数据库连接
                conn = BaseDao.getConn();
                //创建执行SQL的对象
                PreparedStatement pstmt = conn.prepareStatement(sql);
                //执行SQL语句
                rs = pstmt.executeQuery();
                //处理结果集对象
                while (rs.next()) {
                    //实例化对象
                    rainManage = new RainManage();
                    rainManage.setId(rs.getInt("id"));
                    rainManage.setDistrictName(rs.getString("districtName"));
                    rainManage.setMonitorTime(rs.getDate("monitorTime"));
                    rainManage.setRain(rs.getInt("rain"));
                    rainManage.setMonitoringStation(rs.getString("monitoringStation"));
                    rainManage.setMonitoringAddress(rs.getString("monitoringAddress"));

                    //将rainQuality对象添加到集合中
                    rainManageList.add(rainManage);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return rainManageList;
        }
    }
