crafting.removeByOutput(item('tconstruct:pattern'))
crafting.shapedBuilder()
        .name('tconstruct/blank_pattern')
        .output(item('tconstruct:pattern'))
        .matrix('PW',
                'WP')
        .key('W', metaitem('wooden_form.empty'))
        .key("P", ore('paper'))
        .register()

crafting.removeByOutput(item('tconstruct:tooltables'))
crafting.shapelessBuilder()
        .name('tconstruct/crafting_station')
        .output(item('tconstruct:tooltables'))
        .input(item("minecraft:crafting_table"))
        .input(ore("craftingToolSaw"))
        .register()

// Tool Station
crafting.removeByOutput(item('tconstruct:tooltables', 3))
crafting.shapedBuilder()
        .name('tconstruct/tool_station')
        .output(item('tconstruct:tooltables', 3))
        .matrix('SPS',
                'LsL',
                'L L')
        .key("S", ore("slabWood"))
        .key("P", item('tconstruct:pattern'))
        .key("L", ore("fenceWood"))
        .key("s", ore("craftingToolSaw"))
        .register()

// Stencil Table
crafting.removeByOutput(item('tconstruct:tooltables', 1))
crafting.shapedBuilder()
        .name('tconstruct/stencil_table')
        .output(item('tconstruct:tooltables', 1).withNbt(["textureBlock": ["id": "minecraft:planks", "Count": 1, "Damage": (short) 0]]))
        .matrix('SPS',
                'LsL',
                'L L')
        .key("S", ore("slabWood"))
        .key("P", item('tconstruct:pattern'))
        .key("L", ore("plankWood"))
        .key("s", ore("craftingToolSaw"))
        .register()

// Part Builder
crafting.removeByOutput(item('tconstruct:tooltables', 2))
crafting.shapedBuilder()
        .name('tconstruct/part_builder')
        .output(item('tconstruct:tooltables', 2).withNbt(["textureBlock": ["id": "minecraft:log", "Count": 1, "Damage": (short) 0]]))
        .matrix('SPS',
                'LsL',
                'L L')
        .key("S", ore("slabWood"))
        .key("P", item('tconstruct:pattern'))
        .key("L", ore("logWood"))
        .key("s", ore("craftingToolSaw"))
        .register()