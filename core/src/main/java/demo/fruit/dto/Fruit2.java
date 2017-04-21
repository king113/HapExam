package demo.fruit.dto;

/**
 * Fruit2
 * Author:Caikai
 * Date:2017/4/21
 * Description:水果类
 * **/
import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@ExtensionAttribute(disable=true)
@Table(name = "fruit")
public class Fruit2 extends BaseDTO {
     @Id
     @GeneratedValue(
             generator = "IDENTITY"
     )
     @Column
      private Long id;
     @Column
     @Condition(operator = "LIKE")
      private String name;
     @Column
      private Long price;
     @Column(name = "producing_area")
      private String producingArea;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getProducingArea() {
        return producingArea;
    }

    public void setProducingArea(String producingArea) {
        this.producingArea = producingArea;
    }
}
