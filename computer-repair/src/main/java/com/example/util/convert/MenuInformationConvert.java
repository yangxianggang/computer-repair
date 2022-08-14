package com.example.util.convert;

import com.example.pojo.MenuInformation;
import com.example.vo.MenuInformationVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MenuInformationConvert {
    MenuInformationConvert INSTANCE= Mappers.getMapper(MenuInformationConvert.class);

    List<MenuInformationVo>menuInfoConvert( List<MenuInformation> list);

}
