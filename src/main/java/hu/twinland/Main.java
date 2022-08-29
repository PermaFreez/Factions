package hu.twinland;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		this.getServer().getConsoleSender().sendMessage("Factions plugin has started succesfully!");
	}
	
	public void onDisable() {
		
	}
}
