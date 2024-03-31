crafting.removeByOutput(item('tconstruct:pattern'))
crafting.shapedBuilder()
        .name('tconstruct/blank_pattern')
        .output(item('tconstruct:pattern'))
        .matrix('PW',
                'WP')
        .key('W', metaitem('wooden_form.empty'))
        .key("P", ore('paper'))
        .register()