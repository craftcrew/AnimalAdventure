package craftcrew.animaladventure;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import craftcrew.animaladventure.item.Banana;
import craftcrew.animaladventure.item.Ivory;
import craftcrew.animaladventure.item.IvoryAxe;
import craftcrew.animaladventure.item.IvoryHoe;
import craftcrew.animaladventure.item.IvoryPickaxe;
import craftcrew.animaladventure.item.IvoryShovel;
import craftcrew.animaladventure.item.IvorySword;

public class ItemHandler {
    public static Item banana;
    public static Item ivory;
    public static Item ivorySword;
    public static Item ivoryPickaxe;
    public static Item ivoryAxe;
    public static Item ivoryShovel;
    public static Item ivoryHoe;
    
    public static void configureItems(Configuration config) {
        //TODO reorder .set methods out of the itemclasses in the itemhandler class
        banana = new Banana(config.get("Items", "Banana", 800).getInt(), 4, 0.3F, false).setUnlocalizedName("banana").setCreativeTab(CreativeTabs.tabFood).setMaxStackSize(16).setTextureName(BasicInfo.NAME.toLowerCase() + ":banana");
        ivory = new Ivory(config.get("Items", "Ivory", 801).getInt()).setUnlocalizedName("ivory").setCreativeTab(CreativeTabs.tabMaterials).setMaxStackSize(64).setTextureName(BasicInfo.NAME.toLowerCase() + ":ivory");
        ivorySword = new IvorySword(config.get("Items", "IvorySword", 802).getInt(), AnimalAdventure.ivory).setCreativeTab(CreativeTabs.tabCombat).setUnlocalizedName("ivorySword").setTextureName(BasicInfo.NAME.toLowerCase() + ":ivorySword");
        ivoryPickaxe = new IvoryPickaxe(config.get("Items", "IvoryPickaxe", 803).getInt(), AnimalAdventure.ivory).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("ivoryPickaxe").setTextureName(BasicInfo.NAME.toLowerCase() + ":ivoryPickaxe");
        ivoryAxe = new IvoryAxe(config.get("Items", "IvoryAxe", 804).getInt(), AnimalAdventure.ivory).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("ivoryAxe").setTextureName(BasicInfo.NAME.toLowerCase() + ":ivoryAxe");
        ivoryShovel = new IvoryShovel(config.get("Items", "IvoryShovel", 805).getInt(), AnimalAdventure.ivory).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("ivoryShovel").setTextureName(BasicInfo.NAME.toLowerCase() + ":ivoryShovel");
        ivoryHoe = new IvoryHoe(config.get("Items", "IvoryHoe", 806).getInt(), AnimalAdventure.ivory).setCreativeTab(CreativeTabs.tabTools).setUnlocalizedName("ivoryHoe").setTextureName(BasicInfo.NAME.toLowerCase() + ":ivoryHoe");

        
    }
    
    public static void registerItems(GameRegistry registry) {
        registry.registerItem(banana, "banana");
        registry.registerItem(ivory, "ivory");
        registry.registerItem(ivorySword, "ivorySword");
        registry.registerItem(ivoryPickaxe, "ivoryPickaxe");
        registry.registerItem(ivoryAxe, "ivoryAxe");
        registry.registerItem(ivoryShovel, "ivoryShovel");
        registry.registerItem(ivoryHoe, "ivoryHoe");

        
    }
    
    public static void setNames(LanguageRegistry registry) {
        registry.addName(banana, "Banana");
        registry.addName(ivory, "Ivory");
        registry.addName(ivorySword, "Ivory Sword");
        registry.addName(ivoryPickaxe, "Ivory Pickaxe");
        registry.addName(ivoryAxe, "Ivory Axe");
        registry.addName(ivoryShovel, "Ivory Shovel");
        registry.addName(ivoryHoe, "Ivory Hoe");
    }
}

