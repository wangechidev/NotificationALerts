
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wangechi
 */
public interface Notification {

    /**
     *
     * @return
     */
    public void push(HashMap<String, String> responseMap);

}
