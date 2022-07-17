package com.jagex;

import java.awt.*;

public class KeyType implements Identifiable {
    public static KeyType P_LOWER;
    public static KeyType ONE;
    public static KeyType aClass422_4719;
    public static KeyType I_LOWER = new KeyType(0, 'i', ValueType.INTEGER, Integer.valueOf(0));
    public static KeyType S_LOWER;
    static KeyType M_LOWER;
    static KeyType TWO;
    static KeyType aClass422_4664;
    static KeyType PERCENT;
    static KeyType aClass422_4666;
    static KeyType SEVEN;
    static KeyType aClass422_4668;
    static KeyType H;
    static KeyType I;
    static KeyType K;
    static KeyType aClass422_4672;
    static KeyType N;
    static KeyType O;
    static KeyType P;
    static KeyType Q;
    static KeyType aClass422_4677;
    static KeyType V_LOWER;
    static KeyType T;
    static KeyType V;
    static KeyType R;
    static KeyType aClass422_4682;
    static KeyType C_LOWER;
    static KeyType D_LOWER;
    static KeyType aClass422_4685;
    static KeyType F_LOWER;
    static KeyType G_LOWER;
    static KeyType H_LOWER;
    static KeyType A;
    static KeyType K_LOWER;
    static KeyType L_LOWER;
    static KeyType aClass422_4692;
    static KeyType N_LOWER;
    static KeyType aClass422_4694;
    static KeyType SEMICOLON;
    static KeyType aClass422_4697;
    static KeyType T_LOWER;
    static KeyType U_LOWER;
    static KeyType QUESTION;
    static KeyType X_LOWER;
    static KeyType Z_LOWER;
    static KeyType PIPE;
    static KeyType aClass422_4705;
    static KeyType aClass422_4706;
    static KeyType aClass422_4707;
    static KeyType EXCLAMATION;
    static KeyType aClass422_4709;
    static KeyType aClass422_4710;
    static KeyType aClass422_4711;
    static KeyType aClass422_4712;
    static KeyType aClass422_4713;
    static KeyType aClass422_4714;
    static KeyType aClass422_4715;
    static KeyType aClass422_4716;
    static KeyType aClass422_4717;
    static KeyType aClass422_4718;
    static KeyType CARET;
    static KeyType aClass422_4721;
    static KeyType aClass422_4722;
    static KeyType aClass422_4723;
    static KeyType aClass422_4724;
    static KeyType GRAVE_ACCENT;
    static KeyType aClass422_4726;
    static KeyType aClass422_4727;
    static KeyType aClass422_4728;
    static KeyType aClass422_4729;
    static KeyType J_LOWER;
    static KeyType C;
    static KeyType aClass422_4732;
    static KeyType aClass422_4733;
    static KeyType aClass422_4734;
    static KeyType aClass422_4735;
    static KeyType aClass422_4736;
    static KeyType aClass422_4737;
    static KeyType aClass422_4738;
    static KeyType aClass422_4739;
    static KeyType aClass422_4740;
    static KeyType Q_LOWER;
    static KeyType B;
    static KeyType aClass422_4743;
    static KeyType aClass422_4744;
    static KeyType ZERO;
    static KeyType aClass422_4746;
    static KeyType aClass422_4747;
    static KeyType aClass422_4748;
    static KeyType aClass422_4749;
    static KeyType U;
    static KeyType E_LOWER;
    static KeyType aClass422_4752;
    static KeyType aClass422_4753;
    static KeyType aClass422_4754;
    static KeyType aClass422_4755;
    static KeyType aClass422_4756;
    static KeyType F;
    static KeyType L;
    static KeyType AT_SIGN;
    static KeyType aClass422_4760;
    static KeyType aClass422_4761;
    static KeyType aClass422_4762;
    static KeyType COLON;
    static KeyType aClass422_4764;
    static KeyType aClass422_4765;
    static KeyType aClass422_4766;
    static KeyType aClass422_4767;
    static KeyType aClass422_4769;
    static KeyType aClass422_4771;
    static KeyType aClass422_4772;
    static KeyType aClass422_4773;
    static KeyType aClass422_4774;
    static KeyType aClass422_4775;
    static KeyType aClass422_4776;
    static KeyType Y_LOWER;
    static KeyType aClass422_4778;
    static KeyType aClass422_4779;
    static KeyType S;
    static KeyType aClass422_4781;
    static KeyType aClass422_4782;
    static KeyType aClass422_4783;
    static KeyType aClass422_4784;
    static KeyType X;
    static KeyType W;
    static KeyType B_LOWER;
    static KeyType R_LOWER;
    static KeyType FOUR;
    static KeyType W_LOWER;
    static KeyType aClass422_4791;
    static KeyType aClass422_4792;
    static KeyType SIX;
    static KeyType OCTOTHORPE;
    static KeyType LEFT_PARENTHESIS;
    static KeyType aClass422_4796;
    static KeyType AMPERSAND;
    static KeyType RIGHT_PARENTHESIS;
    static KeyType THREE;
    static KeyType aClass422_4800;
    static KeyType aClass422_4801;
    static KeyType EIGHT;
    static KeyType NINE;
    static KeyType FIVE;
    static KeyType A_LOWER;
    static KeyType aClass422_4806;
    static KeyType aClass422_4807;
    static KeyType aClass422_4808;
    static KeyType TILDE;
    static KeyType aClass422_4810;
    static KeyType aClass422_4811;
    static KeyType aClass422_4812;
    static KeyType M;
    static KeyType aClass422_4814;
    static KeyType aClass422_4815;
    static KeyType aClass422_4816;
    static KeyType aClass422_4817;
    static KeyType aClass422_4818;
    static KeyType E;
    static KeyType Y;
    static KeyType G;
    static KeyType aClass422_4822;
    static KeyType aClass422_4823;
    static KeyType aClass422_4824;
    static KeyType aClass422_4825;
    static KeyType D;
    static KeyType aClass422_4827;
    static KeyType aClass422_4828;
    static KeyType aClass422_4829;
    static KeyType aClass422_4830;
    static KeyType O_LOWER;
    static KeyType aClass422_4832;
    static KeyType aClass422_4833;
    static KeyType aClass422_4834;
    static KeyType aClass422_4835;
    static KeyType aClass422_4836;
    static KeyType aClass422_4837;
    static KeyType DOLLAR;
    static KeyType Z;
    static KeyType aClass422_4840;
    static KeyType ASTERISK;
    static KeyType aClass422_4845;
    static KeyType[] values;

