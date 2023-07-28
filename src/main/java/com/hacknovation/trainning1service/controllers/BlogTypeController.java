package com.hacknovation.trainning1service.controllers;

import com.hacknovation.trainning1service.models.requests.BlogTypeRQ;
import com.hacknovation.trainning1service.models.responses.BlogTypeRS;
import com.hacknovation.trainning1service.services.BlogTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/blog-types")
public class BlogTypeController {

    private final BlogTypeService blogTypeService;

    @GetMapping()
    public List<BlogTypeRS> getList() {
        return blogTypeService.getList();
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public String create(@Validated @ModelAttribute BlogTypeRQ blogTypeRQ) {
        return blogTypeService.create(blogTypeRQ);
    }

    @PostMapping("/{blogId}")
    public String edit(@PathVariable("blogId") Long blogId) {
        return blogTypeService.edit(blogId);
    }

    @DeleteMapping("/{deleteId}")
    public String delete(@PathVariable("deleteId") Long deleteId) {
        return blogTypeService.delete(deleteId);
    }

}
