package com.jagex;

import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

public class SystemInformation extends Node {
    public static final int anInt10397 = 0;
    static final int anInt10386 = 10;
    static final int anInt10387 = 3;
    static final int anInt10388 = 2;
    static final int anInt10389 = 3;
    static final int anInt10390 = 4;
    static final int anInt10394 = 2;
    static final int anInt10395 = 1;
    static final int anInt10396 = 4;
    static final int anInt10398 = 6;
    static final int anInt10399 = 7;
    static final int anInt10400 = 8;
    static final int anInt10401 = 9;
    static final int anInt10402 = 1;
    static final int anInt10403 = 25;
    static final int anInt10404 = 21;
    static final int anInt10405 = 22;
    static final int anInt10410 = 26;
    static final int anInt10412 = 2;
    static final int anInt10413 = 3;
    static final int anInt10414 = 4;
    static final int anInt10415 = 5;
    static final int anInt10416 = 5;
    static final int anInt10420 = 7;
    static final int anInt10422 = 1;
    static final int anInt10424 = 20;
    static final int anInt10432 = 24;
    static final int anInt10434 = 0;
    static final int anInt10435 = 23;
    public static SystemInformation systemInfo;
    public int processorInfoInt;
    int versionType;
    boolean is64bit;
    boolean unusedBool;
    int vendorType;
    int osType;
    String szDescription;
    int szDriverDateP2;
    int javaMajorVersion;
    int javaMinorVersion;
    int javaPatchVersion;
    int heapSize;
    int processorCount;
    int szDriverDateP1;
    int processorInfoInt2;
    String processorInfoString;
    String unusedString;
    String directXVersion;
    String unusedString2;
    int processorInfoInt4;
    int processorInfoInt3;
    String processorInfoString2;
    int[] processorInfoInts = new int[3];
    int processorInfoInt5;
    String unusedString3;

