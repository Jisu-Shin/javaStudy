package main.company.repository;

import main.company.domain.Group;
import main.company.domain.Member;

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
