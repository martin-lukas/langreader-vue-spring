package org.lukas.langreader.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RestResponse {
    private int status;
    private String message;
    private long timeStamp;
}