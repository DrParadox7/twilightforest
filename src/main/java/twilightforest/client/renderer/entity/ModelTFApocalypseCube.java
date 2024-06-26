package twilightforest.client.renderer.entity;

import net.minecraft.client.model.ModelQuadruped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTFApocalypseCube extends ModelQuadruped {

    public ModelTFApocalypseCube() {
        this(0.0F);
    }

    public ModelTFApocalypseCube(float fNumber) {
        super(6, fNumber);

        this.textureWidth = 128;
        this.textureHeight = 64;

        this.head = new ModelRenderer(this, 0, 0);

        body = new ModelRenderer(this, 0, 0);
        body.addBox(-16F, -16F, -16F, 32, 32, 32);
        body.setRotationPoint(0F, 0F, -2F);

        leg1 = new ModelRenderer(this, 0, 0);
        leg1.addBox(-4F, 0F, -4F, 8, 8, 8);
        leg1.setRotationPoint(-6F, 16F, 9F);

        leg2 = new ModelRenderer(this, 0, 0);
        leg2.addBox(-4F, 0F, -4F, 8, 8, 8);
        leg2.setRotationPoint(6F, 16F, 9F);

        leg3 = new ModelRenderer(this, 0, 0);
        leg3.addBox(-4F, 0F, -4F, 8, 8, 8);
        leg3.setRotationPoint(-9F, 16F, -14F);

        leg4 = new ModelRenderer(this, 0, 0);
        leg4.addBox(-4F, 0F, -4F, 8, 8, 8);
        leg4.setRotationPoint(9F, 16F, -14F);

        this.field_78145_g = 4.0F;
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_,
            float p_78087_5_, float p_78087_6_, Entity p_78087_7_) {
        super.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_, p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);

        this.body.rotateAngleX = 0F;
    }

}
