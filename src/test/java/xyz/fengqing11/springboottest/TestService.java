package xyz.fengqing11.springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.fengqing11.springboottest.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
    @Autowired
    HelloService helloService;
    @Test
    public void test(){
        String hello = helloService.sayHello("Michael");
        System.out.println(hello);
    }
}
