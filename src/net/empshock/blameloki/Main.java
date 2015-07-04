package net.empshock.blameloki;

import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
        extends JavaPlugin
        implements CommandExecutor, Listener

{
    public void onEnable()
    {
        System.out.print("[BlameLoki] Enabled.");
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    public void onDisable()
    {
       System.out.print("[BlameLoki] Plugin disabled! Blame loki!");
    }




    public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args)
    {
        Player player = (Player)sender;
        if (commandlabel.equalsIgnoreCase("loki"))
        {
            player.setHealth(0);
            player.sendMessage(ChatColor.RED + "Blame Loki for killing you!");
            Bukkit.broadcastMessage(ChatColor.RED + "Loki has seeken revenge upon" + player.getName() + "!");
        }
        return false;
    }
}

