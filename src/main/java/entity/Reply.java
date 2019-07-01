package entity;

/**
 * Author:helloboy
 * Date:2019-07-01 11:42
 * Description:<描述>
 */
public class Reply {
    private Integer replyId;
    private String replyName;
    private String replyContent;
    private Integer replyCommentID;
    private String replyTime;
    private Integer replyWriter;

    public Reply() {
    }

    public Reply(Integer replyId) {
        this.replyId = replyId;
    }

    public Reply(Integer replyId, String replyName, String replyContent, Integer replyCommentID, String replyTime) {
        this.replyId = replyId;
        this.replyName = replyName;
        this.replyContent = replyContent;
        this.replyCommentID = replyCommentID;
        this.replyTime = replyTime;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getReplyCommentID() {
        return replyCommentID;
    }

    public void setReplyCommentID(Integer replyCommentID) {
        this.replyCommentID = replyCommentID;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getReplyWriter() {
        return replyWriter;
    }

    public void setReplyWriter(Integer replyWriter) {
        this.replyWriter = replyWriter;
    }
}
