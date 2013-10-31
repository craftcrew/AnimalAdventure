package craftcrew.animaladventure.block;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BananaSeeds extends BlockFlower {

    public BananaSeeds(int id, Material material) {
        super(id, material);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }
}
