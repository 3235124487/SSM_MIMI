import com.sh.mapper.ProductInfoMapper;
import com.sh.pojo.ProductInfo;
import com.sh.pojo.vo.ProductInfoVo;
import com.sh.utils.MD5Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author GGBond
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class Mytest {

    @Autowired
    ProductInfoMapper productInfoMapper;

    @Test
    public void sss(){
        ProductInfoVo vo = new ProductInfoVo();
        List<ProductInfo> list = productInfoMapper.selectCondition(vo);
        for(ProductInfo list1 : list){
            System.out.println(list1);
        }
    }
}
