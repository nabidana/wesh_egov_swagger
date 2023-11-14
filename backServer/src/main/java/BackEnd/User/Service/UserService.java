package BackEnd.User.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import BackEnd.User.DAO.UserDAO;
import BackEnd.User.Domain.User;

@Service("userService")
public class UserService {
    
    @Resource(name = "userMapper")
    private UserDAO userDAO;

    public User getUserByBoard(String id) throws Exception{
        Long long_id = Long.parseLong(id);
        return userDAO.selectUserByBoard(long_id);
    }

    public List<User> getAllUser(Map<String, Object> map){
        List<User> result = new ArrayList<>();
        try {
            result = userDAO.selectAllUser(map);
        } catch (Exception e) {
            
        }
        return result;
    }

    public Long getUserTotalCount(){
        Long result = (long) 0;
        try {
            result = userDAO.getUserTotalCount();
        } catch (Exception e) {
            
        }
        return result;
    }
}
