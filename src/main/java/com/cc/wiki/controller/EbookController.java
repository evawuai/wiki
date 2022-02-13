package com.cc.wiki.controller;

import com.cc.wiki.domain.Ebook;
import com.cc.wiki.service.EbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 40536
 */
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Autowired
    private EbookService ebookService;


    @RequestMapping("/list")
    public List<Ebook> ebookList(){
        return ebookService.ebookList();
    }
}
