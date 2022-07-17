package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class195 {

    LinkedList aLinkedList2082;
    long aLong2083;
    int anInt2084 = 1544629177;
    BigBoyVarpProvider anBigBoyVarpProvider_2085;
    public Class195(Buffer buffer, BigBoyVarpProvider bigBoyVarpProvider) {
        aLinkedList2082 = new LinkedList();
        anBigBoyVarpProvider_2085 = bigBoyVarpProvider;
        aLong2083 = buffer.readLong() * 8721777305723894819L;
        anInt2084 = buffer.readInt() * -1544629177;
        for (int i = buffer.readUByte(); 0 != i; i = buffer.readUByte()) {
            Class188 class188 = CompressionType.findIdentifiable(Class188.values(), i);
            VarpInstrution varpInstrution;
            switch (class188.anInt2053 * 1842393785) {
                case 2:
                    varpInstrution = new Class197(this, buffer);
                    break;
                case 1:
                    varpInstrution = new Class189(this, buffer);
                    break;
                case 3:
                    varpInstrution = new Class180(this, buffer);
                    break;
                case 12:
                    varpInstrution = new Class204(this, buffer);
                    break;
                case 6:
                    varpInstrution = new Class201(this, buffer);
                    break;
                case 10:
                    varpInstrution = new Class181(this, buffer);
                    break;
                case 8:
                    varpInstrution = new Class179(this, buffer);
                    break;
                default:
                    throw new IllegalStateException("");
                case 0:
                    varpInstrution = new Class185(this);
                    break;
                case 9:
                    varpInstrution = new Class184(this, buffer);
                    break;
                case 11:
                    varpInstrution = new Class196(this, buffer);
                    break;
                case 5:
                    varpInstrution = new Class216(this, buffer);
                    break;
                case 7:
                    varpInstrution = new Class183(this, buffer);
                    break;
                case 13:
                    varpInstrution = new Class191(this);
                    break;
                case 4:
                    varpInstrution = new Class199(this, buffer);
            }

            aLinkedList2082.add(varpInstrution);
        }
    }

    static OutgoingFrame createWalkFrame(int type, int sceneX, int sceneZ) {
        OutgoingFrame frame = null;
        if (type == 0) {
            frame = OutgoingFrame.prepare(OutgoingFrameMeta.WALK_VIEWPORT, Client.gameConnection.encryptor);
        } else if (type == 1) {
            frame = OutgoingFrame.prepare(OutgoingFrameMeta.WALK_MINIMAP, Client.gameConnection.encryptor);
        }

        CoordGrid base = Client.scene.getBase();
        frame.payload.writeLEShortA(base.x * 2051316501 + sceneX);
        frame.payload.writeShort(base.y * -180305283 + sceneZ);
        frame.payload.writeByteS(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
        Class63.destinationX = sceneX * -517887053;
        Class63.destinationY = sceneZ * 224109565;
        Class63.aBool955 = false;
        PulseEvent.method16137();
        return frame;
    }

    public void method3852(MappingVarpProvider mappingVarpProvider) {
        if (-5896531547024649915L * mappingVarpProvider.aLong2068 != aLong2083 * 6220525534949282699L
                || mappingVarpProvider.method3766() != 522360183 * anInt2084) {
            throw new IllegalStateException("");
        }
        Iterator iterator = aLinkedList2082.iterator();
        while (iterator.hasNext()) {
            VarpInstrution varpInstrution = (VarpInstrution) iterator.next();
            varpInstrution.execute(mappingVarpProvider);
        }
        mappingVarpProvider.method3767();
    }

}