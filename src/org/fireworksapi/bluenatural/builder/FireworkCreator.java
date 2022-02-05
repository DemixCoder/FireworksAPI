package org.fireworksapi.bluenatural.builder;

import java.util.HashMap;
import java.util.List;

import java.awt.Color;

import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.FireworkMeta;
import org.fireworksapi.bluenatural.FireworksAPI;
import org.fireworksapi.bluenatural.color.ColorUtil;
import org.fireworksapi.bluenatural.event.FireworkLaunchEvent;

import net.md_5.bungee.api.ChatColor;

public class FireworkCreator{
	private Location loc;
	private Particle p;
	private int flyingheight;
	private static HashMap<Firework,ColorUtil> colorsetter = new HashMap<>();
    private ParticleTrail pt;
    private boolean trail;
    private boolean flicker;
    private Type type;
    private Color color;
    private Color colorfade;
    
    public void setLocation(Location loc){
      this.loc = loc;
    }
    public void setFlyingHeight(int height){
    	this.flyingheight = height;
    }
    public void setParticleTrail(ParticleTrail pt){
    	this.pt = pt;
    }
    
    public void setTrail(Boolean trail){
    	this.trail = trail;
    }
    public void setParticle(Particle p){
    	this.p = p;
    }
    public void setFlicker(Boolean flicker){
    	this.flicker = flicker;
    }
    public void setType(Type type){
    	this.type = type;
    }
    
    public void setColor(java.awt.Color c){
    	this.color = c;
    }
    public void setColorFade(java.awt.Color c){
    	this.colorfade = c;
    }
    public Location getLocation(){
    	return loc;
    	
    }
    public int getFlyingHeight(){
    	return this.flyingheight;
    }
    public ParticleTrail getParticleTrail(){
    	return pt;
    }
   
    public Particle getParticle(){
    	return p;
    }
    public boolean getTrail(){
    	return trail;
    }
    public boolean getFlicker(){
    	return flicker;
    }
    public Type getType(){
    	return type;
    }
  
    public Color getColor(){
    	return color;
    }
    public Color getColorFade(){
    	return colorfade;
    }
   @SuppressWarnings({ "static-access" })
public void display(Player p2){
    	Firework f = loc.getWorld().spawn(loc, Firework.class);
    	FireworkMeta fm = f.getFireworkMeta();
       
       ColorUtil cu = new ColorUtil();
        ParticleFirework pf = new ParticleFirework(p);
        if(pf == null){
        	colorsetter.put(f, cu);
        	if(cu.containColor(color) && cu.containColor(colorfade)){
        		org.bukkit.Color color2 = cu.colorutil.get(color);
        		org.bukkit.Color colorfade2 = cu.colorutil.get(colorfade);
        		fm.addEffect(FireworkEffect.builder().flicker(flicker).trail(trail).with(type).withColor(color2).withFade(colorfade2).build());
        		fm.setPower(flyingheight);
        	}else{
        		System.out.println(ChatColor.RED + "Oops ! Something went wrong ! This isnt available");
        	}
         }else{
        	 if(pf.hasTrail(p2)){
        		 
        		 pf.getParticleTrail(p2.getUniqueId()).putFirework(f);
        	 }
         }
        FireworksAPI.getPlugin().getServer().getPluginManager().callEvent(new FireworkLaunchEvent(p2,f));
    }
   
}
