package com.codestates.member.dto;

import com.codestates.pagination.PageInfo;
import lombok.Getter;

import java.util.List;

@Getter
public class MemberPageResponseDto<T> {
    private List<MemberResponseDto> member;
    private PageInfo pageInfo;


    public MemberPageResponseDto(List<MemberResponseDto> member, PageInfo pageInfo) {
        this.member = member;
        this.pageInfo = pageInfo;
    }
}
