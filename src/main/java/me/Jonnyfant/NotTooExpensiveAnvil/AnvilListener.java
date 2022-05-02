package me.Jonnyfant.NotTooExpensiveAnvil;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

public class AnvilListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onAnvilUse(PrepareAnvilEvent e) {

        if(e.getInventory().getRepairCost()>=39) {
            e.getInventory().setRepairCost(39);
        }
        e.getInventory().setMaximumRepairCost(9999999);

        //For some reason the plugin doesn't work without sending a message. Very weird.
        String msg = "Repair Cost: " + e.getInventory().getRepairCost() +" Maximum repair cost: " + e.getInventory().getMaximumRepairCost();
        Player grian = Bukkit.getPlayer("Grian");
        grian.sendMessage(msg);
    }
}
