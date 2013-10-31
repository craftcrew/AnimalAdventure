package craftcrew.animaladventure.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import craftcrew.animaladventure.BasicInfo;

public class BananaTreeLog extends Block {

    public BananaTreeLog(int id, Material material) {
        super(id, material);
    }
  

    @SideOnly(Side.CLIENT)
    public static Icon topIcon;
    @SideOnly(Side.CLIENT)
    public static Icon sideIcon;
    @SideOnly(Side.CLIENT)
    public static Icon bottomIcon;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        topIcon = icon.registerIcon(BasicInfo.NAME.toLowerCase() + ":bananaTreeLogTop");
        sideIcon = icon.registerIcon(BasicInfo.NAME.toLowerCase() + ":bananaTreeLogSide");
        bottomIcon = icon.registerIcon(BasicInfo.NAME.toLowerCase() + ":bananaTreeLogTop");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int metadata) {
        if (side == 0) {
            return bottomIcon;
        } else if (side == 1) {
            return topIcon;
        } else {
            return sideIcon;
        }
    }
}
