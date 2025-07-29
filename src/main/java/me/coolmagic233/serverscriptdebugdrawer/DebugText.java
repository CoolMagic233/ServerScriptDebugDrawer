package me.coolmagic233.serverscriptdebugdrawer;

import cn.nukkit.math.Vector3f;
import lombok.Getter;

import java.awt.*;

/**
 * @author daoge_cmd
 */
public class DebugText extends DebugShape {

    /**
     * The text to display.
     */
    @Getter
    protected String text;

    /**
     * Creates a DebugText with the specified position, color, and text.
     *
     * @param position The position of the text in the world.
     * @param color    The color of the text.
     * @param text     The text to display.
     */
    public DebugText(Vector3f position, Color color, String text) {
        super(position, color);
        this.text = text;
    }

    /**
     * Sets the text to display.
     *
     * @param text The text to display.
     */
    public void setText(String text) {
        this.text = text;
        this.onChange();
    }

    @Override
    public CloudBrustDebugShape.Type getType() {
        return CloudBrustDebugShape.Type.TEXT;
    }

    @Override
    public CloudBrustDebugShape toNetworkData() {
        return new CloudBrustDebugShape(
                id, getType(),position, null,
                null, null, color,
                text, null, null,
                null, null, null
        );
    }
}