    public SystemInformation(boolean bool) {
        if (bool) {
            if (Class189.osName.startsWith("win")) {
                osType = 331342887;
            } else if (Class189.osName.startsWith("mac")) {
                osType = 662685774;
            } else if (Class189.osName.startsWith("linux")) {
                osType = 994028661;
            } else {
                osType = 1325371548;
            }

            is64bit = IntRaster.architecture.startsWith("amd64") || IntRaster.architecture.startsWith("x86_64");
            if (-52474985 * osType == 1) {
                if (Class343_Sub2.osVersion.indexOf("4.0") != -1) {
                    versionType = -1041422399;
                } else if (Class343_Sub2.osVersion.indexOf("4.1") != -1) {
                    versionType = -2082844798;
                } else if (Class343_Sub2.osVersion.indexOf("4.9") != -1) {
                    versionType = 1170700099;
                } else if (Class343_Sub2.osVersion.indexOf("5.0") != -1) {
                    versionType = 129277700;
                } else if (Class343_Sub2.osVersion.indexOf("5.1") != -1) {
                    versionType = -912144699;
                } else if (Class343_Sub2.osVersion.indexOf("5.2") != -1) {
                    versionType = 258555400;
                } else if (Class343_Sub2.osVersion.indexOf("6.0") != -1) {
                    versionType = -1953567098;
                } else if (Class343_Sub2.osVersion.indexOf("6.1") != -1) {
                    versionType = 1299977799;
                } else if (Class343_Sub2.osVersion.indexOf("6.2") != -1) {
                    versionType = -782866999;
                } else if (Class343_Sub2.osVersion.indexOf("6.3") != -1) {
                    versionType = -1824289398;
                }
            } else if (2 == osType * -52474985) {
                if (Class343_Sub2.osVersion.indexOf("10.4") != -1) {
                    versionType = 646388500;
                } else if (Class343_Sub2.osVersion.indexOf("10.5") != -1) {
                    versionType = -395033899;
                } else if (Class343_Sub2.osVersion.indexOf("10.6") != -1) {
                    versionType = -1436456298;
                } else if (Class343_Sub2.osVersion.indexOf("10.7") != -1) {
                    versionType = 1817088599;
                } else if (Class343_Sub2.osVersion.indexOf("10.8") != -1) {
                    versionType = 775666200;
                } else if (Class343_Sub2.osVersion.indexOf("10.9") != -1) {
                    versionType = -265756199;
                } else if (Class343_Sub2.osVersion.indexOf("10.10") != -1) {
                    versionType = -1307178598;
                }
            }

            if (TextureMetricsList.javaVendor.toLowerCase().indexOf("sun") != -1) {
                vendorType = -2032507911;
            } else if (TextureMetricsList.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
                vendorType = 229951474;
            } else if (TextureMetricsList.javaVendor.toLowerCase().indexOf("apple") != -1) {
                vendorType = -1802556437;
            } else if (TextureMetricsList.javaVendor.toLowerCase().indexOf("oracle") != -1) {
                vendorType = -1572604963;
            } else {
                vendorType = 459902948;
            }

            int packed = 0;
            try {
                for (int index = 2; index < LatencyMonitor.javaVersion.length(); index++) {
                    char character = LatencyMonitor.javaVersion.charAt(index);
                    if (character < 48 || character > 57) {
                        break;
                    }

                    packed = 10 * packed + character - 48;
                }
            } catch (Exception exception) {

            }

            javaMajorVersion = packed * 2137411585;
            packed = 0;

            try {
                for (int index = LatencyMonitor.javaVersion.indexOf('.', 2) + 1; index < LatencyMonitor.javaVersion
                        .length(); index++) {
                    char character = LatencyMonitor.javaVersion.charAt(index);
                    if (character < 48 || character > 57) {
                        break;
                    }

                    packed = 10 * packed + character - 48;
                }
            } catch (Exception exception) {

            }

            javaMinorVersion = packed * -727910181;
            packed = 0;

            try {
                for (int index = LatencyMonitor.javaVersion.indexOf('_', 4) + 1; index < LatencyMonitor.javaVersion
                        .length(); index++) {
                    char character = LatencyMonitor.javaVersion.charAt(index);
                    if (character < 48 || character > 57) {
                        break;
                    }
                    packed = 10 * packed + character - 48;
                }
            } catch (Exception exception) {

            }

            javaPatchVersion = 1186182985 * packed;
            unusedBool = false;
            heapSize = Engine.heapSize * 108230103;

            if (1503244289 * javaMajorVersion > 3) {
                processorCount = Engine.processorCount * -2099484633;
            } else {
                processorCount = 0;
            }

            try {
                int[] info = HardwareInfo.getCPUInfo();
                if (null != info && info.length == 3) {
                    processorInfoInt3 = info[0] * 1899334599;
                    processorInfoInt2 = info[1] * -707023713;
                    processorInfoInt = info[2] * 696568413;
                }

                int[] raw = HardwareInfo.getRawCPUInfo();
                if (raw != null && raw.length % 5 == 0) {
                    HashMap<Integer, ProcessorInformation> hashmap = new HashMap<Integer, ProcessorInformation>();
                    for (int index = 0; index < raw.length / 5; index++) {
                        int i_8_ = raw[5 * index];
                        int i_9_ = raw[1 + index * 5];
                        int i_10_ = raw[5 * index + 2];
                        int i_11_ = raw[3 + index * 5];
                        int i_12_ = raw[4 + 5 * index];

                        ProcessorInformation class665 = new ProcessorInformation(i_8_, i_9_, i_10_, i_11_, i_12_);
                        hashmap.put(Integer.valueOf(i_8_), class665);
                    }

                    ProcessorInformation class665 = hashmap.get(0);
                    if (class665 != null) {
                        Buffer buffer = new Buffer(13);
                        buffer.writeLEInt(class665.anInt8395 * 1482992217);
                        buffer.writeLEInt(309196585 * class665.anInt8393);
                        buffer.writeLEInt(class665.anInt8397 * -569581273);
                        buffer.caret = 0;
                        processorInfoString = buffer.readString();
                    }

                    ProcessorInformation processorInformation = hashmap.get(1);
                    if (processorInformation != null) {
                        processorInfoInt5 = processorInformation.anInt8394 * 823007235;
                        int i_14_ = 1482992217 * processorInformation.anInt8395;
                        processorInfoInt4 = (i_14_ >> 16 & 0xff) * 2126702771;
                        processorInfoInts[0] = processorInformation.anInt8397 * -569581273;
                        processorInfoInts[1] = processorInformation.anInt8393 * 309196585;
                    }

                    ProcessorInformation class665_15_ = hashmap.get(-2147483647);
                    if (class665_15_ != null) {
                        processorInfoInts[2] = class665_15_.anInt8393 * 309196585;
                    }

                    Buffer buffer = new Buffer(49);
                    for (int i_16_ = -2147483646; i_16_ <= -2147483644; i_16_++) {
                        ProcessorInformation class665_17_ = hashmap.get(i_16_);
                        if (class665_17_ != null) {
                            buffer.writeLEInt(class665_17_.anInt8394 * 1143072555);
                            buffer.writeLEInt(class665_17_.anInt8395 * 1482992217);
                            buffer.writeLEInt(-569581273 * class665_17_.anInt8397);
                            buffer.writeLEInt(309196585 * class665_17_.anInt8393);
                        }
                    }

                    buffer.caret = 0;
                    processorInfoString2 = buffer.readString();
                }

                String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
                if (strings != null && strings.length > 0 && null != strings[0]) {
                    for (int index = 0; index < strings[0].length; index += 2) {
                        if (strings[0][index].equalsIgnoreCase("szDescription")) {
                            szDescription = strings[0][1 + index];
                        } else if (strings[0][index].equalsIgnoreCase("szDriverDateEnglish")) {
                            String string = strings[0][1 + index];

                            try {
                                int i_19_ = string.indexOf("/");
                                int i_20_ = string.indexOf("/", i_19_ + 1);
                                szDriverDateP1 = Integer.parseInt(string.substring(0, i_19_)) * -1722728897;
                                szDriverDateP2 = Integer.parseInt(string.substring(i_20_ + 1, string.indexOf(" ", i_20_))) * 537009579;
                            } catch (Exception exception) {

                            }
                        }
                    }
                }

                String[] props = HardwareInfo.getDXDiagSystemProps();
                if (props != null) {
                    String majorVersion = "";
                    String minorVersion = "";
                    String letterVersion = "";

                    for (int index = 0; index < props.length; index += 2) {
                        if (props[index].equalsIgnoreCase("dwDirectXVersionMajor")) {
                            majorVersion = props[1 + index];
                        } else if (props[index].equalsIgnoreCase("dwDirectXVersionMinor")) {
                            minorVersion = props[1 + index];
                        } else if (props[index].equalsIgnoreCase("dwDirectXVersionLetter")) {
                            letterVersion = props[index + 1];
                        }
                    }

                    directXVersion = new StringBuilder().append(majorVersion).append(".").append(minorVersion)
                            .append(letterVersion).toString();
                }

            } catch (Throwable throwable) {
                processorInfoInt = 0;
            }
        }

        if (null == szDescription) {
            szDescription = "";
        }

        if (null == unusedString) {
            unusedString = "";
        }

        if (directXVersion == null) {
            directXVersion = "";
        }

        if (unusedString2 == null) {
            unusedString2 = "";
        }

        if (null == processorInfoString) {
            processorInfoString = "";
        }

        if (processorInfoString2 == null) {
            processorInfoString2 = "";
        }

        if (null == unusedString3) {
            unusedString3 = "";
        }

        method16357();
    }

