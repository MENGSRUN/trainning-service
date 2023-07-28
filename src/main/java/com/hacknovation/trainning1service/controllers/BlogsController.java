package com.hacknovation.trainning1service.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/blogs")
public class BlogsController {

    @GetMapping()
    public String getList() {
        return  "Hollo Blog";
    }

    @PostMapping()
    public String create() {
        return "create Blog";
    }

    @PostMapping("/{id}")
    public String edit(@PathVariable("id") Long id) {
        return "Edit Blog = "+id;
    }

    @DeleteMapping("/{deleteId}")
    public String delete(@PathVariable("deleteId") Long deleteId) {
        return "Deleted Blog = "+deleteId;
    }

}
