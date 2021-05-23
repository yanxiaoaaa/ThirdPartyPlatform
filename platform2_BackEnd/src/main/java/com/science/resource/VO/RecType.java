package com.science.resource.VO;


public enum RecType {
    Patent("patent",2),Equipment("equipment",1),Expert("expert",0);
    int type;
    String name;
    private RecType(String name, int index) {
        this.name = name;
        this.type = index;
    }

    public static String getText(int domain){
        String text;
        switch (domain){
            case 0:{
                text = Expert.name;
                break;
            }

            case 1: {
                text = Equipment.name;
                break;
            }
            case 2: {
                text = Patent.name;
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + domain);
        }
        return text;
    }
}
