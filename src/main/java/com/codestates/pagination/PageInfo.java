package com.codestates.pagination;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
public class PageInfo {
    private int page;
    private int size;
    private long totalElements;
    private int totalPage;

    public PageInfo(int page, int size, long totalElements, int totalPage) {
        this.page = page;
        this.size = size;
        this.totalElements = totalElements;
        this.totalPage = totalPage;
    }
}
