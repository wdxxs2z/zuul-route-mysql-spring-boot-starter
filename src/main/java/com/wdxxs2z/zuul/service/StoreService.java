package com.wdxxs2z.zuul.service;

public class StoreService {
	
	private String description;
	
	private Boolean enabled;
	
	private Boolean fallback;
	
	public String printDescription() {
		return "Print description: " + description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getFallback() {
		return fallback;
	}

	public void setFallback(Boolean fallback) {
		this.fallback = fallback;
	}
}
