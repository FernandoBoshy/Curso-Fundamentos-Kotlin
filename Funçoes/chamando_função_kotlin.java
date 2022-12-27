package Funçoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class chamando_função_kotlin {
    public static void main(String[] args){
        ArrayList<String> list = CollectionsKt.arrayListOf("joão", "maria", "pedro");
        System.out.println(SegundoelementoKt.second_or_null(list));  // SegundoelementoKt faz referência ao arquivo kotlin que está na mesma pasta

    }
}
