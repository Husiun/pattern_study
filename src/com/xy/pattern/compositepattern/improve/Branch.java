package compositepattern.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝类
 *
 * @author Ying Xiong
 * @date 2018/1/17
 */
public class Branch extends Corp{
    @SuppressWarnings("unchecked")
    private List<Corp> subDinaList = new ArrayList<Corp>();
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    //添加
    public void addSubordinate(Corp corp){
        this.subDinaList.add(corp);
    }

    //遍历
    public List<Corp> getSubDinaList(){
        return this.subDinaList;
    }
}
