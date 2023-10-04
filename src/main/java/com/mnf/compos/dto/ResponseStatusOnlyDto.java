package com.mnf.compos.dto;

import com.mnf.compos.enumeration.ResponseDtoStatusEnum;

public class ResponseStatusOnlyDto extends AResponseDto{
    public ResponseStatusOnlyDto() {
    }
    public ResponseStatusOnlyDto(ResponseDtoStatusEnum status) {
        super.setStatus(status);
    }
    public ResponseStatusOnlyDto(ResponseDtoStatusEnum status, String message) {
        super.setStatus(status);
        super.setMessage(message);
    }
}
