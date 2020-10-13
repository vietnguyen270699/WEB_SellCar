package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {
	private ServletContext context;

	public AuthenticationFilter() {
	}

	public void destroy() {
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String uri = req.getRequestURI();
		
		this.context.log("Requested Resource::" + uri);

		HttpSession session = req.getSession(false);

		if (session == null && !(uri.endsWith("SuLyDangNhap") || uri.endsWith("admintableuser.jsp"))) {
			this.context.log("Unauthorized access request");
			res.sendRedirect("login.jsp");
		} else {
			chain.doFilter(request, response);
		}

	}

}
