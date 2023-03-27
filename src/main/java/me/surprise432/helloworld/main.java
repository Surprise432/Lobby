package me.surprise432.helloworld;

import me.surprise432.helloworld.commands.TestCommand;
import me.surprise432.helloworld.teleports.Signs;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());
        Bukkit.getPluginManager().registerEvents(new Signs(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
