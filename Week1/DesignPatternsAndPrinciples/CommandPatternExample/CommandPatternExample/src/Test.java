//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {

        public static void main(String[] args) {


            Light light = new Light();


            Command lightOn = new LightOnCommand(light);
            Command lightOff = new LightOffCommand(light);


            RemoteControl remote = new RemoteControl();

            remote.setCommand(lightOn);
            remote.pressButton();

            remote.setCommand(lightOff);
            remote.pressButton();

    }
}