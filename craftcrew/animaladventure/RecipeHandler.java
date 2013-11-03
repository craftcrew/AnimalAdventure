package craftcrew.animaladventure;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
    
    public static void registerRecipes(GameRegistry registry) {
        registry.addShapelessRecipe(new ItemStack(BlockHandler.bananaSeeds), new ItemStack(ItemHandler.banana));
        registry.addShapelessRecipe(new ItemStack(BlockHandler.bananaTreePlanks, 4), new ItemStack(BlockHandler.bananaTreeLog));
        registry.addRecipe(new ItemStack(Item.stick, 2), "x  ", "x  ", "   ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Item.stick, 2), " x ", " x ", "   ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Item.stick, 2), "   ", "x  ", "x  ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Item.stick, 2), "   ", " x ", " x ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Block.workbench), "xx ", "xx ", "   ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Block.workbench), " xx", " xx", "   ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Block.workbench), "   ", "xx ", "xx ", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(Block.workbench), "   ", " xx", " xx", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(BlockHandler.bananaTreeStairs, 4), "x  ", "xx ", "xxx", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(BlockHandler.bananaTreeStairs, 4), "  x", " xx", "xxx", 'x', new ItemStack(BlockHandler.bananaTreePlanks));
        registry.addRecipe(new ItemStack(ItemHandler.ivorySword), " x ", " x ", " o ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivorySword), "x  ", "x  ", "o  ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivoryPickaxe), "xxx", " o ", " o ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivoryAxe), "xx ", "xo ", " o ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivoryAxe), " xx", " xo", " o ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivoryShovel), " x ", " o ", " o ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivoryShovel), "x  ", "o  ", "o  ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));
        registry.addRecipe(new ItemStack(ItemHandler.ivoryHoe), "xx ", " o ", " o ", 'x', new ItemStack(ItemHandler.ivory), 'o', new ItemStack(Item.stick));



    }
}
