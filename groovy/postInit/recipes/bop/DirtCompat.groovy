import static gregtech.api.GTValues.*

// Dirt Compatibility!

// Gone are the days of the stupid BOP dirt clogging up your ME - now, you can turn it into something a little more useful.

// Loamy Dirt
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(ore('dirtLoamy'))
    .chancedOutput(metaitem('plant_ball'), 1000, 500) 
    .chancedOutput(item('minecraft:sand'), 5500, 1250) 
    .chancedOutput(metaitem('dustClay'), 300, 50) 
    .duration(250) 
    .EUt(VA[LV])
    .buildAndRegister()
crafting.removeByOutput(item('biomesoplenty:dirt', 8))
mods.gregtech.mixer.recipeBuilder()
    .inputs(item('biomesoplenty:dirt'), item("minecraft:gravel"))
    .outputs(item('biomesoplenty:dirt', 8) * 2)
    .duration(100) 
    .EUt(4)
    .buildAndRegister()

// Sandy Dirt
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(ore('dirtSandy'))
    .outputs(item('minecraft:dirt'))
    .chancedOutput(item('minecraft:sand'), 6000, 1000)
    .duration(250) 
    .EUt(VA[LV])
    .buildAndRegister()
crafting.removeByOutput(item('biomesoplenty:dirt', 9))
mods.gregtech.mixer.recipeBuilder()
    .inputs(item('biomesoplenty:dirt', 1), item("minecraft:gravel"))
    .outputs(item('biomesoplenty:dirt', 9) * 2)
    .duration(100) 
    .EUt(4)
    .buildAndRegister()

// Silty Dirt
mods.gregtech.centrifuge.recipeBuilder()
    .inputs(ore('dirtSilty'))
    .chancedOutput(metaitem('plant_ball'), 500, 50) 
    .chancedOutput(item('minecraft:sand'), 4500, 500) 
    .chancedOutput(metaitem('dustClay'), 1000, 250) 
    .duration(250) 
    .EUt(VA[LV])
    .buildAndRegister()
crafting.removeByOutput(item('biomesoplenty:dirt', 10))
mods.gregtech.mixer.recipeBuilder()
    .inputs(item('biomesoplenty:dirt', 2), item("minecraft:gravel"))
    .outputs(item('biomesoplenty:dirt', 10) * 2)
    .duration(100) 
    .EUt(4)
    .buildAndRegister()