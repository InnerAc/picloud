package com.Picloud.config;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.Picloud.web.model.Action;
import com.Picloud.web.model.Module;


@WebServlet(name = "MenuConfig", urlPatterns = { "/MenuConfig" }, loadOnStartup = 1)
public class MenuConfig  extends HttpServlet{

	private static final long serialVersionUID = 1L;

	public MenuConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		List<Module> basicModules = new ArrayList<Module>();
		List<Module> personalModules = new ArrayList<Module>();
		
		basicModules.add(new Module("Index", "首页", "home", "index"));
		basicModules.add(new Module("space", "图片服务器", "link", "space/spaces"));
		basicModules.add(new Module("basic", "高清展示", "eye", "hd/list"));
		basicModules.add(new Module("basic", "全景展示", "video-camera", "pano/list"));
		basicModules.add(new Module("basic", "数据中心", "line-chart", "user/data"));
		
		personalModules.add(new Module("user", "个人中心", "user", "user/account"));
		personalModules.add(new Module("Log", "日志", "newspaper-o", "user/log/0"));
		
		application.setAttribute("BASIC_MODULE", basicModules);
		application.setAttribute("PERSONAL_MODULE", personalModules);
		
	}
}
