package main.company;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Group extends Artist {

    final ArrayList<Member> memberList = new ArrayList<>();

    public Group(String name, LocalDate debutDt, ArtistType type) {
        super(name, debutDt, type);
    }

    // 추상메서드
    // TODO
    abstract void setType();

    public Member findMember(String name) {
        Member result = null;
        for (Member mem : memberList) {
            if (name.equals(mem.getName())) {
                result = mem;
            }
        }
        return result;
    }

    public void joinGroup(Member m){
        memberList.add(m);
    }

    public void leaveGroup(Member m) {
        memberList.remove(m);
    }

    public int getMemberCnt() {
        return memberList.size();
    }
}
