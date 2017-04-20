package demo.fruit.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import demo.fruit.dto.Fruit2;
import demo.fruit.mapper.Fruit2Mapper;
import demo.fruit.service.IFruit2Service;
@Service
@Transactional
public class Fruit2ServiceImpl extends BaseServiceImpl<Fruit2> implements IFruit2Service {
    @Autowired
    private Fruit2Mapper fruit2Mapper;

    @Override
    public int updateList(List<Fruit2> fruit2List){
        fruit2List.forEach(fruit2 -> checkOvn(fruit2Mapper.updateFruit2(fruit2),fruit2));
        return fruit2List.size();
    }
}