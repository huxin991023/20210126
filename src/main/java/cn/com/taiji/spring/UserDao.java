package cn.com.taiji.spring;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDao {


    public void save(){
        System.out.println("dao save");
    }

    public  void update(){
        System.out.println("dao save");
    }
}
