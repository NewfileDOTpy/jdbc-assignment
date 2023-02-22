package com.codestates.pagination;

import com.codestates.member.entity.Member;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;


@Mapper(componentModel = "Spring")
public class PageMapper {

   public PageInfo pageTopageInfo(Page<Member> page){
       return new PageInfo(page.getNumber(), page.getSize(), page.getTotalElements(), page.getTotalPages());
   }
}
