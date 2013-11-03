package craftcrew.animaladventure;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = BasicInfo.ID, name = BasicInfo.NAME, version = BasicInfo.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class AnimalAdventure {

    public static EnumToolMaterial ivory = EnumHelper.addToolMaterial("Ivory", 0, 200, 3.0F, 1.5F, 24);
    
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
        MobHandler.setNames(new LanguageRegistry());
        MobHandler.registerMobs(new GameRegistry());
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
    
    public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
        int id = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
        EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColor, fgEggColor));
    }

    public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
        if (spawnProb > 0) {
            EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
        }
    }


}
