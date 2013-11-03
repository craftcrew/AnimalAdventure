package craftcrew.animaladventure.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import craftcrew.animaladventure.CommonProxy;
import craftcrew.animaladventure.mobs.Lion;
import craftcrew.animaladventure.mobs.Lion.RenderLion;
import craftcrew.animaladventure.mobs.ModelLion;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        
        RenderingRegistry.registerEntityRenderingHandler(Lion.class,
                new RenderLion(new ModelLion(), 0.5F));

    }

}
