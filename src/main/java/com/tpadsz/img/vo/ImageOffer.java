package com.tpadsz.img.vo;
import org.hibernate.validator.constraints.NotBlank;

import com.alibaba.fastjson.JSONObject;
import com.tpadsz.vo.Offer;

public class ImageOffer extends Offer{

	public ImageOffer(String appid, String system, String type, String prefix, String name, String suffix) {
		super("4");
		this.name = name;
		this.type = type;
		this.system = system;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public static class Builder extends Offer.Builder{
		protected String name;
		protected String type;
		protected String system;
		protected String prefix;
		protected String suffix;
		
		public Builder(JSONObject jsonObject){
			super(jsonObject);
			this.name = jsonObject.getString("name");
			this.type = jsonObject.getString("type");
			this.system = jsonObject.getString("system");
			this.prefix = jsonObject.getString("prefix") == null ? "icon" : jsonObject.getString("prefix");
			this.suffix = jsonObject.getString("suffix") == null ? "png" : jsonObject.getString("suffix");
		}
		
		public ImageOffer getModel(){
			return new ImageOffer(super.appid, this.system, this.type, this.prefix, this.name, this.suffix);
		}
		
	}
	
	public ImageOffer(String appid, String system, String type, String name) {
		this(appid, system, type, "icon", name, "png");
	}
	
	private static final long serialVersionUID = 1L;
	private String name;
	private String type;
	private String system;
	private String prefix;
	private String suffix;

	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotBlank
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@NotBlank
	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	@NotBlank
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	@NotBlank
	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
