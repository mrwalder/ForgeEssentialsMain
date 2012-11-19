package com.ForgeEssentials.coremod;

import java.util.Arrays;

import com.ForgeEssentials.core.OutputHandler;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

public class FEModContainer extends DummyModContainer {
        
	public boolean mod;
	
	public FEModContainer() {
                super(new ModMetadata());
                /* ModMetadata is the same as mcmod.info */
                ModMetadata myMeta = super.getMetadata();
                myMeta.authorList = Arrays.asList(new String[] { "AbrarSyed", "Bob-A-Red-Dino", "bspkrs", "MysteriousAges", "luacs1998" });
                myMeta.description = "A permissions and protection system for use on Forge servers, replacing WorldEdit and WorldGuard functionality. ";
                myMeta.modId = "FEPreLoader";
                myMeta.version = "0.0.1";
                myMeta.name = "Forge Essentials|PreLoader";
                myMeta.url = "";
        }
        
        public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
        }
        
}