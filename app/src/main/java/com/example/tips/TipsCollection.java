package com.example.tips;

import android.util.Log;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Collectionの使い方
 */
public class TipsCollection {

    /**
     * デバッグログ用のTAG
     */
    private final String TAG_NAME = "MY_TAG";

    /**
     * クラス名
     */
    private final String CLASS_NAME = "SampleClass";

    /**
     * collection
     */
    public void fnCollection() {
        final String METHOD_NAME = "fnCollection";

        Log.d(TAG_NAME, "call fnArrayList");
        fnArrayList();


        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- START ----", METHOD_NAME));

        Log.d(TAG_NAME, "call fnHashMap");
        fnHashMap();

        Log.d(TAG_NAME, "call fnCollection1");
        fnCollection1();

        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- END ----", METHOD_NAME));
    }

    /**
     * 動的配列
     */
    private void fnArrayList() {

        final String METHOD_NAME = "fnArrayList";
        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- START ----", METHOD_NAME));

        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(4);
        arrInt.add(5);

        for (int n : arrInt) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // for
        Log.d(TAG_NAME,"for");
        for(int i = 0; i < list.size(); i++)
        {
            Integer val = list.get(i);
            Log.d(TAG_NAME, String.format("val = %d", val));
        }

        // for-each
        Log.d(TAG_NAME,"for-each");
        for (int val : list) {
            Log.d(TAG_NAME, String.format("val = %s", val));
        }

        // イテレータ
        Log.d(TAG_NAME,"イテレータ");
        Iterator it = list.iterator();
        while(it.hasNext())
        {
            Integer val = (Integer)it.next();
            Log.d(TAG_NAME, String.format("n = %d", val));
        }

        // 後ろから処理する場合
        Log.d(TAG_NAME,"イテレータ　後ろから処理する場合");
        ListIterator lit = list.listIterator(list.size());
        while(lit.hasPrevious())
        {
            Integer val = (Integer)lit.previous();
            Log.d(TAG_NAME, String.format("n = %d", val));
        }

        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- END ----", METHOD_NAME));
    }


    /**
     * HashMap
     */
    private void fnHashMap() {

        final String METHOD_NAME = "fnArrayList";
        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- START ----", METHOD_NAME));

        // String型を指定する
        Map<String, String> map1 = new HashMap<>();

        map1.put("Key1", "Val1");
        map1.put("Key2", "Val2");
        map1.put("Key3", "Val3");

        System.out.println(map1.get("Key1"));
        Log.d(TAG_NAME, String.format("Key = %s, Val = %s", "Key1", map1.get("Key1")));
        Log.d(TAG_NAME, String.format("Key = %s, Val = %s", "Key2", map1.get("Key2")));
        Log.d(TAG_NAME, String.format("Key = %s, Val = %s", "Key3", map1.get("Key3")));

        // Keyの取り出し
        Log.d(TAG_NAME,"Keyの取り出し");
        for (String key : map1.keySet()) {
            Log.d(TAG_NAME, String.format("Key = %s, Val = %s", key, map1.get(key)));
        }

        // 値の取り出し
        Log.d(TAG_NAME,"値の取り出し");
        for (String val : map1.values()) {
            Log.d(TAG_NAME, String.format("Val = %s", val));
        }

        // Keyと値の取り出し
        Log.d(TAG_NAME,"Keyと値の取り出し");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            Log.d(TAG_NAME, String.format("Key = %s, Val = %s", entry.getKey(), entry.getValue()));
        }

        // イテレーター
        Log.d(TAG_NAME,"イテレーター");
        for (Iterator<Map.Entry<String, String>> iterator = map1.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, String> entry = iterator.next();
            Log.d(TAG_NAME, String.format("Key = %s, Val = %s", entry.getKey(), entry.getValue()));
        }


        // 順番が保持されない
        HashMap<String, String> hashMap1 = new HashMap<String, String>();

        // Keyでソートされる
        TreeMap<String, String> treeMap1 = new TreeMap<String, String>();

        // 順番が保持される
        LinkedHashMap<String, String> linkedHashMap1 = new LinkedHashMap<String, String>();



        // Listを指定する
        HashMap<String, ArrayList<String>> hashMap2 = new HashMap<>();

        ArrayList<String> arrStr1 = new ArrayList<>();
        arrStr1.add("1aaa");
        arrStr1.add("1bbb");
        arrStr1.add("1ccc");

        ArrayList<String> arrStr2 = new ArrayList<>();
        arrStr2.add("2aaa");
        arrStr2.add("2bbb");
        arrStr2.add("2ccc");

        hashMap2.put("Key1", arrStr1);
        hashMap2.put("Key2", arrStr2);

        // イテレーター
        for (Iterator<Map.Entry<String, ArrayList<String>>> iterator = hashMap2.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, ArrayList<String>> entry = iterator.next();
            Log.d(TAG_NAME, String.format("Key = %s, Val = %s", entry.getKey(), entry.getValue())); // Key = Key1, Val = [1aaa, 1bbb, 1ccc]

            ArrayList<String> arrStr = entry.getValue();
            for (String str : arrStr) {
                Log.d(TAG_NAME, String.format("val = %s",str));
            }

        }

        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- END ----", METHOD_NAME));
    }

    /**
     * Collection
     */
    private void fnCollection1() {
        final String METHOD_NAME = "fnCollection1";
        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- START ----", METHOD_NAME));

        // 以下のような宣言を推奨？
        // 利点
        // 1.Listインターフェースにある機能だけで充分で、ArrayList 等の独自の機能は必要としていない ということを明示
        // 2.後で型が変わる場合に変更範囲がより少なくなる
        // 確かにそうなのかもしれないけど...違和感を感じるのは慣れていないから？
        // List<Integer> arrInt = new ArrayList<>();
        // ArrayListにても別の型のLinkedListには入ったけど...
        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(2);
        arrInt.add(3);
        arrInt.add(4);
        arrInt.add(5);

        for (Integer n : arrInt) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }

        // ArrayListからLinkedListへの変換
        LinkedList<Integer> ll = new LinkedList<>(arrInt);
        for(Integer n : ll) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }

        // ArrayListからLinkedListへのClone
        // 未チェックキャストの警告が出る
        @SuppressWarnings("unchecked")
        ArrayList<Integer> arrIntClone = (ArrayList<Integer>)arrInt.clone();
        for(Integer n : arrIntClone) {
            Log.d(TAG_NAME, String.format("n = %d", n));
        }


        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- END ----", METHOD_NAME));
    }

    /**
     * Dictionary
     *
     * このクラスはもう使われていない。Mapを使う事
     */
    private void fnDictionary() {
        final String METHOD_NAME = "fnCollection1";
        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- START ----", METHOD_NAME));

        // もともとJavaにDictonaryって無かったんだっけ？

        Log.d(TAG_NAME, String.format("METHOD NAME = %s ----- END ----", METHOD_NAME));
    }

    /**
     * List,Set,Map, ArrayList, LinkedList, HashMap, HashTable
     */

    /**
     *
     */

}
