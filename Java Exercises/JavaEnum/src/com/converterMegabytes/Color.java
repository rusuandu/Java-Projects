package com.converterMegabytes;

public enum Color
{
    RED(255,0,0), BLUE(0,0,255), YELLOW(255,255,0), BLACK(0,0,0);

    private int red;
    private int green;
    private int blue;

    Color(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public String rgbValue() {
        return String.format("%d,%d,%d", red,green,blue);
    }


}
