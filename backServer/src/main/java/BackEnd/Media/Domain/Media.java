package BackEnd.Media.Domain;

import java.util.HashMap;
import java.util.Map;

public class Media {
    private Long id;
    private String name;
    private String alternativeText;
    private String caption;
    private int width;
    private int height;
    private String formats;
    private String hash;
    private String ext;
    private String mime;
    private double size;
    private String url;
    private String previewUrl;
    private String provider;
    private String provider_metadata;
    private String createdAt;
    private String updatedAt;

    public Map<String, Object> getMediaAttributes(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", this.name);
        map.put("alternativeText", this.alternativeText);
        map.put("caption", this.caption);
        map.put("width", this.width);
        map.put("height", this.height);
        map.put("formats", this.formats);
        map.put("hash", this.hash);
        map.put("ext", this.ext);
        map.put("mime", this.mime);
        map.put("size", this.size);
        map.put("url", this.url);
        map.put("previewUrl", this.previewUrl);
        map.put("provider", this.provider);
        map.put("provider_metadata", this.provider_metadata);
        map.put("createdAt", this.createdAt);
        map.put("updatedAt", this.updatedAt);
        return map;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternativeText() {
		return alternativeText;
	}

	public void setAlternativeText(String alternativeText) {
		this.alternativeText = alternativeText;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getFormats() {
		return formats;
	}

	public void setFormats(String formats) {
		this.formats = formats;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPreviewUrl() {
		return previewUrl;
	}

	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getProvider_metadata() {
		return provider_metadata;
	}

	public void setProvider_metadata(String provider_metadata) {
		this.provider_metadata = provider_metadata;
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
    
}
