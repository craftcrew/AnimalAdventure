package craftcrew.animaladventure.mobs;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLion extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Head;
  
  public ModelLion()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 18, 14);
      Body.addBox(-4F, -2F, -3F, 5, 10, 5);
      Body.setRotationPoint(0.5F, 13F, 1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 1.570796F, 0F, 0F);
      Mane = new ModelRenderer(this, 21, 0);
      Mane.addBox(-4F, -3F, -3F, 7, 7, 7);
      Mane.setRotationPoint(-0.5F, 14F, -4.466667F);
      Mane.setTextureSize(64, 32);
      Mane.mirror = true;
      setRotation(Mane, 1.570796F, 0F, 0F);
      Leg1 = new ModelRenderer(this, 0, 18);
      Leg1.addBox(-1F, 0F, -1F, 2, 9, 2);
      Leg1.setRotationPoint(-2.5F, 15F, 7F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 18);
      Leg2.addBox(-1F, 0F, -1F, 2, 9, 2);
      Leg2.setRotationPoint(0.5F, 15F, 7F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 18);
      Leg3.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg3.setRotationPoint(-2.5F, 16F, -4F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 18);
      Leg4.addBox(-1F, 0F, -1F, 2, 8, 2);
      Leg4.setRotationPoint(0.5F, 16F, -4F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 9, 18);
      Tail.addBox(-0.5F, 0F, -0.5F, 1, 8, 1);
      Tail.setRotationPoint(-1F, 12F, 8F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0.4493909F, 0F, 0F);
      Ear1 = new ModelRenderer(this, 16, 14);
      Ear1.addBox(-0.5F, -2F, -0.5F, 1, 1, 1);
      Ear1.setRotationPoint(-2F, 11.5F, -6.5F);
      Ear1.setTextureSize(64, 32);
      Ear1.mirror = true;
      setRotation(Ear1, 0F, 0F, 0F);
      Ear2 = new ModelRenderer(this, 16, 14);
      Ear2.addBox(-0.5F, -2F, -0.5F, 1, 1, 1);
      Ear2.setRotationPoint(0F, 11.5F, -6.5F);
      Ear2.setTextureSize(64, 32);
      Ear2.mirror = true;
      setRotation(Ear2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 0);
      Nose.addBox(-1F, -1F, -2F, 2, 2, 2);
      Nose.setRotationPoint(-1F, 12.5F, -8F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 10);
      Head.addBox(-2F, -1.533333F, -3F, 3, 3, 2);
      Head.setRotationPoint(-0.5F, 12F, -5.5F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
  }
      
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Mane.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);
    Tail.render(f5);
    Ear1.render(f5);
    Ear2.render(f5);
    Nose.render(f5);
    Head.render(f5);
  }
      private void setRotation(ModelRenderer model, float x, float y, float z)
      {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
      }
      
      public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
      {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
      }

    }
