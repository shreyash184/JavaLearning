package org.example;

import javax.crypto.Mac;
import java.util.List;

public class RemoteLoader {
    public static void main(String[] args) {
        // Mapping
        // light - reciever
        // RemoteControl - requestor.
        // Now both are decoupled from each other.



        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        StereoOnWithCD stereoOnWithCD = new StereoOnWithCD(stereo);
        StereoOffWithCD stereoOffWithCD = new StereoOffWithCD(stereo);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, stereoOnWithCD, stereoOffWithCD);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);

        Command[] partyOn = {lightOnCommand, stereoOnWithCD};
        Command[] partyOff = {lightOffCommand, stereoOffWithCD};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(5, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(5);
        System.out.println(remoteControl);
        remoteControl.offButtonWasPushed(5);
        System.out.println(remoteControl);


    }

}
