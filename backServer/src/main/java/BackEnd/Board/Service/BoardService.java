package BackEnd.Board.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import BackEnd.Board.DAO.BoardDAO;
import BackEnd.Board.Domain.Board;

@Service("boardService")
public class BoardService {
    
    @Resource(name = "boardMapper")
    private BoardDAO boardDAO;

    public Board getBoardById(String id) throws Exception{
        Long long_id = Long.parseLong(id);
        return boardDAO.selectBoardById(long_id);
    }

    public List<Board> getAllBoard(Map<String, Object> map){
        List<Board> result = new ArrayList<>();
        try {
            result = boardDAO.selectAllBoard(map);
        } catch (Exception e) {
            
        }
        return result;
    }

    public Long getBoardTotalCount(){
        Long result = (long) 0;
        try {
            result = boardDAO.getBoardTotalCount();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
}
