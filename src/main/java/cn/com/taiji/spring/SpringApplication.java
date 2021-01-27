package cn.com.taiji.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
//        System.out.println(SingleTonUser.getInstance());
//        System.out.println(SingleTonUser.getInstance());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Appconfig.class);
//        context.addApplicationListener(new ApplicationStartedListner());
        context.refresh();
        for (String s :context.getBeanDefinitionNames()){
            System.out.println(s);
        }
//        UserService userService1 = context.getBean(UserService.class);
//
//        System.out.println(userService);
//        System.out.println(userService1);
//          userServiceImpl.save();
    }
}
