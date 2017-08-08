package me.ghast.lff;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
		System.out.println("[LFF] Plugin enabled :)");
		
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("lff")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (sender.hasPermission("lff.use")) {
					for (Player ps : Bukkit.getOnlinePlayers()) {
						ps.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "+--------------------------------------------+");
						ps.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + sender.getName() + ChatColor.YELLOW + " has requested a faction! Contact him with /message " + sender.getName() + " !");
						ps.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "+--------------------------------------------+");
					}
					
					
				}
				
			} else {
				System.out.println("[LFF] Command is Player only.");
			}
		} 
		return false;
	}
	
}
