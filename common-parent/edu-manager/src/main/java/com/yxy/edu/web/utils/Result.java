package com.yxy.edu.web.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: EduProject
 * @Package com.yxy.edu.web.utils
 * @Description: TODO
 * @date Date : 2019年05月20日 14:33
 */
public class Result extends HashMap<String, Object> {
    private static final Long serialVersionUID = 1L;

    public static Result error(){
        return error(500,"未知异常，请联系管理员");
    }

    public static Result error(String msg){
        return error(500,msg);
    }

    public static Result error(int code, Object msg){
        Result r= new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }


    public static Result success(int code, Object msg){
        Result r= new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Result ok(String msg){
        Result r= new Result();
        r.put("msg", msg);
        return r;
    }

    public static Result ok(Map<String, Object> map){
        Result r= new Result();
        r.putAll(map);
        return r;
    }

    public static Result ok(){
        Result r= new Result();
        r.put("code", 0);
        return r;
    }

    public Result puts(String key, Object value){
        Result r= new Result();
        r.put(key, value);
        return r;
    }


}
