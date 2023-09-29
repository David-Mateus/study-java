package com.company;

public class Ip {
    public String ip;

    public String ipAddress(){
        return ip.replace(".", "[.]");
    }
}
