import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.project.MovieManager;

import static org.mockito.Mockito.*;

public class MovieManagerTest {

    @Test
    public void shouldAddNewMovie() {
        MovieManager movies = new MovieManager();
        movies.addMovie("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNoneMovie() {
        MovieManager movies = new MovieManager();

        String[] expected = {};
        String[] actual = movies.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMovies() {
        MovieManager movies = new MovieManager();

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
    public void shouldFindLastMovie() {
        MovieManager films = new MovieManager();

        films.addMovie("номер один");

        String[] expected = {"номер один"};
        String[] actual = films.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMoviesWhenMoreThanFiveAdded() {
        MovieManager movies = new MovieManager();

        movies.addMovie("Бладшот");
        movies.addMovie("Вперед");
        movies.addMovie("Отель Белград");
        movies.addMovie("Джентельмены");
        movies.addMovie("Человек-неведимка");
        movies.addMovie("Номер один");

        String[] expected = {"Номер один", "Человек-неведимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllMoviesWhenLessThanFiveAdded() {
        MovieManager movies = new MovieManager();

        movies.addMovie("Бладшот");
        movies.addMovie("Вперед");
        movies.addMovie("Отель Белград");
        movies.addMovie("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = movies.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}