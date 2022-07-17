package com.jagex;

import jaggl.OpenGL;

public class OpenGlProgramString {
    private static final int GL_PROGRAM_FORMAT_ASCII = 0x8875;
    private static final int GL_PROGRAM_ERROR_POSITION = 0x864B;
    static int[] parameters = new int[1];
    OpenGlToolkit toolkit;
    int program;
    OpenGlProgramString(OpenGlToolkit toolkit, int program) {
        this.toolkit = toolkit;
        this.program = program;
    }

    static OpenGlProgramString create(OpenGlToolkit toolkit, int target, String string) {
        int program = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(target, program);
        OpenGL.glProgramStringARB(target, GL_PROGRAM_FORMAT_ASCII, string);
        OpenGL.glGetIntegerv(GL_PROGRAM_ERROR_POSITION, parameters, 0);

        if (parameters[0] != -1) {
            OpenGL.glBindProgramARB(target, 0);
            return null;
        }

        OpenGL.glBindProgramARB(target, 0);
        return new OpenGlProgramString(toolkit, program);
    }

    @Override
    public void finalize() throws Throwable {
        toolkit.deleteProgram(program);
        super.finalize();
    }

}