package BackEnd.Board.Domain;

import java.util.HashMap;
import java.util.Map;

public class Board {
    
    private Long id;
    private String title;
    private String content;
    private String createdAt;
    private String updatedAt;
    private String publishedAt;
    private String userid;
    private String mediaid;

    public Map<String, Object> getBoardAttributes(){
        Map<String, Object> map = new HashMap<>();
        map.put("title", this.title);
        map.put("content", this.content);
        map.put("createdAt", this.createdAt);
        map.put("updatedAt", this.updatedAt);
        map.put("publishedAt", this.publishedAt);

        return map;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getMediaid() {
		return mediaid;
	}

	public void setMediaid(String mediaid) {
		this.mediaid = mediaid;
	}
    
}
