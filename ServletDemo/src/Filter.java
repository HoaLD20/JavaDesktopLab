import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        String remoteAddress = req.getRemoteAddr();
        System.out.println("remote protocol address: "+remoteAddress);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        String value = config.getInitParameter("new Param");
        System.out.println("The parameter value: "+value);

    }

}
