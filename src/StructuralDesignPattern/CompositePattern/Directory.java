package StructuralDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String name) {
        this.directoryName = name;
        fileSystems = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj) {
        fileSystems.add(fileSystemObj);
    }

    @Override
    public void ls() {

        System.out.println("Directory name " + directoryName);

        for (FileSystem fileSystemObj : fileSystems) {
            fileSystemObj.ls();
        }

        // System.out.println("Directory name"+directoryname);
    }

}
