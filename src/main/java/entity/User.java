package entity;

/**
 * Author:helloboy
 * Date:2019-07-01 11:24
 * Description:<描述>
 */
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userSex;
    private Integer useRage;
    private String userRemark;

    public User() {
    }

    public User(Integer userId) {
        this.userId = userId;
    }

    public User(Integer userId, String userName, String userPassword, String userSex, Integer useRage, String userRemark) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userSex = userSex;
        this.useRage = useRage;
        this.userRemark = userRemark;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Integer getUseRage() {
        return useRage;
    }

    public void setUseRage(Integer useRage) {
        this.useRage = useRage;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }
}
