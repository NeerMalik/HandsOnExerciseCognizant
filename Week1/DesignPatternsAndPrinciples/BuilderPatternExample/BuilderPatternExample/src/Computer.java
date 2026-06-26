public class Computer {
    private String CPU;
    private int RAM;
    private int Storage;
    public static class Builder{
        private String CPU;
        private int RAM;
        private int Storage;
        public Builder setCPU(String CPU){
            this.CPU=CPU;
            return this;
        }
        public Builder setRAM(int RAM){
            this.RAM=RAM;
            return this;
        }
        public Builder setStorage(int Storage){
            this.Storage=Storage;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
    private Computer(Builder builder){
        this.CPU=builder.CPU;
        this.RAM=builder.RAM;
        this.Storage=builder.Storage;
    }
    public void display(){
        System.out.println("CPU "+CPU+" RAM " +RAM+" Storage "+Storage);
    }

}
