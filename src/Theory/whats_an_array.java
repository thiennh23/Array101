package Theory;

public class whats_an_array {

    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[4];

        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        dvdCollection[0] = avengersDVD;
        dvdCollection[1] = incrediblesDVD;
        dvdCollection[2] = findingDoryDVD;
        dvdCollection[3] = lionKingDVD;

        /*for (DVD i : dvdCollection)
            System.out.println(i.show());*/

        for (int i = 0; i < dvdCollection.length; i++)
            System.out.println(dvdCollection[i].show());

    }

    public static class DVD {
        public String name;
        public int releaseYear;
        public String director;

        public DVD(String name, int releaseDay, String director) {
            this.name  = name;
            this.director = director;
            this.releaseYear = releaseDay;
        }

        public String show() {
            return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
        }
    }

}
