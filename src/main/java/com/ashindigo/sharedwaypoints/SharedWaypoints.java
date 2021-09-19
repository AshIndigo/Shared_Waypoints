package com.ashindigo.sharedwaypoints;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;

@Mod(modid = SharedWaypoints.MODID, name = SharedWaypoints.NAME, version = SharedWaypoints.VERSION)
@Mod.EventBusSubscriber
public class SharedWaypoints {

    public static final String MODID = "sharedwaypoints";
    public static final String NAME = "Shared Waypoints";
    public static final String VERSION = "1.0";

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
    private static Logger logger;

    @SidedProxy(serverSide = "com.ashindigo.sharedwaypoints.CommonProxy", clientSide = "com.ashindigo.sharedwaypoints.ClientProxy")
    public static Proxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
    public static void onEvent(InputEvent.KeyInputEvent event) {
        // DEBUG
        System.out.println("Key Input Event");

        // make local copy of key binding array
        KeyBinding[] keyBindings = ClientProxy.keyBindings;

        // check each enumerated key binding type for pressed and take appropriate action
        if (keyBindings[0].isPressed()) {
            // DEBUG
            System.out.println("Key binding =" + keyBindings[0].getKeyDescription());

            // do stuff for this key binding here
            // remember you may need to send packet to server
        }
        if (keyBindings[1].isPressed()) {
            // DEBUG
            System.out.println("Key binding =" + keyBindings[1].getKeyDescription());

            // do stuff for this key binding here
            // remember you may need to send packet to server
        }
    }

}
