package org.example;

public class StereoOnWithCD implements Command{
    Stereo stereo;

    public StereoOnWithCD(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void undo() {
        stereo.offWithCD();
    }

    @Override
    public void execute() {
        stereo.onWithCD();
    }
}
