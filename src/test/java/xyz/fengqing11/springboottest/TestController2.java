package xyz.fengqing11.springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class TestController2 {
    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void test() {
        ResponseEntity<String> hello = restTemplate
                .getForEntity("/hello?name={0}", String.class, "tyl");
        System.out.println(hello.getBody());
    }
}
