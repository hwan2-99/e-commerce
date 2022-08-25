package dn2.ecommerce.domain.admin.mapper;

import dn2.ecommerce.global.entity.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    //Create


    //Read


    //Update

    public void updateItem(Item item);

    //delete

    public void deleteItem(Item item);



}
