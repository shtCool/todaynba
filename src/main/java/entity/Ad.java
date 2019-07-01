package entity;

/**
 * Author:helloboy
 * Date:2019-07-01 11:45
 * Description:<描述>
 */
public class Ad {
    private Integer adID;
    private String adContent;

    public Ad() {
    }

    public Ad(Integer adID) {
        this.adID = adID;
    }

    public Ad(Integer adID, String adContent) {
        this.adID = adID;
        this.adContent = adContent;
    }

    public Integer getAdID() {
        return adID;
    }

    public void setAdID(Integer adID) {
        this.adID = adID;
    }

    public String getAdContent() {
        return adContent;
    }

    public void setAdContent(String adContent) {
        this.adContent = adContent;
    }
}
