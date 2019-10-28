package com.trforcex.mods.wallpapercraft;

import com.trforcex.mods.wallpapercraft.util.Logger;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = ModReference.MODID, name = "wallpapercraft")
@Mod.EventBusSubscriber
public class ModConfig
{
    @Config.Name("Compatibility")
    @Config.LangKey("config.wallpapercraft.compatibility")
    @Config.Comment("Compatibility related settings")
    public static Compatibility compatibility = new Compatibility();

    @Config.Name("Crafting")
    @Config.LangKey("config.wallpapercraft.crafting")
    @Config.Comment("Crafting related settings")
    public static Crafting crafting = new Crafting();

    @Config.Name("Debug")
    @Config.LangKey("config.wallpapercraft.debug")
    @Config.Comment("Debugging related settings")
    public static Debug debug = new Debug();

    @Config.Name("Enable tooltip hints")
    @Config.LangKey("config.wallpapercraft.tooltip_hints")
    @Config.Comment("Enable tooltip hints for mod blocks")
    public static boolean enableTooltipHints = true;

    public static class Compatibility
    {
        @Config.Name("Enable Chisel compatibility")
        @Config.LangKey("config.wallpapercraft.chisel")
        @Config.Comment("Enable this to initialize Chisel compatibility")
        @Config.RequiresMcRestart
        public boolean enableChiselCompatibility = true;

        @Config.Name("Register vanilla blocks to OreDictionary")
        @Config.LangKey("config.wallpapercraft.oredict")
        @Config.Comment("Enable this to register vanilla wool and wood planks to OreDictionary, if they aren't already registered to it")
        @Config.RequiresMcRestart
        public boolean registerVanillaWoolAndPlanksToOredict = true;

        @Config.Name("Enable Forestry wood planks scrolling")
        @Config.LangKey("config.wallpapercraft.planks_scrolling")
        @Config.Comment("Enable this to make Forestry wood planks scrollable")
        public boolean enableForestryWoodPlanksScrolling = false;
    }

    public static class Crafting
    {
        @Config.Name("Max Colored Paste uses")
        @Config.LangKey("config.wallpapercraft.paste")
        @Config.Comment("Determines how many times a piece colored paste can be used before it disappears")
        @Config.RangeInt(min = 1)
        @Config.RequiresMcRestart
        public int maxColoredPasteUsages = 64;

        @Config.Name("Max pattern presses uses")
        @Config.LangKey("config.wallpapercraft.presses")
        @Config.Comment({"Determines how many times a pattern press can be used before it breaks.", "Set to '0' to disable durability"})
        @Config.RangeInt(min = 0, max = Short.MAX_VALUE - 1)
        @Config.RequiresMcRestart
        public int maxPatternPressUses = 0;
    }

    public static class Debug
    {
        @Config.Name("Logging level")
        @Config.LangKey("config.wallpapercraft.logging_level")
        @Config.Comment("0 - disable logging; 1 - 'debug' level; 2 - 'verbose' level")
        @Config.RangeInt(min = 0, max = 2)
        public int loggingLevel = 0;

        @Config.Name("Redirect debug to latest.log file")
        @Config.LangKey("config.wallpapercraft.redirect_logs")
        @Config.Comment("")
        public boolean redirectDebugToInfoLogFile = false;
    }

    @SubscribeEvent
    public static void onConfigChanged(ConfigChangedEvent event)
    {
        if(event.getModID().equals(ModReference.MODID))
            update();
    }

    public static void update()
    {
        ConfigManager.sync(ModReference.MODID, Config.Type.INSTANCE);

        // Update logger settings
        Logger.setMaxLogLevel(debug.loggingLevel);
        Logger.setUseInfoInsteadOfDebug(debug.redirectDebugToInfoLogFile);
    }
}
