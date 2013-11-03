package craftcrew.animaladventure;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import craftcrew.animaladventure.mobs.Lion;

public class MobHandler {

    public static void setNames(LanguageRegistry registry) {
        registry.instance().addStringLocalization("entity.Lion.name", "Lion");        
    }

    public static void registerMobs(GameRegistry gameRegistry) {
        //TODO fix the lion block-bug
        AnimalAdventure.registerEntity(Lion.class, "Lion", 0xeaeae9, 0xc99a03);
        
    }

    
}
