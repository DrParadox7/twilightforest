package twilightforest.client.particle;

import net.minecraft.world.World;

public class EntityTFSnowWarningFX extends EntityTFSnowFX {

    public EntityTFSnowWarningFX(World par1World, double par2, double par4, double par6, double par8, double par10,
            double par12, float par14) {
        super(par1World, par2, par4, par6, par8, par10, par12, par14);
        this.particleMaxAge = 50;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate() {
        super.onUpdate();

        this.motionY -= 0.019999999552965164D;
    }

}
