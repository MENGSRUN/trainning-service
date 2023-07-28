package com.hacknovation.trainning1service.services;

import com.hacknovation.trainning1service.models.entities.BlogTypeEntity;
import com.hacknovation.trainning1service.models.requests.BlogTypeRQ;
import com.hacknovation.trainning1service.models.responses.BlogTypeRS;
import com.hacknovation.trainning1service.models.respositories.BlogTypeRP;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogTypeService {

    private final BlogTypeRP blogTypeRP;

    public List<BlogTypeRS> getList() {

        List<BlogTypeEntity> listing = blogTypeRP.findAll();
        List<BlogTypeRS> blogTypeRS = new ArrayList<>();
        for (BlogTypeEntity item : listing) {
            BlogTypeRS blogTypeRS1 = new BlogTypeRS();
            BeanUtils.copyProperties(item, blogTypeRS1);
            blogTypeRS.add(blogTypeRS1);
        }

        return blogTypeRS;
    }

    public String create(BlogTypeRQ blogTypeRQ) {

        BlogTypeEntity blogTypeEntity = new BlogTypeEntity();
        blogTypeEntity.setName(blogTypeRQ.getName());

        blogTypeRP.save(blogTypeEntity);

        return "Create Blog Type";
    }

    public String edit(Long blogId) {

        return "Edit Blog Type= "+blogId;
    }

    public String delete(Long deleteId) {

        return "Delete Blog Type ="+deleteId;
    }

}
