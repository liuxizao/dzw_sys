package com.accp.interceptor;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SessionValidateInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		// 只判断GET请求类型，不处理PUT,POST,DELETE
		/*
		 * if (request.getMethod().equalsIgnoreCase("get") &&
		 * request.getSession().getAttribute("USER") == null) { // 跨域设置
		 * response.setHeader("Access-Control-Allow-Methods", "*");
		 * response.setHeader("Access-Control-Max-Age", "3600");
		 * response.setHeader("Access-Control-Allow-Credentials", "true");
		 * response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
		 * response.setHeader("Access-Control-Allow-Origin",
		 * request.getHeader("Origin")); response.setCharacterEncoding("UTF-8");
		 * response.setContentType("application/json;charset=UTF-8"); Map<String,
		 * String> message = new HashMap<String, String>(); message.put("code", "300");
		 * message.put("msg", "登陆认证失败"); PrintWriter out = response.getWriter();
		 * out.write(JSON.toJSONString(message,
		 * SerializerFeature.DisableCircularReferenceDetect)); out.flush(); return
		 * false; }
		 */
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
