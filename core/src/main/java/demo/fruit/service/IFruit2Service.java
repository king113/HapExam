package demo.fruit.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import java.util.List;
import demo.fruit.dto.Fruit2;
public interface IFruit2Service extends IBaseService<Fruit2>, ProxySelf<IFruit2Service>{

   int updateList(List<Fruit2> fruit2List);

}