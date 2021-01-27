package cn.com.taiji.spring;


import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;


public class ProxyUserServiceTest {

    @Test
    public void testProxyUserService(){
        ProxyUserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyUserServiceJdk(){
        System.out.println(new UserServiceImpl().getClass());
        ProxyJdk ProxyJdk = new ProxyJdk(new UserServiceImpl());
        UserService userService = (UserService) ProxyJdk.getProxy();
        System.out.println(userService.getClass());
        userService.update();
    }

    @Test
    public void testCglibProxy(){
        System.out.println(new UserDao().getClass());
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(new CglibMethodProxy());
        UserDao userDao = (UserDao) enhancer.create();
        System.out.println(userDao.getClass());
        userDao.save();
    }

}
