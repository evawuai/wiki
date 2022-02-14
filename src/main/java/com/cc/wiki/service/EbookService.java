package com.cc.wiki.service;

import com.cc.wiki.api.EbookReq;
import com.cc.wiki.api.EbookResp;
import com.cc.wiki.domain.Ebook;
import com.cc.wiki.domain.EbookExample;
import com.cc.wiki.mapper.EbookMapper;
import com.cc.wiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> ebookList(EbookReq req) {
        EbookExample example = new EbookExample();
        EbookExample.Criteria criteria = example.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebooks = ebookMapper.selectByExample(example);

        return CopyUtil.copyList(ebooks, EbookResp.class);
    }
}
