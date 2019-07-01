package entity;

/**
 * Author:helloboy
 * Date:2019-07-01 11:28
 * Description:<描述>
 */
public class News {
    private Integer newsId;
    private String newsTime;
    private String newsTitle;
    private Integer newsChannel;
    private String newsPicture;
    private Integer newsPageView;
    private String newsContent;
    private String newsComment;
    private Integer number;
    private Integer newsWriter;

    public News() {
    }

    public News(int newsId) {
        this.newsId = newsId;
    }

    public News(int newsId, String newsTime, String newsTitle, Integer newsChannel, String newsPicture, int newsPageView, String newsContent, String newsComment, int number, Integer newsWriter) {
        this.newsId = newsId;
        this.newsTime = newsTime;
        this.newsTitle = newsTitle;
        this.newsChannel = newsChannel;
        this.newsPicture = newsPicture;
        this.newsPageView = newsPageView;
        this.newsContent = newsContent;
        this.newsComment = newsComment;
        this.number = number;
        this.newsWriter = newsWriter;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public Integer getNewsChannel() {
        return newsChannel;
    }

    public void setNewsChannel(Integer newsChannel) {
        this.newsChannel = newsChannel;
    }

    public String getNewsPicture() {
        return newsPicture;
    }

    public void setNewsPicture(String newsPicture) {
        this.newsPicture = newsPicture;
    }

    public int getNewsPageView() {
        return newsPageView;
    }

    public void setNewsPageView(int newsPageView) {
        this.newsPageView = newsPageView;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsComment() {
        return newsComment;
    }

    public void setNewsComment(String newsComment) {
        this.newsComment = newsComment;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Integer getNewsWriter() {
        return newsWriter;
    }

    public void setNewsWriter(Integer newsWriter) {
        this.newsWriter = newsWriter;
    }
}
