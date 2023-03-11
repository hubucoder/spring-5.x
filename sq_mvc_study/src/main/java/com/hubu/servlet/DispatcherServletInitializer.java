package com.hubu.servlet;

import com.hubu.config.RootConfig;
import com.hubu.config.WebServletConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * DispatcherServlet 初始化
 * @HandlesTypes (value = {WebApplicationInitializer.class})
 * DispatcherServletInitializer 是 WebApplicationInitializer 的实现类
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 告诉 spring 根配置类是哪个
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}