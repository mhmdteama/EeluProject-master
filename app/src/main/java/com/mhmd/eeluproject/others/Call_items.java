package com.mhmd.eeluproject.others;


public class Call_items {

    private String callername , callernum  ;
    private int callerimg;

    public Call_items(String callername, String callernum, int callerimg) {
        this.callername = callername;
        this.callernum = callernum;
        this.callerimg = callerimg;
    }


    public String getCallername() {
        return callername;
    }

    public void setCallername(String callername) {
        this.callername = callername;
    }

    public String getCallernum() {
        return callernum;
    }

    public void setCallernum(String callernum) {
        this.callernum = callernum;
    }

    public int getCallerimg() {
        return callerimg;
    }

    public void setCallerimg(int callerimg) {
        this.callerimg = callerimg;
    }
}
