package demo.fruit.mapper;

import com.hand.hap.mybatis.common.Mapper;
import java.util.List;
import demo.fruit.dto.Fruit2;
public interface Fruit2Mapper extends Mapper<Fruit2>{
    /*
    * 更新水果详细信息
     */
    int updateFruit2(Fruit2 fruit2);
    /*
    * 查询水果详细信息
    */
    List<Fruit2> selectByfruit(Fruit2 demo);
}