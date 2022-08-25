package dn2.ecommerce.domain.admin.repository;

import dn2.ecommerce.domain.item.ItemDTO;

import java.util.List;

public interface ItemDAO {
    List<ItemDTO> list();
}
