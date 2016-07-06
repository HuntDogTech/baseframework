package cn.huntdog.baseframework.dao;

import cn.huntdog.baseframework.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JonDai on 2016/7/6.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUserName(String userName);
}
