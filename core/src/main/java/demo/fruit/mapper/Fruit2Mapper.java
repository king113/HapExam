package demo.fruit.mapper;

import com.hand.hap.mybatis.common.Mapper;

import demo.fruit.dto.Fruit2;
public interface Fruit2Mapper extends Mapper<Fruit2>{
    int updateFruit2(Fruit2 fruit2);

}