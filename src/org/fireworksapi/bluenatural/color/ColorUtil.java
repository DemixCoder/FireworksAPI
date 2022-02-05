package org.fireworksapi.bluenatural.color;

import java.util.HashMap;

import org.bukkit.Color;


public class ColorUtil extends HashMap<java.awt.Color,org.bukkit.Color>{
	public HashMap<java.awt.Color,org.bukkit.Color> colorutil = this;
	/**
	 * Create ColorUtil to transfer between java.awt.Color and org.bukkit.Color
	 */
	public void setColors(){
		GreenColor gc = new GreenColor();
		BlackColor bc = new BlackColor();
		BlueColor bluecolor = new BlueColor();
		CyanColor cc = new CyanColor();
		OrangeColor oc = new OrangeColor();
		PeachColor pc = new PeachColor();
		PinkColor pinkcolor = new PinkColor();
		PurpleColor purplecolor = new PurpleColor();
		RedColor rc = new RedColor();
		YellowColor yc = new YellowColor();
	    this.put(gc.createColor(), org.bukkit.Color.GREEN);
	    this.put(bc.createColor(), Color.BLACK);
	    this.put(bluecolor.createColor(), Color.BLUE);
	    this.put(cc.createColor(), colorcyan());
	    this.put(oc.createColor(), Color.ORANGE);
	    this.put(pc.createColor(), colorpeach());
	    this.put(pinkcolor.createColor(), pinkcolor());
	    this.put(purplecolor.createColor(), Color.PURPLE);
	    this.put(rc.createColor(),Color.RED);
	    this.put(yc.createColor(), Color.YELLOW);
	    }
    public boolean containColor(java.awt.Color c){
    	return this.containsKey(c);
    }
	private Color pinkcolor() {
		// TODO Auto-generated method stub
		return Color.fromRGB(255, 167, 253);
	}

	private Color colorpeach() {
		// TODO Auto-generated method stub
		return Color.fromRGB(253, 180, 190);
	}

	private Color colorcyan() {
		// TODO Auto-generate
		return Color.fromRGB(133, 247,253);
	}
	

}
