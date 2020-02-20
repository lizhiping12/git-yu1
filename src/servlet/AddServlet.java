package servlet;

import entity.RainManage;
import service.RainManageService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:linnian
 * @Description:
 * @Date:Created in 2020/2/20 16:29
 * @Modified By:
 */
@WebServlet(name = "AddServlet",urlPatterns = {"/add"})
public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        //调用service曾新增雨量信息的方法
        RainManageService rainManageService=new RainManageService();

        //获取参数
        String distrcName=request.getParameter("districtName");
        String monitorTime=request.getParameter("monitorTime");
        int rainNum=Integer.valueOf(request.getParameter("rain"));
        String monitoringStation=request.getParameter("monitoringStation");
        String monitoringAddress=request.getParameter("monitoringAddress");


        //吧参数封装到对象中
        RainManage rain=new RainManage();
        //String 转换为Date
        SimpleDateFormat sdf=new SimpleDateFormat("yyy.mm.dd");
        try {
            Date date=sdf.parse(monitorTime);
            rain.setMonitorTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        rain.setMonitoringAddress(monitoringAddress);
        rain.setMonitoringStation(monitoringStation);
        rain.setDistrictName(distrcName);
        rain.setRain(rainNum);

        //执行添加的方法
        int i=rainManageService.addNewRainInfo(rain);
        if (i==1) {
            System.out.println("OK");
            //跳转页面
            request.getRequestDispatcher("index").forward(request, response);
        }else {
            System.out.println("error");
            response.sendRedirect("add.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
