package main.company.repository;

import main.company.Group;
import main.company.Member;

public interface GroupRepository {

    public void addMember(Group g, Member m);
    public void removeMember(Group g, Member m);
    public void findMemberByName(String name);
}
