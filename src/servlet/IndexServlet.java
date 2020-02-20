package servlet;

import entity.RainManage;
import service.RainManageService;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: laoyu
 * @Date: 2020/2/18 17:43
 * @Description:
 */
@WebServlet(name = "IndexServlet",urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //servlet调用service层的数据
        RainManageService service = new RainManageService();
        List<RainManage> allInfo = service.getAllInfo();
        //把数据存储到request作用域（a-b）
        request.setAttribute("allinfo",allInfo);
        //跳转页面
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
