package dn2.ecommerce.domain.admin.repository;

import dn2.ecommerce.domain.item.ItemDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDAOImpl implements ItemDAO{

    private SqlSession sqlSession;
    private final String NS = "dn2.ecommerce.domain.user.repository.UserMapper";

    @Override
    public List<ItemDTO> list() {
        return sqlSession.selectList(NS+".list");
    }
}
