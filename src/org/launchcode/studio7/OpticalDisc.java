package org.launchcode.studio7;

import org.jetbrains.annotations.NotNull;

interface OpticalDisc {
    public abstract void spin(int rpm);

    public abstract void write(String contents);

    public abstract String read();

    public abstract String getName();

    public abstract void changeName(String newName);

    public abstract String about();

    public abstract void playContents();

    public abstract void pausePlayback();

    public abstract void eject();
}

abstract class BaseDisc implements OpticalDisc {
    private String contents;

    private String name;

    private final int maxRPM;

    private final int maxBytes;

    private final int numberSides;

    public BaseDisc(){
        contents = "";
        name = "";
        maxRPM = 0;
        maxBytes = 1000;
        numberSides = 0;
    }

    public BaseDisc( String name, String contents, int maxRPM, int maxBytes, int numberSides) {
        this.name = name;
        this.contents = contents.length() <= maxBytes ? contents : contents.substring(0, maxBytes);
        this.maxRPM = maxRPM;
        this.maxBytes = maxBytes;
        this.numberSides = numberSides;
    }

    public void spin(int rpm) {
        if (rpm > maxRPM) spin(maxRPM);
        //spin the disc
    }

    public void write(String contents) {
        if (contents.length() <= maxBytes) this.contents = contents;
        else System.out.println("Error, content too long");
    }

    public String read() {
        return contents;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName){
        this.name = newName;
    }

    public String about() {
        return name + "\n" + maxRPM + " Max RPM\n" + maxBytes + " Max Bytes\n" + contents.length() + " Bytes\n" + numberSides + " Sides";
    }

    public void playContents() {
        System.out.println(contents);
    }

    public void pausePlayback() {
        //pause
    }

    public void eject() {
        //eject disc
    }
}