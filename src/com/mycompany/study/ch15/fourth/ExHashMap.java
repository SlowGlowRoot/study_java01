package com.mycompany.study.ch15.fourth;
import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
	
	public static void main(String[] args) {
	
		Map<String, Integer> map = new HashMap<String, Integer>();		// standard
		Map<String, String> map2 = new HashMap<String, String>();
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();		// 아나빼다
		
		map.put("장원영", 100);
		map.put("전지현", 99);
		map.put("장동건", 98);
		map.put("차태식", 97);
//		System.out.println("map.get(\"장원영\") : " + map.get("장원영"));
		
		map.remove("장동건");		// strValue로 "장동건"을 담고 있는 Map값 삭제
		map.clear();	// 전체 데이터 삭제
		
		map2.put("장원영", "100");
		
		for( String strKey: map.keySet() ) {
			Integer strValue = map.get(strKey);
			System.out.println(strKey + " : " + strValue);
		}
		
	}

}
