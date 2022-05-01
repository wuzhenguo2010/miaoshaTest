package com.miaoshaProject.error;

public interface CommonError {
    public int getErrCode();
    public String gerErrMsg();
    public CommonError setErrMsg(String errMsg);
}
