import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.project.movieManager;

import static org.mockito.Mockito.*;

public class MovieManagerTest {

    public void shouldAddNewMovie() {
        movieManager movies = new movieManager();
        movies.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNoneMovie() {
        movieManager movies = new movieManager();

        String[] expected = {};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        movieManager movies = new movieManager();

        movies.addMovie("Бладшот");
        movies.addMovie("Вперед");
        movies.addMovie("Отель Белград");
        movies.addMovie("Джентельмены");
        movies.addMovie("Человек-неведимка");
        movies.addMovie("Тролли. Мировой тур");
        movies.addMovie("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-неведимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllNull() {
        movieManager movies = new movieManager();

        String[] expected = {};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovie() {
        movieManager films = new movieManager();

        films.addMovie("номер один");

        String[] expected = {"номер один"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieIfOverTheLimit() {
        movieManager movies = new movieManager();

        movies.addMovie("Бладшот");
        movies.addMovie("Вперед");
        movies.addMovie("Отель Белград");
        movies.addMovie("Джентельмены");
        movies.addMovie("Человек-неведимка");

        String[] expected = {"Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMovieIfBelowTheLimit() {
        movieManager movies = new movieManager();

        movies.addMovie("Бладшот");
        movies.addMovie("Вперед");
        movies.addMovie("Отель Белград");
        movies.addMovie("Джентельмены");
        movies.addMovie("Человек-неведимка");


        String[] expected = {"Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNoneMovie() {
        movieManager movies = new movieManager();

        String[] expected = {};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}