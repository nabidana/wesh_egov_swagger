package BackEnd.Reply.DTO;

public class ReplyDTO {
    private Long boardid;
    private String content;
    private String createdAt;
    private Long userid;
	public Long getBoardid() {
		return boardid;
	}
	public void setBoardid(Long boardid) {
		this.boardid = boardid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
}
