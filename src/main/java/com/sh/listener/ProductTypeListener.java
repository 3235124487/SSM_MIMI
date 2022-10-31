package com.sh.listener;

import com.sh.pojo.ProductType;
import com.sh.service.ProductTypeService;
import com.sh.service.impl.ProductTypeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.List;

/**
 * @author GGBond
 * @version 1.0
 */
@WebListener
public class ProductTypeListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_*.xml");
        ProductTypeService bean = (ProductTypeService) ac.getBean("ProductTypeServiceImpl");
        List<ProductType> typeList = bean.getAll();
        servletContextEvent.getServletContext().setAttribute("typeList",typeList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
