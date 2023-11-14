package BackEnd.User.DAO;

import java.util.List;
import java.util.Map;

import BackEnd.User.Domain.User;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("userMapper")
public interface UserDAO {
    User selectUserByBoard(Long id);
    List<User> selectAllUser(Map<String, Object> map);
    Long getUserTotalCount();
}
