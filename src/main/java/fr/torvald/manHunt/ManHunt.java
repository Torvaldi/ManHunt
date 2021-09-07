package fr.torvald.manHunt;

import fr.torvald.manHunt.Listeners.BreakBlockEvent;
import fr.torvald.manHunt.Listeners.PutBlockEvent;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ManHunt extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ManHunt] " + ChatColor.WHITE + "Plugin started!");

        this.eventRegistrar();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[ManHunt] " + ChatColor.WHITE + "Plugin stopped!");
    }

    private void eventRegistrar() {
        getServer().getPluginManager().registerEvents(new BreakBlockEvent(), this);
        getServer().getPluginManager().registerEvents(new PutBlockEvent(), this);
    }

}
