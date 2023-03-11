package twilightforest.client.renderer.entity;

import cpw.mods.fml.common.Loader;
import lain.mods.skinport.impl.forge.SkinPortModelPlayer;
import net.minecraft.client.model.ModelBiped;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderTFGiant extends RenderBiped {

    private ResourceLocation textureLoc;

    public RenderTFGiant() {
        super(skinCompat(), 0.625F);

        this.textureLoc = new ResourceLocation("textures/entity/steve.png");
    }

    /**
     * Return our specific texture
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity) {
        if (Minecraft.getMinecraft().thePlayer.getLocationSkin() != null) {
            return Minecraft.getMinecraft().thePlayer.getLocationSkin();
        } else {
            return textureLoc;
        }
    }
    /**
     * Compat for SkinPort
     */
    private static ModelBiped skinCompat() {
        return Loader.isModLoaded("skinport") ? new SkinPortModelPlayer(0.0F, false) : new ModelBiped();
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered.
     * Args: entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
        float scale = 4.0F;
        GL11.glScalef(scale, scale, scale);
    }
}
