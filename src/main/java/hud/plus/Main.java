package hud.plus;

import com.mojang.logging.LogUtils;
import hud.plus.hud.ExampleElement;
import hud.plus.system.Element;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import org.slf4j.Logger;

import java.util.Arrays;

public class Main extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final HudGroup HUD_PLUS = new HudGroup("Hud Plus");

    @Override
    public void onInitialize() {
        LOG.info("Thank you for using hud plus, make sure to star <3");

        register(
            new ExampleElement()
        );

    }

    public void register(Element<?>... elements) {
        Arrays.stream(elements).forEach(element -> Hud.get().register(element.getInfo()));
    }


    @Override
    public String getPackage() {
        return "hud.plus";
    }
}
