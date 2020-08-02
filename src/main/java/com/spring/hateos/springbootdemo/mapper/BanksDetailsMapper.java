package com.spring.hateos.springbootdemo.mapper;

import com.spring.hateos.springbootdemo.domain.BankDetails;
import com.spring.hateos.springbootdemo.persistence.BankDetailsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BanksDetailsMapper {

    BankDetails entity2Model(BankDetailsEntity bankDetailsEntity);
}
