package me.coolmagic233.serverscriptdebugdrawer;

import cn.nukkit.math.Vector3f;
import lombok.Value;

import javax.annotation.Nullable;
import java.awt.*;

@Value
public class CloudBrustDebugShape {

    long id;
    @Nullable
    Type type;
    @Nullable
    Vector3f position;
    @Nullable
    Float scale;
    @Nullable
    Vector3f rotation;
    @Nullable
    Float totalTimeLeft;
    @Nullable
    Color color;
    @Nullable
    String text;
    @Nullable
    Vector3f boxBounds;
    @Nullable
    Vector3f lineEndPosition;
    @Nullable
    Float arrowHeadLength;
    @Nullable
    Float arrowHeadRadius;
    @Nullable
    Integer segments;

    public enum Type {
        LINE,
        BOX,
        SPHERE,
        CIRCLE,
        TEXT,
        ARROW
    }
}