package me.Jonnyfant.NotTooExpensiveAnvil;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NotTooExpensiveAnvil extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AnvilListener(),this);
    }
}

class AnvilListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onAnvilUse(PrepareAnvilEvent e) {
        e.getInventory().setMaximumRepairCost(9999999);
    }
}

