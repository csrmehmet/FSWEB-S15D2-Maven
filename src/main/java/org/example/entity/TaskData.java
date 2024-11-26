package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String assignee){
        switch (assignee.toLowerCase()){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;

            case "all":
                Set<Task> allTasks = new HashSet<>();
                    allTasks.addAll(annsTasks);
                    allTasks.addAll(bobsTasks);
                    allTasks.addAll(carolsTasks);
                    allTasks.addAll(unassignedTasks);
                return allTasks;
            default:
                return new HashSet<>();

                }
        }
        public Set<Task> getUnion(Set<Task> ... sets){
        Set<Task> unionSet = new HashSet<>();
        for(Set<Task> set :sets){
            unionSet.addAll(set);
        }
        return unionSet;
        }
    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2); // retain only the elements that are in both sets
        return intersectSet;
    }
    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        Set<Task> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2); // remove elements from set1 that are in set2
        return differenceSet;
    }

}

