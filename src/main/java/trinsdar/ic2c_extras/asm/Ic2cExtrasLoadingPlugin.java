package trinsdar.ic2c_extras.asm;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.Collections;
import java.util.List;

public class Ic2cExtrasLoadingPlugin implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("mixins.ic2c_extras.json");
    }
}
