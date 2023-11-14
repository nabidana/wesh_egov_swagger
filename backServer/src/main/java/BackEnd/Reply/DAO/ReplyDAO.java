package BackEnd.Reply.DAO;

import java.util.List;

import BackEnd.Reply.Domain.Reply;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("replyMapper")
public interface ReplyDAO {
    List<Reply> selectReplyById(Long id);
}
