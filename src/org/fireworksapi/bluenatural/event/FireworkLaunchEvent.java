package org.fireworksapi.bluenatural.event;

import org.bukkit.Particle;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.fireworksapi.bluenatural.builder.ParticleFirework;

public class FireworkLaunchEvent extends Event implements Cancellable{
	
	private Player p;
	private Firework e;
	private Boolean bl;
	public FireworkLaunchEvent(Player p,Firework f){
		this.p = p;
		this.e = f;
	}
    public Player getLauncher(){
    	return p;
    }
    public Firework getFirework(){
    	return e;
    }
    @SuppressWarnings("static-access")
	public void setParticleFirework(Particle p2){
    	ParticleFirework pf= new ParticleFirework(p2);
    	if(pf.hasTrail(p)){
    		if(!pf.getParticleTrail(p.getUniqueId()).particleputter.containsKey(e.getUniqueId())){
    		    pf.getParticleTrail(p.getUniqueId()).putFirework(e);
    			
    		}else{
    			pf.getParticleTrail(p.getUniqueId()).removeFirework(e);
    			pf.getParticleTrail(p.getUniqueId()).putFirework(e);
    		}
    	}
    	
    }
    private static HandlerList getHandlers = new HandlerList();
	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return getHandlers;
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return bl;
	}

	@Override
	public void setCancelled(boolean bl) {
		// TODO Auto-generated method stub
		this.bl = bl;
		
	}
   


	
}

	


