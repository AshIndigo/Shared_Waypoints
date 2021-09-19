package com.ashindigo.sharedwaypoints;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.lwjgl.input.Keyboard;

public class ClientProxy implements Proxy {

    public static KeyBinding[] keyBindings;

    @Override
    public void init(FMLInitializationEvent event) {
        keyBindings = new KeyBinding[1];
        keyBindings[0] = new KeyBinding("key."+SharedWaypoints.MODID+"."+SharedWaypoints.MODID, Keyboard.KEY_P, "key."+SharedWaypoints.MODID+".category");
        for (KeyBinding keyBinding : keyBindings) {
            ClientRegistry.registerKeyBinding(keyBinding);
        }
    }
}
