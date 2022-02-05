package org.fireworksapi.bluenatural.builder;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class ParticleFirework {
    
	
	private static HashMap<UUID,ParticleTrail> particleputter = new HashMap<>();
	private Particle particle;
	public ParticleFirework(Particle p){
		this.particle = p;
	}
	public void setParticle(Player p){
		
		particleputter.put(p.getUniqueId(), new ParticleTrail(particle));
		
	}
    public static ParticleTrail getParticleTrail(UUID uuid){
    	return particleputter.get(uuid);
    }
    public boolean hasTrail(Player p){
    	return particleputter.containsKey(p.getUniqueId());
    }
    public void removeTrail(Player p){
    	particleputter.remove(p.getUniqueId());
    }


}
