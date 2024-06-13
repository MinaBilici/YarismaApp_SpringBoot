package com.minab.constant;

public class EndPoints {
    public static final String VERSION="/v1";
    //profiller:
    public static final String API="/api";
    public static final String DEV="/dev";
    public static final String TEST="/test";

    public static final String ROOT=API+VERSION;


    //entities:
    public static final String AUTH=ROOT+"/auth";
    public static final String USER=ROOT+"/user";
    public static final String SORU=ROOT+"/soru";
    public static final String CEVAP=ROOT+"/cevap";
    public static final String YARISMA=ROOT+"/yarisma";

    //methods:
    public static final String SAVE="/save";
    public static final String REGISTER="/register";
    public static final String UPDATE="/update";
    public static final String DELETE="/delete";
    public static final String FINDALL="/findall";
    public static final String FINDBYID="/findbyid";

}
