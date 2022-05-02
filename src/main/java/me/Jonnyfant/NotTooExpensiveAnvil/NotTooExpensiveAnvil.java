package me.Jonnyfant.NotTooExpensiveAnvil;

import org.bukkit.plugin.java.JavaPlugin;

public class NotTooExpensiveAnvil extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AnvilListener(),this);
    }
}

