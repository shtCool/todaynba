package entity;

public class Comment {
    private Integer commentId;
    private String commentTime;
    private String commentContent;
    private Integer commentPageView;
    private Integer commentWriter;

    public Comment() {
    }

    public Comment(Integer commentId) {
        this.commentId = commentId;
    }

    public Comment(Integer commentId, String commentTime, String commentContent, Integer commentPageView, Integer commentWriter) {
        this.commentId = commentId;
        this.commentTime = commentTime;
        this.commentContent = commentContent;
        this.commentPageView = commentPageView;
        this.commentWriter = commentWriter;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Integer getCommentPageView() {
        return commentPageView;
    }

    public void setCommentPageView(Integer commentPageView) {
        this.commentPageView = commentPageView;
    }

    public Integer getCommentWriter() {
        return commentWriter;
    }

    public void setCommentWriter(Integer commentWriter) {
        this.commentWriter = commentWriter;
    }
}
