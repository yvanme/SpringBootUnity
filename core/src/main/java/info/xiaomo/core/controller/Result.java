package info.xiaomo.core.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * @github: https://github.com/qq83387856
 * @email: hupengbest@163.com
 * @QQ_NO: 83387856
 * @Date: 2016/10/31 15:25
 * @Description: 返回结果
 * @Copyright(©) 2015 by xiaomo.
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Result<T> {

    private int resultCode;

    private String message;

    private T data;

    /**
     * 只返回错误码
     * @param resultCode resultCode
     */
    public Result(int resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * 只有返回数据的(验证成功)
     * @param data data
     */
    public Result(T data) {
        this.data = data;
    }

    /**
     * 只有错误码和错误信息的
     * @param resultCode resultCode
     * @param message message
     */
    public Result(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }


    /**
     * 全部参数
     * @param resultCode resultCode
     * @param message message
     * @param data data
     */
    public Result(int resultCode, String message, T data) {
        this.resultCode = resultCode;
        this.message = message;
        this.data = data;
    }
}