    public int getEncodedSize() {
        int size = 38;
        size += TimeZoneUtils.method4000(szDescription);
        size += TimeZoneUtils.method4000(unusedString);
        size += TimeZoneUtils.method4000(directXVersion);
        size += TimeZoneUtils.method4000(unusedString2);
        size += TimeZoneUtils.method4000(processorInfoString);
        size += TimeZoneUtils.method4000(processorInfoString2);
        size += TimeZoneUtils.method4000(unusedString3);
        return size;
    }

    public void encode(Buffer buffer) {
        buffer.writeByte(7);
        buffer.writeByte(osType * -52474985);
        buffer.writeByte(is64bit ? 1 : 0);
        buffer.writeByte(versionType * 1464002625);
        buffer.writeByte(vendorType * 990441033);
        buffer.writeByte(javaMajorVersion * 1503244289);
        buffer.writeByte(javaMinorVersion * 537805651);
        buffer.writeByte(javaPatchVersion * 1448798969);
        buffer.writeByte(unusedBool ? 1 : 0);
        buffer.writeShort(heapSize * -693791267);
        buffer.writeByte(processorCount * 30815921);
        buffer.writeTriByte(processorInfoInt * -2033165835);
        buffer.writeShort(processorInfoInt2 * 924741471);
        buffer.writeString(szDescription);
        buffer.writeString(unusedString);
        buffer.writeString(directXVersion);
        buffer.writeString(unusedString2);
        buffer.writeByte(szDriverDateP1 * 1533522367);
        buffer.writeShort(szDriverDateP2 * 1707078915);
        buffer.writeString(processorInfoString);
        buffer.writeString(processorInfoString2);
        buffer.writeByte(processorInfoInt3 * 218809847);
        buffer.writeByte(processorInfoInt4 * 880936571);

        for (int i : processorInfoInts) {
            buffer.writeInt(i);
        }

        buffer.writeInt(processorInfoInt5 * 1311649721);
        buffer.writeString(unusedString3);
    }

    void method16357() {
        if (szDescription.length() > 40) {
            szDescription = szDescription.substring(0, 40);
        }

        if (unusedString.length() > 40) {
            unusedString = unusedString.substring(0, 40);
        }

        if (directXVersion.length() > 10) {
            directXVersion = directXVersion.substring(0, 10);
        }

        if (unusedString2.length() > 10) {
            unusedString2 = unusedString2.substring(0, 10);
        }

        if (unusedString3.length() > 120) {
            unusedString3 = unusedString3.substring(0, 120);
        }
    }

}