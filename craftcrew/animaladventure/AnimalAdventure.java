package craftcrew.animaladventure;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = BasicInfo.ID, name = BasicInfo.NAME, version = BasicInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AnimalAdventure {

    @Instance("BasicInfo.NAME")
    public static AnimalAdventure instance;
    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide = "craftcrew.animaladventure.client.ClientProxy", serverSide = "craftcrew.animaladventure.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        ItemHandler.configureItems(config);
        BlockHandler.configureBlocks(config);
        config.save();
        BlockHandler.registerBlocks(new GameRegistry());
        BlockHandler.setNames(new LanguageRegistry());
        ItemHandler.registerItems(new GameRegistry());
        ItemHandler.setNames(new LanguageRegistry());
        RecipeHandler.registerRecipes(new GameRegistry());

    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
