package net.kunmc.lab.chatoperationplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.HashMap;
import java.util.Map;


public final class Chatoperationplugin extends JavaPlugin implements Listener {
    public static Chatoperationplugin INSTANCE;
    public int mode;
    public String target = null;


    @Override
    public void onEnable() {
        INSTANCE=this;
        // イベント登録
        getCommand("cho").setExecutor(new CommandListener());
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        Chatoperationplugin.INSTANCE.mode=1;
    }

}