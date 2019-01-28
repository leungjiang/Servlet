import javax.servlet.*;
import java.util.*;

/*
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
*/

/**
 * Servlet Filter implementation class LogFilter
 */
public class LogFilter implements Filter {

	public void init(FilterConfig config )throws ServletException{
		String site = config.getInitParameter("Site");
		System.out.println("网站名称:"+site);
	}
	
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws java.io.IOException,ServletException{
		System.out.println("站点网址:www.baidu.com");
		chain.doFilter(request, response);
	}
	
	public void destroy() {

	}

}
