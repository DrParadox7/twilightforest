package twilightforest.structures.courtyard;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;

import twilightforest.block.TFBlocks;
import twilightforest.tileentity.TileEntityTFNagastone;

public class ComponentTFNagaCourtyardTerraceStatueBorder extends ComponentTFNagaCourtyardRotatedAbstract {

    public ComponentTFNagaCourtyardTerraceStatueBorder() {
        super();
    }

    public ComponentTFNagaCourtyardTerraceStatueBorder(int i, int x, int y, int z, int rotation) {
        super(i, x, y, z, rotation);
        this.coordBaseMode = rotation;
        this.boundingBox = new StructureBoundingBox(x, y - 1, z - 1, x + 5, y + 5, z + 7);
    }

    @Override
    public boolean addComponentParts(World world, Random random, StructureBoundingBox structureBoundingBox) {

        // ground stairs
        this.fillWithMetadataBlocks(
                world,
                structureBoundingBox,
                4,
                0,
                1,
                4,
                0,
                7,
                Blocks.stone_brick_stairs,
                rotatedStairs3,
                Blocks.stone_brick_stairs,
                rotatedStairs3,
                true);
        this.fillWithMetadataBlocks(
                world,
                structureBoundingBox,
                4,
                0,
                2,
                4,
                0,
                3,
                TFBlocks.nagastoneStairsRight,
                rotatedStairs3,
                TFBlocks.nagastoneStairsRight,
                rotatedStairs3,
                true);
        this.fillWithMetadataBlocks(
                world,
                structureBoundingBox,
                4,
                0,
                5,
                4,
                0,
                6,
                TFBlocks.nagastoneStairsLeft,
                rotatedStairs3,
                TFBlocks.nagastoneStairsLeft,
                rotatedStairs3,
                true);

        // borders
        this.fillWithMetadataBlocks(
                world,
                structureBoundingBox,
                0,
                1,
                1,
                0,
                1,
                7,
                TFBlocks.nagastone,
                1,
                TFBlocks.nagastone,
                1,
                true);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                1,
                structureBoundingBox);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                2,
                structureBoundingBox);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                3,
                structureBoundingBox);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                4,
                structureBoundingBox);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                5,
                structureBoundingBox);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                6,
                structureBoundingBox);
        this.setTileEntityAtCurrentPosition(
                world,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneWest),
                0,
                1,
                7,
                structureBoundingBox);
        this.placeBlockAtCurrentPosition(
                world,
                Blocks.stone_brick_stairs,
                rotatedStairs1,
                1,
                1,
                0,
                structureBoundingBox);
        this.placeBlockWithTileEntityAtCurrentPosition(
                world,
                TFBlocks.nagastone,
                0,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneSouth),
                1,
                1,
                1,
                structureBoundingBox);
        this.placeBlockAtCurrentPosition(
                world,
                Blocks.stone_brick_stairs,
                rotatedStairs0,
                1,
                1,
                2,
                structureBoundingBox);
        this.placeBlockAtCurrentPosition(
                world,
                Blocks.stone_brick_stairs,
                rotatedStairs1,
                1,
                1,
                6,
                structureBoundingBox);
        this.placeBlockWithTileEntityAtCurrentPosition(
                world,
                TFBlocks.nagastone,
                0,
                new TileEntityTFNagastone(TileEntityTFNagastone.Direction.SIDE, NagastoneSouth),
                1,
                1,
                7,
                structureBoundingBox);
        this.placeBlockAtCurrentPosition(
                world,
                Blocks.stone_brick_stairs,
                rotatedStairs0,
                1,
                1,
                8,
                structureBoundingBox);

        // columns
        this.placeBlockAtCurrentPosition(world, TFBlocks.nagastoneEtched, 0, 4, 0, 0, structureBoundingBox);
        this.fillWithMetadataBlocks(
                world,
                structureBoundingBox,
                4,
                1,
                0,
                4,
                5,
                0,
                TFBlocks.nagastonePillar,
                0,
                TFBlocks.nagastonePillar,
                0,
                false);
        this.placeBlockAtCurrentPosition(world, Blocks.stone_slab, 5, 4, 6, 0, structureBoundingBox);
        this.placeBlockAtCurrentPosition(world, Blocks.fence, 0, 5, 4, 0, structureBoundingBox);
        this.placeBlockAtCurrentPosition(world, Blocks.fence, 0, 4, 4, 1, structureBoundingBox);
        this.placeBlockAtCurrentPosition(world, Blocks.torch, 5, 5, 5, 0, structureBoundingBox);
        this.placeBlockAtCurrentPosition(world, Blocks.torch, 5, 4, 5, 1, structureBoundingBox);

        return true;
    }
}
