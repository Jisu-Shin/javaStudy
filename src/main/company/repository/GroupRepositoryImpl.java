package main.company.repository;

import main.company.Group;
import main.company.Member;

public class GroupRepositoryImpl implements GroupRepository{
    Group group;

    @Override
    public void addMember(Group g, Member m) {
        group = g;
        group.addMember(m);
    }

    @Override
    public void removeMember(Group g, Member m) {
        group = g;
        group.removeMember(m);
    }

    @Override
    public void findMemberByName(String name) {

    }
}
