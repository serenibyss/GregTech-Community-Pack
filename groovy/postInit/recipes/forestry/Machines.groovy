// Escritoire
// Gated behind Steel generally. Average player won't make more than one of these, plus it's usually village loot.
mods.forestry.Carpenter.removeByOutput(item('forestry:escritoire'))
crafting.shapedBuilder()
        .name('forestry/machines/escritoire')
        .output(item('forestry:escritoire'))
        .matrix('Osh',
                'WWW',
                'FSF')
        .key("O", ore("stairWood"))
        .key("s", ore("toolSaw"))
        .key("h", ore("toolHammer"))
        .key("W", ore("slabWood"))
        .key("F", ore("fenceWood"))
        .key("S", ore("screwSteel"))
        .register()

crafting.removeByOutput(item('forestry:carpenter'))
crafting.shapedBuilder()
        .name('forestry/machines/carpenter')
        .output(item('forestry:carpenter'))
        .matrix('BPB',
                'BCB',
                'BMB')
        .key("B", ore('plateBronze'))
        .key("P", metaitem('electric.piston.lv'))
        .key("C", item('forestry:sturdy_machine'))
        .key("M", metaitem('electric.motor.lv'))
        .register()

crafting.removeByOutput(item('forestry:centrifuge'))
crafting.shapedBuilder()
        .name('forestry/machines/centrifuge')
        .output(item('forestry:centrifuge'))
        .matrix('BRB',
                'BCB',
                'BMB')
        .key("B", ore('plateBrass'))
        .key("R", ore('rotorTin'))
        .key("C", item('forestry:sturdy_machine'))
        .key("M", metaitem('electric.motor.lv'))
        .register()