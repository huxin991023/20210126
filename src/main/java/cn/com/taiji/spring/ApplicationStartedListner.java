package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.util.CollectionUtils;

public class ApplicationStartedListner implements ApplicationListener<ContextRefreshedEvent> {

    public void onApplicationEvent(ContextRefreshedEvent event) {
        ApplicationContext context = event.getApplicationContext();
        System.out.println(event.getTimestamp());
        for (String s :context.getBeanDefinitionNames()){
            System.out.println(s);
        }
    }
}
