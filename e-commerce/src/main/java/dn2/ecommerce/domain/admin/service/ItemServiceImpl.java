package dn2.ecommerce.domain.admin.service;

import dn2.ecommerce.domain.admin.repository.ItemDAO;
import dn2.ecommerce.domain.item.ItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService{
    @Autowired
    private ItemDAO itemDAO;

    @Override
    public List<ItemDTO>list(){
        return itemDAO.list();
    }
}
