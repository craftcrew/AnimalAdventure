package craftcrew.animaladventure.block;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BananaTreeStairs extends Block {

    //private static final int[][] field_72159_a = new int[][] {{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};


    private final Block modelBlock;
    private final int modelBlockMetadata;
    //private boolean field_72156_cr;
    //private int field_72160_cs;
    
    public BananaTreeStairs(int id, Block bananaTreePlanks, int metadata) {
        super(id, bananaTreePlanks.blockMaterial);
        this.modelBlock = bananaTreePlanks;
        this.modelBlockMetadata = metadata;
    }
}
