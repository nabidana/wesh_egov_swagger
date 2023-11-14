package BackEnd.Reply.Service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import BackEnd.Reply.DAO.ReplyDAO;
import BackEnd.Reply.Domain.Reply;

@Service("replyService")
public class ReplyService {
    
    @Resource(name = "replyMapper")
    private ReplyDAO replyDAO;

    public List<Reply> getReplyByBoard(String id) throws Exception{
        List<Reply> result = new ArrayList<>();
        Long long_id = Long.parseLong(id);
        result = replyDAO.selectReplyById(long_id);
        return result;
    }
}
