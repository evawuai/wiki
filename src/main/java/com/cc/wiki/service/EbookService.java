package com.cc.wiki.service;

import com.cc.wiki.domain.Ebook;
import com.cc.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> ebookList() {
        return ebookMapper.selectByExample(null);
    }
}
