package craftcrew.animaladventure;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import craftcrew.animaladventure.block.*;
import craftcrew.animaladventure.item.*;

public class BlockHandler {
    public static Block bananaTreeLog;
    public static Block bananaTreeLeaves;
    
    
    public static void configureBlocks(Configuration config) {
        bananaTreeLog = new BananaTreeLog(config.get("Blocks", "Banana Tree Log", 551).getInt(),Material.wood).setUnlocalizedName("bananaTreeLog").setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundWoodFootstep).setHardness(2.0F);
        bananaTreeLeaves = new BananaTreeLeaves(config.get("Blocks", "Banana Tree Leaves", 552).getInt(),Material.leaves).setUnlocalizedName("bananaTreeLeaves").setCreativeTab(CreativeTabs.tabBlock).setTextureName(BasicInfo.NAME.toLowerCase() + ":bananaTreeLeaves").setHardness(0.2F).setLightOpacity(1);
    }
    
    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(bananaTreeLog, "bananaTreeLog");
        registry.registerBlock(bananaTreeLeaves, "bananaTreeLeaves");
    }
    
    public static void setNames(LanguageRegistry registry) {
        registry.addName(bananaTreeLog, "Banana Tree Log");
        registry.addName(bananaTreeLeaves, "Banana Tree Leaves");
    }
}
