package com.mvc.upgrade.common.fillter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {

	private Logger logger = LoggerFactory.getLogger(LogFilter.class);
	// 필터가 만들어질 때
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		String remoteAddr = req.getRemoteAddr();
		String uri = req.getRequestURI();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String referer = req.getHeader("referer");
		String agent = req.getHeader("User-Agent");
		
		StringBuffer sb = new StringBuffer();
		sb.append("\n* remoteAddr : " + remoteAddr)
		.append("\n* uri : " + uri)
		.append("\n* url : " + url)
		.append("\n* queryString : " + queryString)
		.append("\n* referer : " + referer)
		.append("\n* agent : " + agent)
		.append("\n");
		
		logger.info("\nLog Filter"+sb);
		
		chain.doFilter(req, response);

	}

	// 필터가 종료 될때
	@Override
	public void destroy() {

	}

}
