package main.company;

import java.time.LocalDate;

public class Artist {
    protected String name;
    protected LocalDate debutDt;
    String originName;

    // TODO Artist가 솔로인지/배우인지/걸그룹인지/보이그룹인지 그 유형을 어떻게 구분하지?
    protected String type;

    public Artist(String name){
        this.name = name;
        this.debutDt = LocalDate.now();
        this.type = "Solo";
    }

    public Artist(String name, LocalDate debutDt, String type) {
        this.name = name;
        this.debutDt = debutDt;
        this.type = type;
    }

    public void appearVarietyShow(String show) {
        System.out.println(name+"이/가 "+show+"에 출연하다");
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", debutDt=" + debutDt +
                ", type='" + type + '\'' +
                '}';
    }
}
