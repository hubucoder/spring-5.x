package com.hubu;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;

/*
通过 tomcat 启动 spring mvc
 */
public class Test {
    /*
    项目启动入口
     */
    public static void main(String[] args) throws ServletException, LifecycleException {
        start();
    }

    /*
    启动 tomcat
     */
    public static void start() throws ServletException, LifecycleException {
        // 创建内嵌 tomcat
        Tomcat tomcatServer = new Tomcat();
        // 设置 tomcat 端口
        tomcatServer.setPort(8080);
        // 读取项目路径，加载项目资源
        StandardContext ctx = (StandardContext) tomcatServer.addWebapp("/sq_mvc_study", new File("sq_mvc_study/src/main/webapp").getAbsolutePath());
        // 不重新部署加载资源
        ctx.setReloadable(false);
        // 创建 webroot
        StandardRoot resources = new StandardRoot(ctx);
        // 指定编译后的 class 文件位置
        File additionWebInfClasses = new File("out/production/classes");
        // 添加 web 资源
        resources.addPreResources(new DirResourceSet(resources, "/", additionWebInfClasses.getAbsolutePath(), "/"));
        // 启动内嵌的 tomcat
        tomcatServer.start();
        // 等待前端请求，不退出程序
        tomcatServer.getServer().await();
    }
}
