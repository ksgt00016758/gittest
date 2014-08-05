package com.saic.ebiz.ccc.cron;

import com.meidusa.toolkit.common.runtime.Application;
import com.meidusa.toolkit.common.runtime.ApplicationConfig;

/**
 * CRM Application 启动程序
 * 
 * @author pengyao  
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public class CccCronServiceApplication extends Application<ApplicationConfig> {

	//启动程序
    @Override
    public void doRun() {
    }

    @Override
    public ApplicationConfig getApplicationConfig() {
        return null;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "classpath:/conf/spring/spring-dal.xml", 
                              "classpath:/conf/spring/spring-impl.xml",
                              "classpath:/conf/spring/spring-jobschdule.xml"};
    }

    /**
     * 启动方法
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty(ApplicationConfig.PROJECT_MAINCLASS, CccCronServiceApplication.class.getName());
        Application.main(args);
    }
}
