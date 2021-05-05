package com.mvc.upgrade.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceoptor implements HandlerInterceptor {

	private Logger logger = LoggerFactory.getLogger(LoginInterceoptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("[Interceptor] : preHandle");
		
		
		// spring 3.2 이상 부터는 servlet context.xml 에서 exclude-mapping-path 를 사용하여 설정 가능
		// loginform.do 를 포함하고 잇으면 전달해라
		if(request.getRequestURI().contains("/loginform.do")) {
			return true;
		}
		/*
		 * if(request.getRequestURI().contains("/ajaxlogin.do")) { return true; }
		 * if(request.getSession().getAttribute("login") != null) { return true; }
		 * 
		 * if(request.getSession().getAttribute("login") == null) {
		 * response.sendRedirect("loginform.do"); return false; }
		 */
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		if(modelAndView != null) {
			logger.info("[Interceptor] : viewname -> " + modelAndView.getViewName() );
		}
		//뷰네임을 알 수 있음
		logger.info("[Interceptor] : postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		logger.info("[Interceptor] : afterCompletion");
		
	}

}
