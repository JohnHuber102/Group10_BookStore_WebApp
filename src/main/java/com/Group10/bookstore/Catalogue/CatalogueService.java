package com.Group10.bookstore.Catalogue;

import com.Group10.bookstore.Book;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CatalogueService {

    private List<Book> defaultCatalogue = Arrays.asList(
            new Book("1", "The First Book EVER", "The First Book Ever Written by Man",
                             17.67, "Adam Eve", "Fiction", 1,1),
                new Book("2", "The Best Book Ever", "This legendary tome educated mankind and brought them from the Stone" +
                                 "Age to the Dark Age", 60.94, "John Almighty", "Fiction", 42, 6212342),
                new Book("3", "Armageddon", "A Large World Ending Asteroid is on a direct collision course to Earth, find out" +
                                 "how a Crack Squad of Oil Drillers are Sent to Save the world with NUKES", 69.50, "MICHAEL BAY", "Sci-Fi", 666, 740134045)
        );

    public List<Book> getDefaultCatalogue(){
        return defaultCatalogue;
    }

    //Retrieves a list of books by genre
    public Book searchGenre(String searchGenre){
        return defaultCatalogue.stream().filter(t -> t.getGenre().equalsIgnoreCase(searchGenre)).findFirst().get();
    }
}
