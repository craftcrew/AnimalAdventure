package craftcrew.animaladventure;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import craftcrew.animaladventure.item.*;

public class ItemHandler {
    public static Item banana;
    //public static int bananaID = banana.itemID;

    public static int getBananaID () {
        return banana.itemID;
    }
    
    public static void configureItems(Configuration config) {
        banana = new Banana(config.get("Items", "Banana", 5052).getInt(), 0, 0, false);
    }
    
    public static void registerItems(GameRegistry registry) {
        registry.registerItem(banana, "banana");
    }
    
    public static void setNames(LanguageRegistry registry) {
        registry.addName(banana, "Banana");
    }
}

