package com.example.demo.result;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * Result
 *
 * <p>返回结果
 *
 * @author hewei
 * @version [1.0.0, 2019/2/3]
 */
@Data
@AllArgsConstructor
@Builder
public class Result {

    private String message;

    private Object data;

    private int status;

    public Result() {
        this(HttpStatus.OK.value(), "", null);
    }

    public Result(Object data) {
        this(HttpStatus.OK.value(), "", data);
    }

    public Result(String message) {
        this(HttpStatus.OK.value(), message, null);
    }

    public Result(int code, String message) {
        this(code, message, null);
    }

    public Result(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static Result success(Object data) {
        return Result.builder()
                .data(data)
                .status(HttpStatus.OK.value())
                .build();
    }

    public static Result success(String message, Object data) {
        return Result.builder()
                .message(message)
                .data(data)
                .status(HttpStatus.OK.value())
                .build();
    }


    public static Result fail(String message) {
        return Result.builder()
                .message(message)
                .status(HttpStatus.OK.value())
                .build();
    }

    public static Result error(String message) {
        return Result.builder()
                .message(message)
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .build();
    }

}
