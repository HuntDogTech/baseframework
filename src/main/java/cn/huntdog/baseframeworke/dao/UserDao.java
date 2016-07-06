package cn.huntdog.baseframeworke.dao;

import cn.huntdog.baseframeworke.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by JonDai on 2016/7/6.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUserName(String userName);
}
