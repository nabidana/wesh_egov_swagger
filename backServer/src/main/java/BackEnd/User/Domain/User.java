package BackEnd.User.Domain;

import java.util.HashMap;
import java.util.Map;

public class User {
    private Long id;
    private String username;
    private String email;
    private String provider;
    private String confirmed;
    private String blocked;
    private String createdAt;
    private String updatedAd;
    
    public Map<String, Object> getUserAttributes(){
        Map<String, Object> map = new HashMap<>();
        map.put("username", this.username);
        map.put("email", this.email);
        map.put("provider", this.provider);
        map.put("confirmed", this.confirmed);
        map.put("blocked", (this.blocked).equals("0") ? true : false );
        map.put("createdAt", this.createdAt);
        map.put("updatedAd", this.updatedAd);

        return map;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getBlocked() {
		return blocked;
	}

	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAd() {
		return updatedAd;
	}

	public void setUpdatedAd(String updatedAd) {
		this.updatedAd = updatedAd;
	}
}
