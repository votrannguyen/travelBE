package io.javabrains.springsecurityjpa.bean.request;

import java.io.Serializable;

public class ErrorBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;
    private String field;
    private String message;

    public ErrorBean() {
    }

    public ErrorBean(String code, String field, String message) {
        this.code = code;
        this.field = field;
        this.message = message;
    }

    public ErrorBean(String code, String field) {
        this.code = code;
        this.field = field;
//        this.message = BundleUtils.getString(code);
    }

    public ErrorBean(String code, String field,String[] param) {
        this.code = code;
        this.field = field;
//        this.message = DataUtils.getMessageHasParam(code,param);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
