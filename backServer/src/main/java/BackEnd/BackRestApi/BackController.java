package BackEnd.BackRestApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import BackEnd.Board.Domain.Board;
import BackEnd.Board.Service.BoardService;
import BackEnd.Media.Domain.Media;
import BackEnd.Media.Service.MediaService;
import BackEnd.Reply.Domain.Reply;
import BackEnd.Reply.Service.ReplyService;
import BackEnd.User.Domain.User;
import BackEnd.User.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = {"01. Board Info"}, description = "게시판 관련 서비스")
@RestController
public class BackController {

    @Resource(name = "boardService")
    private BoardService boardService;
    @Resource(name = "mediaService")
    private MediaService mediaService;
    @Resource(name = "userService")
    private UserService userService;
    @Resource(name = "replyService")
    private ReplyService replyService;

    @ApiOperation(value = "게시글 상세 조회", notes = "게시글을 상세하게 조회한다.")
    @GetMapping("/api/posts")
    public ResponseEntity<?> getBoardDetails(
        @RequestParam(value = "populate")String id,
        @RequestParam(value = "page", defaultValue = "1")String page,
        @RequestParam(value = "pageSize", defaultValue = "25")String pagesize
    ){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json;charset=UTF-8");
        try {
            Map<String, Object> map = new HashMap<>();

            Board board = boardService.getBoardById(id);
            User user = userService.getUserByBoard(board.getUserid());
            Media media = mediaService.getMediaByBoard(board.getMediaid());
            map.put("id", board.getId());
            Map<String, Object> boardMap = board.getBoardAttributes();
            Map<String, Object> userMap = user.getUserAttributes();
            Map<String, Object> mediaMap = media.getMediaAttributes();
            List<Reply> replyList = replyService.getReplyByBoard(id);
            boardMap.put("user", userMap);
            boardMap.put("media", mediaMap);
            boardMap.put("replies", replyList);
            map.put("attributes", boardMap);
            Long totalcount = boardService.getBoardTotalCount();
            Map<String, Object> pagination = new HashMap<>();
            pagination.put("page", page);
            pagination.put("pageSize", pagesize);
            pagination.put("pageCount", (totalcount/Long.parseLong(pagesize)+1));
            pagination.put("total", totalcount);
            map.put("pagesize", pagination);
            //replies
            return new ResponseEntity<Map<String, Object>>(map, headers, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.toString());
            return new ResponseEntity<>("Error By Response", headers, HttpStatus.OK);
        }
    }

    @ApiOperation(value = "게시글 전체 조회", notes = "게시글 전체 목록을 조회한다.")
    @GetMapping("/api/getallboards")
    public ResponseEntity<?> getAllBoard(
        @RequestParam(value = "page", defaultValue = "1")String page,
        @RequestParam(value = "pageSize", defaultValue = "25")String pagesize
    ){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json;charset=UTF-8");
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("pageSize", Long.parseLong(pagesize));
            map.put("page", Long.parseLong(page)-1);
            List<Board> result = boardService.getAllBoard(map);
            map = new HashMap<>();
            map.put("board", result);
            Long totalcount = boardService.getBoardTotalCount();
            Map<String, Object> pagination = new HashMap<>();
            pagination.put("page", page);
            pagination.put("pageSize", pagesize);
            pagination.put("pageCount", (totalcount/Long.parseLong(pagesize)+1));
            pagination.put("total", totalcount);
            map.put("pagesize", pagination);
            return new ResponseEntity<>(map, headers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error By Response", headers, HttpStatus.OK);
        }
    }

    @ApiOperation(value = "사용자 전체 조회", notes = "사용자 전체 목록을 조회한다.")
    @GetMapping("/api/getallusers")
    public ResponseEntity<?> getAllUser(
        @RequestParam(value = "page", defaultValue = "1")String page,
        @RequestParam(value = "pageSize", defaultValue = "25")String pagesize
    ){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json;charset=UTF-8");
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("pageSize", Long.parseLong(pagesize));
            map.put("page", Long.parseLong(page)-1);
            List<User> result = userService.getAllUser(map);
            map = new HashMap<>();
            map.put("board", result);
            Long totalcount = boardService.getBoardTotalCount();
            Map<String, Object> pagination = new HashMap<>();
            pagination.put("page", page);
            pagination.put("pageSize", pagesize);
            pagination.put("pageCount", (totalcount/Long.parseLong(pagesize)+1));
            pagination.put("total", totalcount);
            map.put("pagesize", pagination);
            return new ResponseEntity<>(map, headers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error By Response", headers, HttpStatus.OK);
        }
    }

}
