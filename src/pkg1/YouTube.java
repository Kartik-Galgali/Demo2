package pkg1;

public class YouTube {

    String channelName;
    long subscribers;
    int totalVideos;

    public YouTube(String channelName, long subscribers, int totalVideos) {
        this.channelName = channelName;
        this.subscribers = subscribers;
        this.totalVideos = totalVideos;
    }

    @Override
    public String toString() {
        return "Channel Name= " + channelName + ", Subscribers= " + subscribers + ", Total Videos= " + totalVideos;
    }

    public static void main(String[] args) {

        YouTube y1 = new YouTube("CarryMinati", 10000000, 200);
        YouTube y2 = new YouTube("MrBeast", 300000000, 800);

        System.out.println(y1);
        System.out.println(y2);

        System.out.println(y1.equals(y2));
    }
    
    @Override
    public boolean equals(Object o) {

        if (o instanceof YouTube) {

            YouTube y = (YouTube) o;

            return this.channelName.equals(y.channelName) && this.subscribers == y.subscribers && this.totalVideos == y.totalVideos;
        }

        return false;
    }
}