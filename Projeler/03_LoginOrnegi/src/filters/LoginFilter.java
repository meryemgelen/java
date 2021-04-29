package filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/login")
public class LoginFilter implements Filter {

List<String>izinVerilenler=Arrays.asList("/giris","/index.jsp","images/hgm_logo_18.png","/css/index.css");		
	
	
    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest	req= (HttpServletRequest)request;
		String url=req.getServletPath();	
		if( !izinVerilenler.contains(url)&& req.getSession().getAttribute("login")==null) {
		
		request.setAttribute("hata", "Yanlýþ Kullanýcý adý / Þifre");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else {
		chain.doFilter(request, response);}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