    static {
        ONE = new KeyType(1, '1', ValueType.INTEGER, Integer.valueOf(0));
        TWO = new KeyType(2, '2', ValueType.INTEGER, -1);
        COLON = new KeyType(3, ':', ValueType.INTEGER, -1);
        SEMICOLON = new KeyType(4, ';', ValueType.INTEGER, -1);
        AT_SIGN = new KeyType(5, '@', ValueType.INTEGER, -1);
        A = new KeyType(6, 'A', ValueType.INTEGER, -1);
        C = new KeyType(7, 'C', ValueType.INTEGER, -1);
        H = new KeyType(8, 'H', ValueType.INTEGER, -1);
        I = new KeyType(9, 'I', ValueType.INTEGER, -1);
        K = new KeyType(10, 'K', ValueType.INTEGER, -1);
        M = new KeyType(11, 'M', ValueType.INTEGER, -1);
        N = new KeyType(12, 'N', ValueType.INTEGER, -1);
        O = new KeyType(13, 'O', ValueType.INTEGER, -1);
        P = new KeyType(14, 'P', ValueType.INTEGER, -1);
        Q = new KeyType(15, 'Q', ValueType.INTEGER, -1);
        R = new KeyType(16, 'R', ValueType.INTEGER, -1);
        S = new KeyType(17, 'S', ValueType.INTEGER, -1);
        T = new KeyType(18, 'T', ValueType.INTEGER, -1);
        V = new KeyType(19, 'V', ValueType.INTEGER, -1);
        CARET = new KeyType(20, '^', ValueType.INTEGER, -1);
        GRAVE_ACCENT = new KeyType(21, '`', ValueType.INTEGER, -1, "");
        C_LOWER = new KeyType(22, 'c', ValueType.INTEGER, -1, "");
        D_LOWER = new KeyType(23, 'd', ValueType.INTEGER, -1);
        E_LOWER = new KeyType(24, 'e', ValueType.INTEGER, -1);
        F_LOWER = new KeyType(25, 'f', ValueType.INTEGER, -1);
        G_LOWER = new KeyType(26, 'g', ValueType.INTEGER, -1);
        H_LOWER = new KeyType(27, 'h', ValueType.INTEGER, -1);
        J_LOWER = new KeyType(28, 'j', ValueType.INTEGER, -1);
        K_LOWER = new KeyType(29, 'k', ValueType.INTEGER, -1);
        L_LOWER = new KeyType(30, 'l', ValueType.INTEGER, -1);
        M_LOWER = new KeyType(31, 'm', ValueType.INTEGER, -1);
        N_LOWER = new KeyType(32, 'n', ValueType.INTEGER, -1);
        O_LOWER = new KeyType(33, 'o', ValueType.INTEGER, -1, "");
        P_LOWER = new KeyType(34, 'p', ValueType.INTEGER, -1);
        R_LOWER = new KeyType(35, 'r', ValueType.LONG, -1L);
        S_LOWER = new KeyType(36, 's', ValueType.STRING, "");
        T_LOWER = new KeyType(37, 't', ValueType.INTEGER, -1);
        U_LOWER = new KeyType(38, 'u', ValueType.INTEGER, -1);
        V_LOWER = new KeyType(39, 'v', ValueType.INTEGER, -1);
        X_LOWER = new KeyType(40, 'x', ValueType.INTEGER, -1);
        Y_LOWER = new KeyType(41, 'y', ValueType.INTEGER, -1);
        Z_LOWER = new KeyType(42, 'z', ValueType.INTEGER, -1);
        PIPE = new KeyType(43, '|', ValueType.INTEGER, -1);
        aClass422_4705 = new KeyType(44, '\u20ac', ValueType.INTEGER, -1);
        aClass422_4706 = new KeyType(45, '\u0192', ValueType.INTEGER, -1);
        aClass422_4764 = new KeyType(46, '\u2021', ValueType.INTEGER, -1);
        aClass422_4697 = new KeyType(47, '\u2030', ValueType.INTEGER, -1);
        aClass422_4709 = new KeyType(48, '\u0160', ValueType.INTEGER, -1);
        aClass422_4710 = new KeyType(49, '\u0152', ValueType.LONG, -1L);
        aClass422_4711 = new KeyType(50, '\u017d', ValueType.aClass423_4850, new Vector4i());
        aClass422_4712 = new KeyType(51, '\u0161', ValueType.INTEGER, -1);
        aClass422_4713 = new KeyType(53, '\u00a1', ValueType.INTEGER, -1);
        aClass422_4714 = new KeyType(54, '\u00a2', ValueType.INTEGER, -1);
        aClass422_4743 = new KeyType(55, '\u00a3', ValueType.INTEGER, -1, "");
        aClass422_4716 = new KeyType(56, '\u00a7', ValueType.LONG, -1L);
        aClass422_4717 = new KeyType(57, '\u00ab', ValueType.INTEGER, -1);
        aClass422_4724 = new KeyType(58, '\u00ae', ValueType.INTEGER, -1, "");
        aClass422_4719 = new KeyType(59, '\u00b5', ValueType.INTEGER, -1);
        aClass422_4666 = new KeyType(60, '\u00b6', ValueType.INTEGER, -1);
        aClass422_4721 = new KeyType(61, '\u00c6', ValueType.INTEGER, -1, "");
        aClass422_4722 = new KeyType(62, '\u00d7', ValueType.INTEGER, -1);
        aClass422_4723 = new KeyType(63, '\u00de', ValueType.INTEGER, -1);
        aClass422_4776 = new KeyType(64, '\u00e1', ValueType.INTEGER, -1, "");
        aClass422_4685 = new KeyType(65, '\u00e6', ValueType.INTEGER, -1);
        aClass422_4796 = new KeyType(66, '\u00e9', ValueType.INTEGER, -1, "");
        aClass422_4771 = new KeyType(67, '\u00ed', ValueType.INTEGER, -1, "");
        aClass422_4728 = new KeyType(68, '\u00ee', ValueType.INTEGER, -1);
        aClass422_4729 = new KeyType(69, '\u00f3', ValueType.INTEGER, -1);
        aClass422_4837 = new KeyType(70, '\u00fa', ValueType.INTEGER, -1);
        aClass422_4806 = new KeyType(71, '\u00fb', ValueType.LONG, -1L);
        aClass422_4732 = new KeyType(72, '\u00ce', ValueType.INTEGER, -1);
        aClass422_4733 = new KeyType(73, 'J', ValueType.INTEGER, -1);
        aClass422_4715 = new KeyType(74, '\u00d0', ValueType.INTEGER, -1);
        aClass422_4735 = new KeyType(75, '\u00a4', ValueType.INTEGER, -1);
        aClass422_4736 = new KeyType(76, '\u00a5', ValueType.INTEGER, -1);
        aClass422_4737 = new KeyType(77, '\u00e8', ValueType.INTEGER, -1);
        aClass422_4738 = new KeyType(78, '\u00b9', ValueType.INTEGER, -1);
        aClass422_4739 = new KeyType(79, '\u00b0', ValueType.INTEGER, -1);
        aClass422_4740 = new KeyType(80, '\u00ec', ValueType.INTEGER, -1, "");
        aClass422_4754 = new KeyType(81, '\u00eb', ValueType.INTEGER, -1);
        aClass422_4694 = new KeyType(83, '\u00fe', ValueType.INTEGER, -1);
        aClass422_4718 = new KeyType(84, '\u00fd', ValueType.INTEGER, -1);
        aClass422_4744 = new KeyType(85, '\u00ff', ValueType.INTEGER, -1);
        aClass422_4756 = new KeyType(86, '\u00f5', ValueType.INTEGER, -1);
        aClass422_4746 = new KeyType(87, '\u00f4', ValueType.INTEGER, -1);
        aClass422_4747 = new KeyType(88, '\u00f6', ValueType.INTEGER, -1);
        aClass422_4748 = new KeyType(89, '\u00f2', ValueType.INTEGER, -1, "");
        aClass422_4749 = new KeyType(90, '\u00dc', ValueType.INTEGER, -1);
        aClass422_4833 = new KeyType(91, '\u00f9', ValueType.INTEGER, -1);
        aClass422_4825 = new KeyType(92, '\u00ef', ValueType.INTEGER, -1);
        aClass422_4752 = new KeyType(93, '\u00af', ValueType.INTEGER, -1);
        aClass422_4753 = new KeyType(94, '\u00ea', ValueType.INTEGER, -1, "");
        aClass422_4677 = new KeyType(95, '\u00f0', ValueType.INTEGER, -1, "");
        aClass422_4672 = new KeyType(96, '\u00e5', ValueType.INTEGER, -1, "");
        A_LOWER = new KeyType(97, 'a', ValueType.INTEGER, -1);
        F = new KeyType(98, 'F', ValueType.INTEGER, -1);
        L = new KeyType(99, 'L', ValueType.INTEGER, -1);
        aClass422_4792 = new KeyType(100, '\u00a9', ValueType.INTEGER, -1);
        aClass422_4760 = new KeyType(101, '\u00dd', ValueType.INTEGER, -1);
        aClass422_4761 = new KeyType(102, '\u00ac', ValueType.INTEGER, -1);
        aClass422_4762 = new KeyType(103, '\u00f8', ValueType.INTEGER, -1);
        aClass422_4668 = new KeyType(104, '\u00e4', ValueType.INTEGER, -1, "");
        aClass422_4707 = new KeyType(105, '\u00e3', ValueType.INTEGER, -1, "");
        aClass422_4765 = new KeyType(106, '\u00e2', ValueType.INTEGER, -1, "");
        aClass422_4766 = new KeyType(107, '\u00e0', ValueType.INTEGER, -1, "");
        aClass422_4767 = new KeyType(108, '\u00c0', ValueType.INTEGER, -1);
        aClass422_4755 = new KeyType(109, '\u00d2', ValueType.INTEGER, -1, "");
        aClass422_4769 = new KeyType(110, '\u00cf', ValueType.LONG, Long.valueOf(0L));
        aClass422_4800 = new KeyType(111, '\u00cc', ValueType.INTEGER, -1);
        aClass422_4808 = new KeyType(112, '\u00c9', ValueType.INTEGER, -1);
        aClass422_4692 = new KeyType(113, '\u00ca', ValueType.INTEGER, -1, "");
        aClass422_4773 = new KeyType(114, '\u00f7', ValueType.INTEGER, -1);
        aClass422_4774 = new KeyType(115, '\u00bc', ValueType.LONG, -1L);
        aClass422_4775 = new KeyType(116, '\u00bd', ValueType.LONG, -1L);
        aClass422_4772 = new KeyType(117, '\u2022', ValueType.INTEGER, -1);
        aClass422_4801 = new KeyType(118, '\u00c2', ValueType.LONG, -1L);
        aClass422_4778 = new KeyType(119, '\u00c3', ValueType.INTEGER, -1);
        aClass422_4779 = new KeyType(120, '\u00c5', ValueType.INTEGER, -1);
        aClass422_4734 = new KeyType(121, '\u00cb', ValueType.INTEGER, -1);
        aClass422_4781 = new KeyType(122, '\u00cd', ValueType.INTEGER, -1);
        aClass422_4782 = new KeyType(123, '\u00d5', ValueType.INTEGER, -1);
        aClass422_4783 = new KeyType(124, '\u00b2', ValueType.INTEGER, -1);
        aClass422_4784 = new KeyType(125, '\u00aa', ValueType.INTEGER, -1);
        X = new KeyType(200, 'X', ValueType.INTEGER, -1);
        W = new KeyType(201, 'W', ValueType.INTEGER, -1);
        B_LOWER = new KeyType(202, 'b', ValueType.INTEGER, -1);
        B = new KeyType(203, 'B', ValueType.INTEGER, -1);
        FOUR = new KeyType(204, '4', ValueType.INTEGER, -1);
        W_LOWER = new KeyType(205, 'w', ValueType.INTEGER, -1);
        Q_LOWER = new KeyType(206, 'q', ValueType.INTEGER, -1);
        ZERO = new KeyType(207, '0', ValueType.INTEGER, -1);
        SIX = new KeyType(208, '6', ValueType.INTEGER, -1);
        OCTOTHORPE = new KeyType(ValueType.INTEGER, -1, '#');
        LEFT_PARENTHESIS = new KeyType(ValueType.INTEGER, -1, '(');
        PERCENT = new KeyType(ValueType.INTEGER, -1, '%');
        AMPERSAND = new KeyType(ValueType.INTEGER, -1, '&');
        RIGHT_PARENTHESIS = new KeyType(ValueType.INTEGER, -1, ')');
        THREE = new KeyType(ValueType.INTEGER, -1, '3');
        FIVE = new KeyType(ValueType.INTEGER, -1, '5');
        SEVEN = new KeyType(ValueType.INTEGER, -1, '7');
        EIGHT = new KeyType(ValueType.INTEGER, -1, '8');
        NINE = new KeyType(ValueType.INTEGER, -1, '9');
        D = new KeyType(ValueType.INTEGER, -1, 'D');
        G = new KeyType(ValueType.INTEGER, -1, 'G');
        U = new KeyType(ValueType.INTEGER, -1, 'U');
        aClass422_4807 = new KeyType(ValueType.INTEGER, -1, '\u00c1');
        Z = new KeyType(ValueType.INTEGER, -1, 'Z');
        TILDE = new KeyType(ValueType.INTEGER, -1, '~');
        aClass422_4810 = new KeyType(ValueType.INTEGER, -1, '\u00b1');
        aClass422_4811 = new KeyType(ValueType.INTEGER, -1, '\u00bb');
        aClass422_4812 = new KeyType(ValueType.INTEGER, -1, '\u00bf');
        aClass422_4664 = new KeyType(ValueType.INTEGER, -1, '\u00c7');
        aClass422_4814 = new KeyType(ValueType.INTEGER, -1, '\u00d8');
        aClass422_4815 = new KeyType(ValueType.INTEGER, -1, '\u00d1');
        aClass422_4816 = new KeyType(ValueType.INTEGER, -1, '\u00f1');
        aClass422_4817 = new KeyType(ValueType.INTEGER, -1, '\u00d9');
        aClass422_4818 = new KeyType(ValueType.INTEGER, -1, '\u00df');
        E = new KeyType(ValueType.INTEGER, -1, 'E');
        Y = new KeyType(ValueType.INTEGER, -1, 'Y');
        aClass422_4682 = new KeyType(ValueType.INTEGER, -1, '\u00c4');
        aClass422_4822 = new KeyType(ValueType.INTEGER, -1, '\u00fc');
        aClass422_4726 = new KeyType(ValueType.INTEGER, -1, '\u00da');
        aClass422_4824 = new KeyType(ValueType.INTEGER, -1, '\u00db');
        aClass422_4823 = new KeyType(ValueType.INTEGER, -1, '\u00d3');
        aClass422_4845 = new KeyType(ValueType.INTEGER, -1, '\u00c8');
        aClass422_4827 = new KeyType(ValueType.INTEGER, -1, '\u00d4');
        aClass422_4828 = new KeyType(ValueType.INTEGER, -1, '\u00be');
        aClass422_4829 = new KeyType(ValueType.INTEGER, -1, '\u00d6');
        aClass422_4830 = new KeyType(ValueType.INTEGER, -1, '\u00b3');
        aClass422_4791 = new KeyType(ValueType.INTEGER, -1, '\u00b7');
        aClass422_4832 = new KeyType(ValueType.INTEGER, -1, '\0');
        aClass422_4727 = new KeyType(ValueType.INTEGER, -1, '\0');
        aClass422_4834 = new KeyType(ValueType.INTEGER, -1, '\0');
        aClass422_4835 = new KeyType(ValueType.INTEGER, -1, '\u00ba');
        aClass422_4836 = new KeyType(ValueType.INTEGER, -1, '\0');
        EXCLAMATION = new KeyType(null, -1, '!');
        DOLLAR = new KeyType(null, -1, '$');
        QUESTION = new KeyType(null, -1, '?');
        aClass422_4840 = new KeyType(null, -1, '\u00e7');
        ASTERISK = new KeyType(null, -1, '*');
    }

