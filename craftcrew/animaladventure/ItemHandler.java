package craftcrew.animaladventure;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import craftcrew.animaladventure.item.*;

public class ItemHandler {
    public static Item banana;
    
    public static void configureItems(Configuration config) {
        //TODO reorder .set methods out of the itemclasses in the itemhandler class
        banana = new Banana(config.get("Items", "Banana", 9700).getInt(), 4, 0.3F, false).setCreativeTab(CreativeTabs.tabFood).setUnlocalizedName("banana").setMaxStackSize(16).setTextureName(BasicInfo.NAME.toLowerCase() + ":banana");
    }
    
    public static void registerItems(GameRegistry registry) {
        registry.registerItem(banana, "banana");
    }
    
    public static void setNames(LanguageRegistry registry) {
        registry.addName(banana, "Banana");
    }
}

