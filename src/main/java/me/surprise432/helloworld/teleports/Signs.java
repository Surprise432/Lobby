package me.surprise432.helloworld.teleports;

import org.bukkit.Bukkit;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class Signs implements Listener {


    @EventHandler
    public void onSignEdit(SignChangeEvent sign ){
        String firstLine= sign.getLine(1);

        if(firstLine.equalsIgnoreCase("BedWars")){
            sign.setLine(1,"§7[§1Bedwars§7]");
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if(event.getClickedBlock() == null) return;

        if(event.getClickedBlock().getState() instanceof Sign){
            String warp=((Sign) event.getClickedBlock().getState()).getLine(1);

            if(warp.equalsIgnoreCase("§7[§1Bedwars§7]")){
                event.getPlayer().teleport(Bukkit.getWorld("MC_Server_1_18_2_Bedwars").getSpawnLocation());
            }
        }
    }

}