    public ValueType valueType;
    Object anObject4661;
    int id;
    char character;

    KeyType(ValueType type, Object object, char character) {
        this(-1, character, type, object);
    }

    KeyType(int id, char character, ValueType type, Object object) {
        this(id, character, type, object, null);
    }

    KeyType(int id, char character, ValueType type, Object object, String string) {
        this.id = id * 1498915727;
        this.character = character;
        valueType = type;
        anObject4661 = object;

        if (null != string && string.length() <= 0) {

        }

        append(this);
    }

    public static KeyType valueOf(char c) {
        if (c == 'O') {
            return O_LOWER;
        }

        return values[Class483.charToByte(c) & 0xff];
    }

    public static KeyType[] values() {
        return new KeyType[]{aClass422_4776, B, aClass422_4668, GRAVE_ACCENT, PIPE, aClass422_4666,
                aClass422_4733, D, L, FOUR, aClass422_4706, V, aClass422_4738, N_LOWER, FIVE, aClass422_4814, SEVEN,
                aClass422_4721, aClass422_4811, Z_LOWER, aClass422_4836, aClass422_4833, aClass422_4828,
                aClass422_4719, aClass422_4760, Y_LOWER, aClass422_4825, aClass422_4775, SEMICOLON, QUESTION,
                aClass422_4705, aClass422_4810, aClass422_4677, aClass422_4714, aClass422_4761, LEFT_PARENTHESIS,
                aClass422_4735, X, aClass422_4710, aClass422_4840, aClass422_4835, M_LOWER, aClass422_4815,
                aClass422_4726, S_LOWER, AMPERSAND, W_LOWER, aClass422_4682, T, R, aClass422_4791, aClass422_4748,
                T_LOWER, aClass422_4723, P_LOWER, aClass422_4806, aClass422_4740, V_LOWER, aClass422_4697, ASTERISK, W,
                I, Q_LOWER, aClass422_4817, aClass422_4713, G, aClass422_4694, aClass422_4724, D_LOWER, aClass422_4832,
                aClass422_4834, aClass422_4707, Z, OCTOTHORPE, aClass422_4762, aClass422_4737, aClass422_4783, M,
                aClass422_4692, THREE, aClass422_4830, H, C, SIX, I_LOWER, aClass422_4823, H_LOWER, aClass422_4729,
                aClass422_4782, aClass422_4772, aClass422_4818, R_LOWER, aClass422_4767, aClass422_4755, K, F,
                aClass422_4829, aClass422_4837, aClass422_4753, E, aClass422_4752, O, O_LOWER, aClass422_4747,
                aClass422_4779, aClass422_4736, aClass422_4716, S, aClass422_4773, K_LOWER, aClass422_4744,
                aClass422_4685, aClass422_4816, TWO, CARET, aClass422_4722, aClass422_4749, A, F_LOWER, U,
                aClass422_4827, aClass422_4739, aClass422_4715, aClass422_4796, aClass422_4664, B_LOWER,
                aClass422_4771, Q, COLON, TILDE, G_LOWER, aClass422_4712, E_LOWER, ZERO, aClass422_4774,
                aClass422_4807, L_LOWER, aClass422_4709, aClass422_4711, aClass422_4672, EIGHT, aClass422_4765,
                aClass422_4792, aClass422_4824, aClass422_4845, EXCLAMATION, Y, RIGHT_PARENTHESIS, AT_SIGN,
                aClass422_4812, A_LOWER, C_LOWER, aClass422_4766, aClass422_4764, aClass422_4754, ONE, U_LOWER, NINE,
                aClass422_4717, PERCENT, aClass422_4778, aClass422_4769, P, aClass422_4800, aClass422_4756,
                aClass422_4801, N, X_LOWER, aClass422_4743, aClass422_4781, aClass422_4732, J_LOWER, aClass422_4728,
                aClass422_4746, DOLLAR, aClass422_4734, aClass422_4808, aClass422_4727, aClass422_4718, aClass422_4784,
                aClass422_4822};
    }

