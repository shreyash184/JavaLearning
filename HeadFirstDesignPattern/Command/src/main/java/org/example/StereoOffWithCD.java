package org.example;

public class StereoOffWithCD implements Command{
    Stereo stereo;

    public StereoOffWithCD(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.offWithCD();
    }

    @Override
    public void undo() {
        stereo.onWithCD();
    }
}
