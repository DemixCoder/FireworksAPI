package org.fireworksapi.bluenatural.builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Firework;
public class ParticleTrail {
	private Particle p;
	
	private List<Firework> fireworks = new ArrayList<>();
	public static HashMap<UUID,Particle> particleputter = new HashMap<>();
	public ParticleTrail(Particle p){
		this.p = p;
	}
	public void putFirework(Firework f){
		fireworks.add(f);
		particleputter.put(f.getUniqueId(),p);
	}
	public void removeFirework(Firework f){
		fireworks.remove(f);
		particleputter.remove(f.getUniqueId(), p);
	}
	public void playParticle(Location loc){
	   loc.getWorld().spawnParticle(p, loc, 15);
	}
	public void tick(){
		for(Firework f: fireworks){
			if(f.hasGravity() || f.isEmpty() || f.isDead() || f== null){
				fireworks.remove(f);
			}else{
				playParticle(f.getLocation());
				
			}
		}
	}

}
