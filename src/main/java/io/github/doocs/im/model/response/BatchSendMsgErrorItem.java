package io.github.doocs.im.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author hyh
 * @since 2021/07/28 17:47
 */
public class BatchSendMsgErrorItem {
    @JsonProperty("To_Account")
    private String toAccount;

    @JsonProperty("ErrorCode")
    private Integer errorCode;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "BatchSendMsgErrorItem{" +
                "toAccount='" + toAccount + '\'' +
                ", errorCode=" + errorCode +
                '}';
    }
}
