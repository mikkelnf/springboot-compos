package com.mnf.compos.dto;

import com.mnf.compos.enumeration.ResponseDtoStatusEnum;

public class ResponseDto<T> extends AResponseDto {
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public ResponseDto() {
    }

    public ResponseDto(ResponseDtoStatusEnum status, String message, T content) {
        super.setStatus(status);
        super.setMessage(message);
        this.content = content;
    }
}
