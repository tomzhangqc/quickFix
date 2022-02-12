package com.cicc.entity;

import lombok.Data;

@Data
public class Response<T> {

    private int code;

    private T data;

    private String message;
}
