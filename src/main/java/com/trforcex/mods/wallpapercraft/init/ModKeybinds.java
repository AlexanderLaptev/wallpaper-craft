package com.trforcex.mods.wallpapercraft.init;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class ModKeybinds
{
    public static KeyBinding metaScrollKey;

    public static void register()
    {
        metaScrollKey = new KeyBinding("key.meta_cycle_key", Keyboard.KEY_LSHIFT, "key.categories.misc");
        ClientRegistry.registerKeyBinding(metaScrollKey);
    }
}
