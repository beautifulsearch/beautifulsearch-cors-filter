package org.beautifulsearch.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter
public class CORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PATCH, PUT, DELETE, HEAD, OPTIONS");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, X-Requested-With, X-Auth-Token, Authorization, Accept");
        if (httpRequest.getMethod().equals("OPTIONS")) {
            // OPTIONS requests should always return a 200. The Solr BasicAuthorization plugin unfortunately doesn't respect this
            httpResponse.setStatus(200);
        }
        else
            filterChain.doFilter(request, response);
    }
    @Override
    public void destroy() {

    }
}