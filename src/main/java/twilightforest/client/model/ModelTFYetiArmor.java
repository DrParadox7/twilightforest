package twilightforest.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelTFYetiArmor extends ModelBiped {

    private ModelRenderer bipedLegBody;
    private ModelRenderer rightRuff;
    private ModelRenderer leftRuff;
    private ModelRenderer rightToe;
    private ModelRenderer leftToe;

    public ModelTFYetiArmor(int part, float expand) {
        super(expand);

        // bigger head
        this.bipedHead = new ModelRenderer(this, 0, 0);
        this.bipedHead.addBox(-4.5F, -7.5F, -4.0F, 9, 8, 8, expand);
        this.bipedHead.setRotationPoint(0.0F, 0.0F + expand, 0.0F);

        // add horns
        addPairHorns(-8.0F, 35F);
        addPairHorns(-6.0F, 15F);
        addPairHorns(-4.0F, -5F);

        // change leg texture
        this.bipedRightLeg = new ModelRenderer(this, 40, 0);
        this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, expand);
        this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + 0.0F, 0.0F);

        this.bipedLeftLeg = new ModelRenderer(this, 40, 0);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, expand);
        this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + 0.0F, 0.0F);

        rightRuff = new ModelRenderer(this, 40, 22);
        rightRuff.addBox(-2.5F, 0.0F, -2.5F, 5, 2, 5, expand);
        rightRuff.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.bipedRightLeg.addChild(rightRuff);

        leftRuff = new ModelRenderer(this, 40, 22);
        leftRuff.addBox(-2.5F, 0.0F, -2.5F, 5, 2, 5, expand);
        leftRuff.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.bipedLeftLeg.addChild(leftRuff);

        rightToe = new ModelRenderer(this, 40, 17);
        rightToe.addBox(-2.0F, 0.0F, -1.0F, 4, 2, 1, expand);
        rightToe.setRotationPoint(0.0F, 10.0F, -2.0F);
        this.bipedRightLeg.addChild(rightToe);

        leftToe = new ModelRenderer(this, 40, 17);
        leftToe.addBox(-2.0F, 0.0F, -1.0F, 4, 2, 1, expand);
        leftToe.setRotationPoint(0.0F, 10.0F, -2.0F);
        this.bipedLeftLeg.addChild(leftToe);

        // stuff for chest and legs
        this.bipedBody = new ModelRenderer(this, 0, 0);
        this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 11, 4, expand);
        this.bipedBody.setRotationPoint(0.0F, 0.0F + 0.0f, 0.0F);

        this.bipedLegBody = new ModelRenderer(this, 40, 16);
        this.bipedLegBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, expand);
        this.bipedLegBody.setRotationPoint(0.0F, 0.0F + 0.0f, 0.0F);

        this.bipedRightArm = new ModelRenderer(this, 0, 16);
        this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 10, 4, expand);
        this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + 0.0f, 0.0F);

        this.bipedLeftArm = new ModelRenderer(this, 0, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 10, 4, expand);
        this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + 0.0f, 0.0F);

        switch (part) {
            case 0 -> { // helmet
                this.bipedHead.showModel = true;
                this.bipedHeadwear.showModel = false;
                this.bipedBody.showModel = false;
                this.bipedRightArm.showModel = false;
                this.bipedLeftArm.showModel = false;
                this.bipedLegBody.showModel = false;
                this.bipedRightLeg.showModel = false;
                this.bipedLeftLeg.showModel = false;
            }
            case 1 -> { // chest
                this.bipedHead.showModel = false;
                this.bipedHeadwear.showModel = false;
                this.bipedBody.showModel = true;
                this.bipedRightArm.showModel = true;
                this.bipedLeftArm.showModel = true;
                this.bipedLegBody.showModel = false;
                this.bipedRightLeg.showModel = false;
                this.bipedLeftLeg.showModel = false;
            }
            case 2 -> { // pants
                this.bipedHead.showModel = false;
                this.bipedHeadwear.showModel = false;
                this.bipedBody.showModel = false;
                this.bipedRightArm.showModel = false;
                this.bipedLeftArm.showModel = false;
                this.bipedLegBody.showModel = true;
                this.bipedRightLeg.showModel = true;
                this.bipedLeftLeg.showModel = true;
                this.leftRuff.showModel = false;
                this.leftToe.showModel = false;
                this.rightRuff.showModel = false;
                this.rightToe.showModel = false;
            }
            case 3 -> { // boots
                this.bipedHead.showModel = false;
                this.bipedHeadwear.showModel = false;
                this.bipedBody.showModel = false;
                this.bipedRightArm.showModel = false;
                this.bipedLeftArm.showModel = false;
                this.bipedLegBody.showModel = false;
                this.bipedRightLeg.showModel = true;
                this.bipedLeftLeg.showModel = true;
                this.leftRuff.showModel = true;
                this.leftToe.showModel = true;
                this.rightRuff.showModel = true;
                this.rightToe.showModel = true;
            }
        }
    }

    /**
     * Add a pair of horns
     */
    private void addPairHorns(float height, float zangle) {
        ModelRenderer horn1a;
        ModelRenderer horn1b;

        horn1a = new ModelRenderer(this, 0, 19);
        horn1a.addBox(-3.0F, -1.5F, -1.5F, 3, 3, 3);
        horn1a.setRotationPoint(-4.5F, height, -1.0F);
        horn1a.rotateAngleY = -30F / (180F / (float) Math.PI);
        horn1a.rotateAngleZ = zangle / (180F / (float) Math.PI);
        this.bipedHead.addChild(horn1a);

        horn1b = new ModelRenderer(this, 0, 26);
        horn1b.addBox(-4.0F, -1.0F, -1.0F, 5, 2, 2);
        horn1b.setRotationPoint(-3.0F, 0.0F, 0.0F);
        horn1b.rotateAngleY = -20F / (180F / (float) Math.PI);
        horn1b.rotateAngleZ = zangle / (180F / (float) Math.PI);
        horn1a.addChild(horn1b);

        ModelRenderer horn2a;
        ModelRenderer horn2b;

        horn2a = new ModelRenderer(this, 0, 19);
        horn2a.addBox(0.0F, -1.5F, -1.5F, 3, 3, 3);
        horn2a.setRotationPoint(4.5F, height, -1.0F);
        horn2a.rotateAngleY = 30F / (180F / (float) Math.PI);
        horn2a.rotateAngleZ = -zangle / (180F / (float) Math.PI);
        this.bipedHead.addChild(horn2a);

        horn2b = new ModelRenderer(this, 0, 26);
        horn2b.addBox(-1.0F, -1.0F, -1.0F, 5, 2, 2);
        horn2b.setRotationPoint(3.0F, 0.0F, 0.0F);
        horn2b.rotateAngleY = 20F / (180F / (float) Math.PI);
        horn2b.rotateAngleZ = -zangle / (180F / (float) Math.PI);
        horn2a.addChild(horn2b);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    @Override
    public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {

        if (par1Entity != null) {
            this.isSneak = par1Entity.isSneaking();
        }

        if (par1Entity != null && par1Entity instanceof EntityLivingBase) {
            this.heldItemRight = ((EntityLivingBase) par1Entity).getHeldItem() != null ? 1 : 0;

            // System.out.println("Held right = " + ((EntityLivingBase)par1Entity).getHeldItem());
        } else {
            // System.out.println("Entity = " + par1Entity);
        }

        super.render(par1Entity, par2, par3, par4, par5, par6, par7);

        this.bipedLegBody.render(par7);
    }

}
