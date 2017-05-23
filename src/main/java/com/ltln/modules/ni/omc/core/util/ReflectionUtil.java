package com.ltln.modules.ni.omc.core.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReflectionUtil {

	static Map<String, List<Field>> _fieldCache = new HashMap<>();

	public static List<String> getFieldNameList(Class<?> class1) {
		List<String> fieldNameList = new ArrayList<>();
		List<Field> fieldList = getIfNotExist(class1);
		for(Field f : fieldList){
			fieldNameList.add(f.getName());
		}
		return fieldNameList;
	}
	
	public static String getFieldVal(Object resObj, String fieldName) {
		List<Field> fieldList = getIfNotExist(resObj.getClass());
		Field field = getField(fieldList,fieldName);
		Object fieldVal = getFieldVal(field,resObj);
		return fieldVal.toString();
	}

	private static List<Field> getIfNotExist(Class<?> class1) {
		List<Field> fieldList = _fieldCache.get(class1.getSimpleName());
		if(fieldList==null){
			fieldList = getDeclaredField(class1);
			_fieldCache.put(class1.getSimpleName(), fieldList);
		}
		return fieldList;
	}
	
	static Field getField(List<Field> fieldList, String fieldName) {
		for(Field f : fieldList){
			if(f.getName().equalsIgnoreCase(fieldName))
				return f;
		}
		return null;
	}

	public static List<Field> getDeclaredField(Class<?> class1) {
		List<Field> fieldList = new ArrayList<>();
		for (Class<?> superClass = class1; superClass != Object.class; superClass = superClass
				.getSuperclass()) {
			for(Field f  : superClass.getDeclaredFields()){
				if(!Modifier.isStatic(f.getModifiers()))
					fieldList.add(f);
			}
		}
		return fieldList;
	}


	public static Object getFieldVal(Field field, Object obj) {
		makeAccessible(field);
		try {
			return field.get(obj);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}


	protected static void makeAccessible(final Field field) {
		if (!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers())) {
			field.setAccessible(true);
		}
	}


}
