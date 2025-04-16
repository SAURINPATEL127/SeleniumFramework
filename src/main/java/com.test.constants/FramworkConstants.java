package com.test.constants;

public final class FramworkConstants {

    private FramworkConstants() {
    }

    private static final String URL = "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXH0vVtvUPWCKfdxwljwIhpDKgcsdGFxeXzu1klM2blae0fAnaqua0syo9O094bEkpKVcAcYNUPiOw&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-2129208642%3A1744743030833158";

    public static String getURL(){
        return URL;
    }

}
