package firsttry.bridge.example;

/**
 * @Description
 * @ClassName AbstractRemoteControl
 * @Author wangDi
 * @date 2020-10-20 10:53
 */
public abstract class AbstractRemoteControl {
        /**
         * @uml.property  name="tv"
         * @uml.associationEnd
         */
        private ITV tv;

        public AbstractRemoteControl(ITV tv){
            this.tv = tv;
        }

        public void turnOn(){
            tv.on();
        }

        public void turnOff(){
            tv.off();
        }

        public void setChannel(int channel){
            tv.switchChannel(channel);
        }

    public ITV getTv() {
        return tv;
    }

    public void setTv(ITV tv) {
        this.tv = tv;
    }
}
