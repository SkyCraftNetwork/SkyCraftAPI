package fr.lolpop78910.skycraftapi;

import fr.lolpop78910.skycraftapi.events.EventManager;
import javafx.application.Application;
import javafx.stage.Stage;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    String authors = "LolpopDev, Janer et SkyCraftNetwork";
    String name_plugin = getConfig().getString("plugin.name");
    String version = "1.0.0";
    public static Main instance;

    @Override
    public void onEnable() {
        instance=this;
        sysout("Name Plugin: "+name_plugin);
        sysout("Authors: "+authors);
        sysout("Version: "+version);
        EventManager.registerEvents();

        super.onEnable();
    }

    public static void sysout(String message){
        System.out.println(message);
    }

    public static Main getInstance() {
        return instance;
    }
}
