import static gregtech.api.GTValues.*

// Casings

// Sturdy Casing
// Used in the majority of Forestry machinery - bread and butter of balancing
crafting.removeByOutput(item('forestry:sturdy_machine'))
crafting.shapedBuilder()
        .name('forestry/components/sturdy_casing')
        .output(item('forestry:sturdy_machine'))
        .matrix('SPS',
                'PCP',
                'SPS')
        .key("S", ore("screwSteel"))
        .key("P", ore("plateBronze"))
        .key("C", item('gregtech:steam_casing'))
        .register()
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('gregtech:steam_casing'), ore("screwSteel") * 4)
    .outputs(item('forestry:sturdy_machine'))
    .duration(100) 
    .EUt(VA[LV])
    .buildAndRegister()

// Hardened Casing
// "Higher-tier" Forestry machines - anything you don't want the player immediately owning
mods.forestry.carpenter.removeByOutput(item('forestry:hardened_machine'))
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('gregtech:machine_casing', 2), ore("screwVanadiumSteel") * 4)
    .fluidInputs(fluid("glass") * 144)
    .outputs(item('forestry:hardened_machine'))
    .duration(100) 
    .EUt(VA[MV])
    .buildAndRegister()

// Impregnated Casing
// Used in the Apiary and Alveary. Possibly made tedious to craft without a setup for Seed Oil, helping gate the Alveary?
mods.forestry.carpenter.removeByOutput(item('forestry:impregnated_casing'))
mods.gregtech.assembler.recipeBuilder()
    .inputs(ore('frameGtImpregnatedWood'), ore("screwIron") * 4)
    .fluidInputs(fluid('seed_oil') * 144)
    .outputs(item('forestry:impregnated_casing'))
    .duration(100) 
    .EUt(VA[LV])
    .buildAndRegister()

// Flexible Casing
// Used in the Forestry Farms. Very agricultural
mods.forestry.ThermionicFabricator.removeByOutput(item('forestry:flexible_casing'))
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('gregtech:machine_casing', 1), ore("screwEmerald") * 4)
    .fluidInputs(fluid("glass") * 144)
    .outputs(item('forestry:flexible_casing'))
    .duration(100) 
    .EUt(VA[LV])
    .buildAndRegister()

// Reinforced Casing
// The key to unlocking the Genetics machines. Currently going to place it at HV, integration pending.
crafting.removeByOutput(item('genetics:misc'))
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('gregtech:machine_casing', 3), ore("screwBlueAlloy") * 4)
    .fluidInputs(fluid('borosilicate_glass') * 144)
    .outputs(item('genetics:misc'))
    .duration(100) 
    .EUt(VA[HV])
    .buildAndRegister()

// Integrated Casing
// The highest "tier" of Forestry casing. Likely gates a swathe of Gendustry.
crafting.removeByOutput(item('genetics:misc', 10))
mods.gregtech.assembler.recipeBuilder()
    .inputs(item('gregtech:machine_casing', 5), item('genetics:misc', 8) * 4)
    .fluidInputs(fluid('borosilicate_glass') * 144)
    .outputs(item('genetics:misc', 10))
    .duration(200)
    .EUt(VA[IV])
    .buildAndRegister()