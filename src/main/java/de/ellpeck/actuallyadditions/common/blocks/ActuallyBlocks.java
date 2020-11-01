package de.ellpeck.actuallyadditions.common.blocks;

import de.ellpeck.actuallyadditions.common.ActuallyAdditions;
import de.ellpeck.actuallyadditions.common.blocks.types.Crystals;
import de.ellpeck.actuallyadditions.common.blocks.types.LaserRelays;
import de.ellpeck.actuallyadditions.common.blocks.types.PhantomType;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ActuallyBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ActuallyAdditions.MOD_ID);

    public static final RegistryObject<Block> blockCrystalClusterRedstone
            = BLOCKS.register("crystal_cluster_redstone_block", () -> new CrystalClusterBlock(Crystals.REDSTONE));

    public static final RegistryObject<Block> blockCrystalClusterLapis
            = BLOCKS.register("crystal_cluster_lapis_block", () -> new CrystalClusterBlock(Crystals.LAPIS));

    public static final RegistryObject<Block> blockCrystalClusterDiamond
            = BLOCKS.register("crystal_cluster_diamond_block", () -> new CrystalClusterBlock(Crystals.DIAMOND));

    public static final RegistryObject<Block> blockCrystalClusterCoal
            = BLOCKS.register("crystal_cluster_coal_block", () -> new CrystalClusterBlock(Crystals.COAL));

    public static final RegistryObject<Block> blockCrystalClusterEmerald
            = BLOCKS.register("crystal_cluster_emerald_block", () -> new CrystalClusterBlock(Crystals.EMERALD));

    public static final RegistryObject<Block> blockCrystalClusterIron
            = BLOCKS.register("crystal_cluster_iron_block", () -> new CrystalClusterBlock(Crystals.IRON));

    public static final RegistryObject<Block> blockBatteryBox
            = BLOCKS.register("battery_box_block", BatteryBoxBlock::new);

    public static final RegistryObject<Block> blockItemViewerHopping
            = BLOCKS.register("item_viewer_hopping_block", ItemViewerHoppingBlock::new);

    public static final RegistryObject<Block> blockFarmer
            = BLOCKS.register("farmer_block", FarmerBlock::new);

    public static final RegistryObject<Block> blockBioReactor
            = BLOCKS.register("bio_reactor_block", BioReactorBlock::new);

    public static final RegistryObject<Block> blockEmpowerer
            = BLOCKS.register("empowerer_block", EmpowererBlock::new);

    public static final RegistryObject<Block> blockTinyTorch
            = BLOCKS.register("tiny_torch_block", TinyTorchBlock::new);

    public static final RegistryObject<Block> blockShockSuppressor
            = BLOCKS.register("shock_suppressor_block", ShockSuppressorBlock::new);

    public static final RegistryObject<Block> blockDisplayStand
            = BLOCKS.register("display_stand_block", DisplayStandBlock::new);

    public static final RegistryObject<Block> blockPlayerInterface
            = BLOCKS.register("player_interface_block", PlayerInterfaceBlock::new);

    public static final RegistryObject<Block> blockItemViewer
            = BLOCKS.register("item_viewer_block", ItemViewerBlock::new);

    public static final RegistryObject<Block> blockFireworkBox
            = BLOCKS.register("firework_box_block", FireworkBoxBlock::new);

    public static final RegistryObject<Block> blockMiner
            = BLOCKS.register("miner_block", MinerBlock::new);

    public static final RegistryObject<Block> blockAtomicReconstructor
            = BLOCKS.register("atomic_reconstructor_block", AtomicReconstructorBlock::new);

    public static final RegistryObject<Block> blockCrystal
            = BLOCKS.register("crystal_block", () -> new CrystalBlock(false));

    public static final RegistryObject<Block> blockCrystalEmpowered
            = BLOCKS.register("crystal_empowered_block", () -> new CrystalBlock(true));

    public static final RegistryObject<Block> blockBlackLotus
            = BLOCKS.register("black_lotus_block", BlackLotusBlock::new);

    public static final RegistryObject<Block> blockLaserRelay
            = BLOCKS.register("laser_relay_block", () -> new LaserRelayBlock(LaserRelays.ENERGY_BASIC));

    public static final RegistryObject<Block> blockLaserRelayAdvanced
            = BLOCKS.register("laser_relay_advanced_block", () -> new LaserRelayBlock(LaserRelays.ENERGY_ADVANCED));

    public static final RegistryObject<Block> blockLaserRelayExtreme
            = BLOCKS.register("laser_relay_extreme_block", () -> new LaserRelayBlock(LaserRelays.ENERGY_EXTREME));

    public static final RegistryObject<Block> blockLaserRelayFluids
            = BLOCKS.register("laser_relay_fluids_block", () -> new LaserRelayBlock(LaserRelays.FLUIDS));

    public static final RegistryObject<Block> blockLaserRelayItem
            = BLOCKS.register("laser_relay_item_block", () -> new LaserRelayBlock(LaserRelays.ITEM));

    public static final RegistryObject<Block> blockLaserRelayItemWhitelist
            = BLOCKS.register("laser_relay_item_whitelist_block", () -> new LaserRelayBlock(LaserRelays.ITEM_WHITELIST));

    public static final RegistryObject<Block> blockRangedCollector
            = BLOCKS.register("ranged_collector_block", RangedCollectorBlock::new);

    public static final RegistryObject<Block> blockDirectionalBreaker
            = BLOCKS.register("directional_breaker_block", DirectionalBreakerBlock::new);

    public static final RegistryObject<Block> blockLeafGenerator
            = BLOCKS.register("leaf_generator_block", LeafGeneratorBlock::new);

    public static final RegistryObject<Block> blockSmileyCloud
            = BLOCKS.register("smiley_cloud_block", SmileyCloudBlock::new);

    public static final RegistryObject<Block> blockXPSolidifier
            = BLOCKS.register("xp_solidifier_block", XPSolidifierBlock::new);

    public static final RegistryObject<Block> blockTestifiBucksGreenWall
            = BLOCKS.register("testifi_bucks_green_wall_block", GenericBlock::new);

    public static final RegistryObject<Block> blockTestifiBucksWhiteWall
            = BLOCKS.register("testifi_bucks_white_wall_block", GenericBlock::new);

    public static final RegistryObject<Block> blockTestifiBucksGreenStairs
            = BLOCKS.register("testifi_bucks_green_stairs_block", () -> new StairsBlock(() -> blockTestifiBucksGreenWall.get().getDefaultState(), Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockTestifiBucksWhiteStairs
            = BLOCKS.register("testifi_bucks_white_stairs_block", () -> new StairsBlock(() -> blockTestifiBucksWhiteWall.get().getDefaultState(), Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockTestifiBucksGreenSlab
            = BLOCKS.register("testifi_bucks_green_slab_block", () -> new SlabBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockTestifiBucksWhiteSlab
            = BLOCKS.register("testifi_bucks_white_slab_block", () -> new SlabBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockTestifiBucksGreenFence
            = BLOCKS.register("testifi_bucks_green_fence_block", () -> new WallBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockTestifiBucksWhiteFence
            = BLOCKS.register("testifi_bucks_white_fence_block", () -> new WallBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockColoredLamp
            = BLOCKS.register("colored_lamp_block", () -> new ColoredLampBlock(false));

    public static final RegistryObject<Block> blockColoredLampOn
            = BLOCKS.register("colored_lamp_on_block", () -> new ColoredLampBlock(true));

    public static final RegistryObject<Block> blockLampPowerer
            = BLOCKS.register("lamp_powerer_block", LampPowererBlock::new);

    public static final RegistryObject<Block> blockTreasureChest
            = BLOCKS.register("treasure_chest_block", TreasureChestBlock::new);

    public static final RegistryObject<Block> blockEnergizer
            = BLOCKS.register("energizer_block", () -> new EnergizerBlock(true));

    public static final RegistryObject<Block> blockEnervator
            = BLOCKS.register("enervator_block", () -> new EnergizerBlock(false));

    public static final RegistryObject<Block> blockLavaFactoryController
            = BLOCKS.register("lava_factory_controller_block", LavaFactoryControllerBlock::new);

    public static final RegistryObject<Block> blockCanolaPress
            = BLOCKS.register("canola_press_block", CanolaPressBlock::new);

    public static final RegistryObject<Block> blockPhantomface
            = BLOCKS.register("phantomface_block", () -> new PhantomBlock(PhantomType.FACE));

    public static final RegistryObject<Block> blockPhantomPlacer
            = BLOCKS.register("phantom_placer_block", () -> new PhantomBlock(PhantomType.PLACER));

    public static final RegistryObject<Block> blockPhantomLiquiface
            = BLOCKS.register("phantom_liquiface_block", () -> new PhantomBlock(PhantomType.LIQUIFACE));

    public static final RegistryObject<Block> blockPhantomEnergyface
            = BLOCKS.register("phantom_energyface_block", () -> new PhantomBlock(PhantomType.ENERGYFACE));

    public static final RegistryObject<Block> blockPhantomRedstoneface
            = BLOCKS.register("phantom_redstoneface_block", () -> new PhantomBlock(PhantomType.REDSTONEFACE));

    public static final RegistryObject<Block> blockPhantomBreaker
            = BLOCKS.register("phantom_breaker_block", () -> new PhantomBlock(PhantomType.BREAKER));

    public static final RegistryObject<Block> blockCoalGenerator
            = BLOCKS.register("coal_generator_block", CoalGeneratorBlock::new);

    public static final RegistryObject<Block> blockOilGenerator
            = BLOCKS.register("oil_generator_block", OilGeneratorBlock::new);

    public static final RegistryObject<Block> blockFermentingBarrel
            = BLOCKS.register("fermenting_barrel_block", FermentingBarrelBlock::new);

    public static final RegistryObject<Block> blockRice
            = BLOCKS.register("rice_block", () -> new PlantBlock(1, 2));

    public static final RegistryObject<Block> blockCanola
            = BLOCKS.register("canola_block", () -> new PlantBlock(2, 3));

    public static final RegistryObject<Block> blockFlax
            = BLOCKS.register("flax_block", () -> new PlantBlock(2, 4));

    public static final RegistryObject<Block> blockCoffee
            = BLOCKS.register("coffee_block", () -> new PlantBlock(2, 2));

    public static final RegistryObject<Block> blockMisc
            = BLOCKS.register("misc_block", () -> new Block(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockFeeder
            = BLOCKS.register("feeder_block", FeederBlock::new);

    public static final RegistryObject<Block> blockGrinder
            = BLOCKS.register("grinder_block", () -> new GrinderBlock(false));

    public static final RegistryObject<Block> blockGrinderDouble
            = BLOCKS.register("grinder_double_block", () -> new GrinderBlock(true));

    public static final RegistryObject<Block> blockFurnaceDouble
            = BLOCKS.register("furnace_double_block", FurnaceDoubleBlock::new);

    public static final RegistryObject<Block> blockInputter
            = BLOCKS.register("inputter_block", () -> new InputterBlock(false));

    public static final RegistryObject<Block> blockInputterAdvanced
            = BLOCKS.register("inputter_advanced_block", () -> new InputterBlock(true));

    public static final RegistryObject<Block> blockFishingNet
            = BLOCKS.register("fishing_net_block", FishingNetBlock::new);

    public static final RegistryObject<Block> blockFurnaceSolar
            = BLOCKS.register("furnace_solar_block", FurnaceSolarBlock::new);

    public static final RegistryObject<Block> blockHeatCollector
            = BLOCKS.register("heat_collector_block", HeatCollectorBlock::new);

    public static final RegistryObject<Block> blockItemRepairer
            = BLOCKS.register("item_repairer_block", ItemRepairerBlock::new);

    public static final RegistryObject<Block> blockGreenhouseGlass
            = BLOCKS.register("greenhouse_glass_block", GreenhouseGlassBlock::new);

    public static final RegistryObject<Block> blockBreaker
            = BLOCKS.register("breaker_block", () -> new BreakerBlock(false));

    public static final RegistryObject<Block> blockPlacer
            = BLOCKS.register("placer_block", () -> new BreakerBlock(true));

    public static final RegistryObject<Block> blockDropper
            = BLOCKS.register("dropper_block", () -> new DropperBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockFluidPlacer
            = BLOCKS.register("fluid_placer_block", () -> new FluidCollectorBlock(true));

    public static final RegistryObject<Block> blockFluidCollector
            = BLOCKS.register("fluid_collector_block", () -> new FluidCollectorBlock(false));

    public static final RegistryObject<Block> blockCoffeeMachine
            = BLOCKS.register("coffee_machine_block", CoffeeMachineBlock::new);

    public static final RegistryObject<Block> blockPhantomBooster
            = BLOCKS.register("phantom_booster_block", PhantomBoosterBlock::new);

    public static final RegistryObject<Block> blockWildPlant
            = BLOCKS.register("wild_block", WildPlantBlock::new);

    public static final RegistryObject<Block> blockQuartzWall
            = BLOCKS.register("quartz_wall_block", () -> new WallBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockChiseledQuartzWall
            = BLOCKS.register("chiseled_quartz_wall_block", () -> new WallBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockPillarQuartzWall
            = BLOCKS.register("pillar_quartz_wall_block", () -> new WallBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockQuartzStair
            = BLOCKS.register("quartz_stair_block", () -> new StairsBlock(() -> blockBlackLotus.get().getDefaultState(), Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockChiseledQuartzStair
            = BLOCKS.register("chiseled_quartz_stair_block", () -> new StairsBlock(() -> blockBlackLotus.get().getDefaultState(), Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockPillarQuartzStair
            = BLOCKS.register("pillar_quartz_stair_block", () -> new StairsBlock(() -> blockBlackLotus.get().getDefaultState(), Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockQuartzSlab
            = BLOCKS.register("quartz_slab_block", () -> new SlabBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockChiseledQuartzSlab
            = BLOCKS.register("chiseled_quartz_slab_block", () -> new SlabBlock(Block.Properties.create(Material.ROCK)));

    public static final RegistryObject<Block> blockPillarQuartzSlab
            = BLOCKS.register("pillar_quartz_slab_block", () -> new SlabBlock(Block.Properties.create(Material.ROCK)));
}