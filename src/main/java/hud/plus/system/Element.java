package hud.plus.system;

import hud.plus.Main;
import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;

import java.util.function.Supplier;

/**
 * @author SplashAni
 */

public class Element<T extends HudElement> extends HudElement {
    String name;
    String description;
    Supplier<T> supplier;

    public Element(String name, String description, Supplier<T> supplier) {
        super(new HudElementInfo<>(Main.HUD_PLUS, name, description, supplier));

        this.name = name;
        this.description = description;
        this.supplier = supplier;
    }

    public HudElementInfo<T> getInfo() {
        return new HudElementInfo<>(Main.HUD_PLUS, name, description, supplier);
    }

    public Element(String name, Supplier<T> supplier) {
        this(name, "", supplier);
    }
}