    public static void method7028(int i) {
        HuffmanCodec.method4342(new Class531(i));
    }

    public static void method7032(FullScreenAdapter class647, Frame frame, int i) {
        class647.disable(); // TODO
        frame.setVisible(false);
        frame.dispose();
    }

    public static String method7033(byte[] is, int i, int i_8_, int i_9_) {
        char[] cs = new char[i_8_];
        int i_10_ = 0;
        int i_11_ = i;
        int i_12_ = i + i_8_;
        while (i_11_ < i_12_) {
            int i_13_ = is[i_11_++] & 0xff;
            int i_14_;
            if (i_13_ < 128) {
                if (i_13_ == 0) {
                    i_14_ = 65533;
                } else {
                    i_14_ = i_13_;
                }
            } else if (i_13_ < 192) {
                i_14_ = 65533;
            } else if (i_13_ < 224) {
                if (i_11_ < i_12_ && 128 == (is[i_11_] & 0xc0)) {
                    i_14_ = (i_13_ & 0x1f) << 6 | is[i_11_++] & 0x3f;
                    if (i_14_ < 128) {
                        i_14_ = 65533;
                    }
                } else {
                    i_14_ = 65533;
                }
            } else if (i_13_ < 240) {
                if (1 + i_11_ < i_12_ && (is[i_11_] & 0xc0) == 128 && (is[1 + i_11_] & 0xc0) == 128) {
                    i_14_ = (i_13_ & 0xf) << 12 | (is[i_11_++] & 0x3f) << 6 | is[i_11_++] & 0x3f;
                    if (i_14_ < 2048) {
                        i_14_ = 65533;
                    }
                } else {
                    i_14_ = 65533;
                }
            } else if (i_13_ < 248) {
                if (2 + i_11_ < i_12_ && 128 == (is[i_11_] & 0xc0) && (is[1 + i_11_] & 0xc0) == 128
                        && 128 == (is[2 + i_11_] & 0xc0)) {
                    i_14_ = (i_13_ & 0x7) << 18 | (is[i_11_++] & 0x3f) << 12 | (is[i_11_++] & 0x3f) << 6 | is[i_11_++]
                            & 0x3f;
                    if (i_14_ < 65536 || i_14_ > 1114111) {
                        i_14_ = 65533;
                    } else {
                        i_14_ = 65533;
                    }
                } else {
                    i_14_ = 65533;
                }
            } else {
                i_14_ = 65533;
            }
            cs[i_10_++] = (char) i_14_;
        }
        return new String(cs, 0, i_10_);
    }

    static void append(KeyType class422) {
        if (null == values) {
            values = new KeyType[256];
        }

        values[Class483.charToByte(class422.character) & 0xff] = class422;
    }

    static String decodeString(Buffer buffer, int maxLength) {
        String string;
        try {
            int length = buffer.readUSmart();
            if (length > maxLength) {
                length = maxLength;
            }

            byte[] bytes = new byte[length];
            buffer.caret += HuffmanCodec.huffman.decode(buffer.payload, buffer.caret * -165875887, bytes, 0, length) * 1258142129;
            string = Buffer.decodeString(bytes, 0, length);
        } catch (Exception exception) {
            return "Cabbage";
        }

        return string;
    }

    @Override
    public int getId() {
        return id * 1329601391;
    }

    public Object method7017() {
        return anObject4661;
    }

    public ValueType getValueType() {
        return valueType;
    }

}