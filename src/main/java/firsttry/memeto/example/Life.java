package firsttry.memeto.example;

/**
 * @Description
 * @ClassName Life
 * @Author wangDi
 * @date 2020-10-12 16:27
 */
public class Life {

    private String time;

    public void set(String time) {
        System.out.println("Setting time to " + time);
        this.time = time;
    }

    public Memento saveToMemento() {
        System.out.println("Saving time to Memento");
        return new Memento(time);
    }

    public String getTime() {
        return time;
    }

    public void restoreFromMemento(Memento memento) {
        time = memento.getSavedTime();
        System.out.println("Time restored from Memento: " + time);
    }

    /**
     * 感觉像是保存快照
     *
     */
    public static class Memento {
        private final String time;

        public Memento(String timeToSave) {
            time = timeToSave;
        }

        public String getSavedTime() {
            return time;
        }
    }

}
