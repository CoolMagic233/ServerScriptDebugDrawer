package me.coolmagic233.serverscriptdebugdrawer;

import cn.nukkit.network.protocol.DataPacket;
import cn.nukkit.network.protocol.ProtocolInfo;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;

import java.util.List;

public class ServerScriptDebugDrawerPacket extends DataPacket {

    public final List<CloudBrustDebugShape> shapes = new ObjectArrayList<>();

    @Override
    public byte pid() {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public int packetId() {
        return 328;
    }

    @Override
    public void decode() {

    }

    @Override
    public void encode() {
        this.reset();
        if (this.protocol > ProtocolInfo.v1_21_90){
            this.putArray(shapes,(shape) -> {
                this.putUnsignedVarLong(shape.getId());
                if (shape.getType() != null){
                    this.putBoolean(true);
                    this.putByte((byte) shape.getType().ordinal());
                }else {
                    this.putBoolean(false);
                }
                if (shape.getPosition() != null){
                    this.putBoolean(true);
                    this.putVector3f(shape.getPosition());
                }else {
                    this.putBoolean(false);
                }
                if (shape.getScale() != null){
                    this.putBoolean(true);
                    this.putLFloat(shape.getScale());
                }else {
                    this.putBoolean(false);
                }
                if (shape.getRotation() != null){
                    this.putBoolean(true);
                    this.putVector3f(shape.getRotation());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getTotalTimeLeft() != null){
                    this.putBoolean(true);
                    this.putLFloat(shape.getTotalTimeLeft());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getColor() != null){
                    this.putBoolean(true);
                    this.putLInt(shape.getColor().getRGB());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getText() != null){
                    this.putBoolean(true);
                    this.putString(shape.getText());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getBoxBounds() != null){
                    this.putBoolean(true);
                    this.putVector3f(shape.getBoxBounds());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getLineEndPosition() != null){
                    this.putBoolean(true);
                    this.putVector3f(shape.getLineEndPosition());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getArrowHeadLength() != null){
                    this.putBoolean(true);
                    this.putLFloat(shape.getArrowHeadLength());
                }else {
                    this.putBoolean(false);
                }

                if (shape.getArrowHeadRadius() != null){
                    this.putBoolean(true);
                    this.putLFloat(shape.getArrowHeadRadius());
                }else {
                    this.putBoolean(false);
                }


                if (shape.getSegments() != null){
                    this.putBoolean(true);
                    this.putByte(shape.getSegments().byteValue());
                }else {
                    this.putBoolean(false);
                }
            });
        }
    }
}
