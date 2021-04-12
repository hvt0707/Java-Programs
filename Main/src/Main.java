class Movie{
    private String name;
    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "no plot here";
    }

    public String getName(){
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people.";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    public String plot(){
        return "Kids try to escape a maze.";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    public String plot(){
        return "Imperial forces attempt to take over the Universe.";
    }
}

class Interstellar extends Movie{
    public Interstellar(){
        super("Interstellar");
    }

    public String plot(){
        return "Humans try to overcome their extinction.";
    }
}

class Prestige extends Movie{
    public Prestige(){
        super("Prestige");
    }

//    public String plot(){
//        return "A mind-fucking drama between two magicians.";
//    }
}

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Name: "+movie.getName()+"\n"+"Plot: "+movie.plot());
        }
    }

    public static Movie randomMovie(){
        int random = (int)((Math.random()*5)+1);
        switch(random){
            case 1:
                return new Jaws();
            case 2:
                return new MazeRunner();
            case 3:
                return new StarWars();
            case 4:
                return new Interstellar();
            case 5:
                return new Prestige();
            default:
                return null;
        }
    }
}
