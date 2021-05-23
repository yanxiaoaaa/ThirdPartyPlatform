package com.science.resource.util;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class MapConvert {
    public static Object getMapToObject(Map<Object, Object> map, Class<?> cla) throws Exception {
        if (map == null)
            return null;
        Object obj = cla.newInstance();
        cla = obj.getClass();
        Field[] fields = cla.getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }
            field.setAccessible(true);
            if (map.containsKey(field.getName())) {
                field.set(obj, map.get(field.getName()));
            }
        }
        return obj;
    }
    //Object转Map
    public static Map<String, Object> getObjectToMap(Object obj) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<String, Object>();
        Class<?> cla = obj.getClass();
        Field[] fields = cla.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String keyName = field.getName();
            Object value = field.get(obj);

            if (keyName == "serialVersionUID"||value == null){
                continue;
            }
            map.put(keyName, value);
        }
        return map;
    }
}
