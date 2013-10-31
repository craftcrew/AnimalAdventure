package craftcrew.animaladventure.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import craftcrew.animaladventure.BlockHandler;
import craftcrew.animaladventure.ItemHandler;

//TODO BlockLeaves benutzen
//TODO Transparenz fixen
public class BananaTreeLeaves extends Block // implements IShearable
{

    public BananaTreeLeaves(int id, Material material) {
        super(id, material);

    }

    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
        if (!par1World.isRemote) {
            int j1 = 6;

            if ((par5 & 3) == 3) {
                j1 = 40;
            }

            if (par7 > 0) {
                j1 -= 2 << par7;

                if (j1 < 10) {
                    j1 = 10;
                }
            }

            if (par1World.rand.nextInt(j1) == 0) {
                int k1 = this.idDropped(par5, par1World.rand, par7);
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(ItemHandler.banana, 1, 0));
            }

            j1 = 200;

            if (par7 > 0) {
                j1 -= 10 << par7;

                if (j1 < 40) {
                    j1 = 40;
                }
            }
//TODO Add new rare Item to drop
            if ((par5 & 3) == 0 && par1World.rand.nextInt(j1) == 0) {
                this.dropBlockAsItem_do(par1World, par2, par3, par4, new ItemStack(BlockHandler.bananaSeeds, 1, 0));
            }
        }
    }

}