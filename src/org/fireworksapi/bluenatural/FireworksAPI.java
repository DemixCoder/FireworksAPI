package org.fireworksapi.bluenatural;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class FireworksAPI extends JavaPlugin{
       public static Plugin plugin;
       public static Plugin getPlugin(){
    	   return plugin;
       }
       PluginDescriptionFile pdf = getDescription();
       @Override
       public void onEnable(){
    	   if(ServerVersion.is112() || ServerVersion.is114()){
    		   System.out.println(ChatColor.RED + "---------------------------");
    		   System.out.println(ChatColor.GOLD + "Name: " + pdf.getName());
    		   System.out.println(ChatColor.GOLD + "Version" + pdf.getVersion());
    		   System.out.println(ChatColor.GOLD + "Made by: DemixCoder");
    		   System.out.println(ChatColor.GOLD + "Made from: JustPeacefulBN");
    		   System.out.println(ChatColor.GOLD + "Support" + pdf.getWebsite());
    		   System.out.println(ChatColor.RED + "---------------------------");

    		   
    	   }else{
    		   plugin.getServer().getPluginManager().disablePlugin(plugin);
    	   }
       }
       @Override
       public void onDisable(){
    	   
       }
}
