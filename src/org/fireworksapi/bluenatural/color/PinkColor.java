package org.fireworksapi.bluenatural.color;

import java.awt.Color;

public class PinkColor extends ColorSetter{

	@Override
	public int getRed() {
		// TODO Auto-generated method stub
		return 255;
	}

	@Override
	public int getBlue() {
		// TODO Auto-generated method stub
		return 253;
	}

	@Override
	public int getGreen() {
		// TODO Auto-generated method stub
		return 167;
	}

	@Override
	public Color createColor() {
		// TODO Auto-generated method stub
		return new Color(getRed(),getGreen(),getBlue());
	}

}
