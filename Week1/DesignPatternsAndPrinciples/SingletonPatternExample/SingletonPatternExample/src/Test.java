//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Test {
    public static void main(String[] args) {
//        Logger logger=new Logger(); return error Logger() has private access in Logger as its a singleton classs So we can't have  more than 1 object
        Logger logger1=Logger.getInstance();
        Logger logger2=Logger.getInstance();
        if(logger1==logger2){
            System.out.println("Samme Object used by both the instances");
        }
        else{
            System.out.println("Different objects used by both of the instances");
        }
        }
    }
