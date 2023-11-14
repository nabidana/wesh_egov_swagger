package BackEnd.Board.DAO;

import java.util.List;
import java.util.Map;

import BackEnd.Board.Domain.Board;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("boardMapper")
public interface BoardDAO {
    //게시판 상세 조회
    Board selectBoardById(Long id);
    List<Board> selectAllBoard(Map<String, Object>map);
    Long getBoardTotalCount();
}
