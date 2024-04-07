// Minecarts

crafting.removeByOutput(item('forestry:cart.beehouse'))
crafting.shapedBuilder()
        .name('forestry/misc/beehouse_cart')
        .output(item('forestry:cart.beehouse'))
        .matrix('hBw',
                ' C ',
                ' s ')
        .key("h", ore("toolHammer"))
        .key("B", item('forestry:bee_house'))
        .key("w", ore("toolWrench"))
        .key("C", item("minecraft:minecart"))
        .key("s", ore("toolScrewdriver"))
        .register()

crafting.removeByOutput(item('forestry:cart.beehouse', 1))
crafting.shapedBuilder()
        .name('forestry/misc/apiary_cart')
        .output(item('forestry:cart.beehouse', 1))
        .matrix('hBw',
                ' C ',
                ' s ')
        .key("h", ore("toolHammer"))
        .key("B", item('forestry:apiary'))
        .key("w", ore("toolWrench"))
        .key("C", item("minecraft:minecart"))
        .key("s", ore("toolScrewdriver"))
        .register()


crafting.removeByOutput(item('forestry:smoker'))
crafting.shapedBuilder()
        .name('forestry/misc/bee_smoker')
        .output(item('forestry:smoker'))
        .matrix('LTs',
                'LFh',
                'TTT')
        .key("h", ore("toolHammer"))
        .key("T", ore("plateTin"))
        .key("s", ore("toolScrewdriver"))
        .key("F", item("minecraft:flint_and_steel"))
        .key("L", item("minecraft:leather"))
        .register()

crafting.removeByOutput(item('forestry:pipette'))
crafting.shapedBuilder()
        .name('forestry/misc/pipette')
        .output(item('forestry:pipette'))
        .matrix('  R',
                ' G ',
                'G  ')
        .key("R", ore("plateRubber"))
        .key("G", ore("boltGlass"))
        .register()