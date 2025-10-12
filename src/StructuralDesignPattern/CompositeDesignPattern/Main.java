package StructuralDesignPattern.CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");

        FileSystem titanic = new File("Titanic");

        movieDirectory.add(titanic);
        Directory comedyMovieDirectory = new Directory("Animated movie");
        File Tangled = new File("Tangled ever");
        comedyMovieDirectory.add(Tangled);
        movieDirectory.add(comedyMovieDirectory);
        movieDirectory.ls();
    }
}
