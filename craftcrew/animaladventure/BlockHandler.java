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
    public static Block bananaTreePlanks;
    public static Block bananaSeeds;
    public static Block bananaTreeStairs;

    public static void configureBlocks(Configuration config) {
        bananaTreeLog = new BananaTreeLog(config.get("Blocks", "Banana Tree Log", 700).getInt(), Material.wood).setUnlocalizedName("bananaTreeLog").setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundWoodFootstep).setHardness(2.0F);
        bananaTreeLeaves = new BananaTreeLeaves(config.get("Blocks", "Banana Tree Leaves", 701).getInt(), Material.leaves).setUnlocalizedName("bananaTreeLeaves").setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundGrassFootstep).setHardness(0.2F).setLightOpacity(0).setTextureName(BasicInfo.NAME.toLowerCase() + ":bananaTreeLeaves");
        bananaTreePlanks = new BananaTreePlanks(config.get("Blocks", "Banana Tree Planks", 702).getInt(), Material.wood).setUnlocalizedName("bananaTreePlanks").setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundWoodFootstep).setHardness(2.0F).setResistance(5.0F).setTextureName(BasicInfo.NAME.toLowerCase() + ":bananaTreePlanks");
        bananaSeeds = new BananaSeeds(config.get("Blocks", "Banana Seeds", 703).getInt(), Material.plants).setHardness(0.0F).setStepSound(Block.soundGrassFootstep).setUnlocalizedName("bananaSeeds").setCreativeTab(CreativeTabs.tabDecorations).setCreativeTab(CreativeTabs.tabDecorations).setTextureName(BasicInfo.NAME.toLowerCase() + ":bananaSeeds");
        bananaTreeStairs = new BananaTreeStairs(config.get("Blocks", "Banana Tree Stairs", 704).getInt(), BlockHandler.bananaTreePlanks, 0).setUnlocalizedName("bananaTreeStairs").setCreativeTab(CreativeTabs.tabBlock).setStepSound(Block.soundWoodFootstep).setLightOpacity(255).setHardness(2.0F).setResistance(3.0F);
    }

    public static void registerBlocks(GameRegistry registry) {
        registry.registerBlock(bananaTreeLog, "bananaTreeLog");
        registry.registerBlock(bananaTreeLeaves, "bananaTreeLeaves");
        registry.registerBlock(bananaTreePlanks, "bananaTreePlanks");
        registry.registerBlock(bananaSeeds, "bananaSeeds");
        registry.registerBlock(bananaTreeStairs, "bananaTreeStairs");
    }

    public static void setNames(LanguageRegistry registry) {
        registry.addName(bananaTreeLog, "Banana Tree Log");
        registry.addName(bananaTreeLeaves, "Banana Tree Leaves");
        registry.addName(bananaTreePlanks, "Banana Tree Planks");
        registry.addName(bananaSeeds, "Banana Seeds");
        registry.addName(bananaTreeStairs, "Banana Tree Stairs");
    }
}
