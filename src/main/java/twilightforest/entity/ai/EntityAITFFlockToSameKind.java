package twilightforest.entity.ai;

import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.Vec3;

public class EntityAITFFlockToSameKind extends EntityAIBase {

    private static final double MAX_DIST = 256.0D;
    private static final double MIN_DIST = 25.0D;
    /** The child that is following its parent. */
    EntityLiving flockCreature;
    Vec3 flockPosition;
    double speed;
    private int moveTimer;

    public EntityAITFFlockToSameKind(EntityLiving par1EntityLiving, double par2) {
        this.flockCreature = par1EntityLiving;
        this.speed = par2;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute() {
        if (this.flockCreature.getRNG().nextInt(40) != 0) {
            return false;
        }

        List<? extends EntityLiving> flockList = this.flockCreature.worldObj.getEntitiesWithinAABB(
                this.flockCreature.getClass(),
                this.flockCreature.boundingBox.expand(16.0D, 4.0D, 16.0D));

        int flocknum = 0;
        double flockX = 0;
        double flockY = 0;
        double flockZ = 0;

        for (EntityLiving flocker : flockList) {
            flocknum++;
            flockX += flocker.posX;
            flockY += flocker.posY;
            flockZ += flocker.posZ;
        }

        flockX /= flocknum;
        flockY /= flocknum;
        flockZ /= flocknum;

        if (flockCreature.getDistanceSq(flockX, flockY, flockZ) < MIN_DIST) {
            return false;
        } else {
            this.flockPosition = Vec3.createVectorHelper(flockX, flockY, flockZ);
            return true;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    @Override
    public boolean continueExecuting() {
        if (flockPosition == null) {
            return false;
        } else {
            double distance = this.flockCreature
                    .getDistanceSq(flockPosition.xCoord, flockPosition.yCoord, flockPosition.zCoord);
            return distance >= MIN_DIST && distance <= MAX_DIST;
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        this.moveTimer = 0;
    }

    /**
     * Resets the task
     */
    @Override
    public void resetTask() {
        this.flockPosition = null;
    }

    /**
     * Updates the task
     */
    @Override
    public void updateTask() {
        if (--this.moveTimer <= 0) {
            this.moveTimer = 10;
            this.flockCreature.getNavigator()
                    .tryMoveToXYZ(flockPosition.xCoord, flockPosition.yCoord, flockPosition.zCoord, this.speed);
        }
    }
}
