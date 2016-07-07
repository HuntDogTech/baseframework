package cn.huntdog.baseframework.controller;

import cn.huntdog.baseframework.entity.User;
import cn.huntdog.baseframework.service.UserManager;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by JonDai on 2016/7/6.asdfasdf德玛西亚
 */
@RestController
@RequestMapping(value="/users")
public class UserController {
    @Resource
    private UserManager userManager;

    /**
     * 服务启动后，浏览器中输入：http://localhost:8080/users/1 即可查看到该数据的json格式
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userManager.getUserByID(id);
    }

//    @RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
//    List<Customer> getUserCustomers(@PathVariable Long user) {
//        // ...
//    }

//    @RequestMapping(value="/{user}", method=RequestMethod.DELETE)
//    public User deleteUser(@PathVariable Long user) {
//        // ...
//    }
}
