import static gregtech.api.GTValues.*

// Random recipe tweaks so things are unified

crafting.remove('biomesoplenty:sand_from_dried_sand')
mods.gregtech.chemical_bath.recipeBuilder()
    .inputs(item('biomesoplenty:dried_sand'))
    .fluidInputs(fluid("water") * 100)
    .outputs(item('minecraft:sand'))
    .duration(20) 
    .EUt(VA[ULV])
    .buildAndRegister()