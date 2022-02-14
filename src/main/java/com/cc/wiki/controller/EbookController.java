package com.cc.wiki.controller;

import com.cc.wiki.api.CommonResp;
import com.cc.wiki.api.EbookReq;
import com.cc.wiki.api.EbookResp;
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
    public CommonResp ebookList(EbookReq req){
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.ebookList(req);
        resp.setContent(list);
        return resp;
    }
}
