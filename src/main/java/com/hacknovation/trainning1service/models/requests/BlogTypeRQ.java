package com.hacknovation.trainning1service.models.requests;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class BlogTypeRQ {

    private String name;

    private MultipartFile thumbnail;

}