package com.fr.function;  
import com.fr.fs.base.entity.User;  
import com.fr.fs.control.UserControl;  
import com.fr.script.AbstractFunction;  
import com.fr.stable.Primitive;  
public class GetRealName extends AbstractFunction {  
    @Override  
    public Object run(Object[] arg0) {  
        if(null==arg0||arg0.length==0){  
             return "";  
        }  
        String username=arg0[0].toString();  
        try {  
            User U=UserControl.getInstance().getByUserName(username);  
            if(U==null){  
                return "";  
            }  
            String realname=U.getRealname();  
            return realname;  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
        return 0;  
    }  
}  