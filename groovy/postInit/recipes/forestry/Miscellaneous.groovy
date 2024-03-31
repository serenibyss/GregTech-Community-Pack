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