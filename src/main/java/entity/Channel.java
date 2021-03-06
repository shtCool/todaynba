package entity;

public class Channel {
    private Integer channelId;
    private String channelName;
    public Channel() {
    }

    public Channel(Integer channelId) {
        this.channelId = channelId;
    }

    public Channel(Integer channelId, String channelName) {
        this.channelId = channelId;
        this.channelName = channelName;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
