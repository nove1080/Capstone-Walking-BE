package com.walking.data.entity.constant;

public enum TrafficColor {
	RED,
	GREEN;

	public boolean isRed() {
		return this.equals(RED);
	}

	public boolean isGREEN() {
		return this.equals(GREEN);
	}
}
