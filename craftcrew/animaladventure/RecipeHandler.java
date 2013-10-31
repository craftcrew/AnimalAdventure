package craftcrew.animaladventure;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import craftcrew.animaladventure.item.Banana;

public class RecipeHandler {

    public static ItemStack bananaStack = new ItemStack(ItemHandler.banana);
    public static ItemStack bananaSeedsStack = new ItemStack(BlockHandler.bananaSeeds);
    public static ItemStack bananaTreeLogStack = new ItemStack(BlockHandler.bananaTreeLog);
    public static ItemStack bananaTreePlanksStack = new ItemStack(BlockHandler.bananaTreePlanks, 4);
    
    public static void registerRecipes(GameRegistry registry) {
        registry.addShapelessRecipe(bananaSeedsStack, bananaStack);
        registry.addShapelessRecipe(bananaTreePlanksStack, bananaTreeLogStack);
    }
}
