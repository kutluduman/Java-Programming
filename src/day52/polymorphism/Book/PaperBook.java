package day52.polymorphism.Book;

public class PaperBook extends Book implements Readable {

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }


    public void displayBookInfo() {

        System.out.println("Paper's name is : " + name + ", and the author is " + author + " and it's weight is "
                + weight + " pound");

    }

    public void takeNotes() {

        System.out.println("Taking note from "+ name);

    }

    public void read(){



    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
