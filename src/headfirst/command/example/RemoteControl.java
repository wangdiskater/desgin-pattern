package headfirst.command.example;

import headfirst.command.example.imp.NoCommand;

/**
 * @Description
 * @ClassName RemoteController
 * @Author wangDi
 * @date 2020-11-11 16:10
 */
public class RemoteControl {
    private static final Integer SLOT_LENGTH = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[SLOT_LENGTH];
        offCommands = new Command[SLOT_LENGTH];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < SLOT_LENGTH; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if (slot >= SLOT_LENGTH) {
            return;
        }
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
