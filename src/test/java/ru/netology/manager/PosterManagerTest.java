package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PosterManagerTest {

    PosterItem bladshot = new PosterItem(305610, 3056, "bladshot");
    PosterItem forvard = new PosterItem(305611, 3057, "forvard");
    PosterItem hotelBelgrad = new PosterItem(305612, 3058, "hotelBelgrad");
    PosterItem gentlemen = new PosterItem(305613, 3059, "gentlemen");
    PosterItem invisibleMan = new PosterItem(305614, 3060, "invisibleMan");
    PosterItem trollsWorldTour = new PosterItem(305615, 3061, "trollsWorldTour");
    PosterItem numberOne = new PosterItem(305616, 3062, "numberOne");
    PosterItem invisibleMan2 = new PosterItem(305617, 3063, "invisibleMan2");
    PosterItem trollsWorldTour2 = new PosterItem(305618, 3064, "trollsWorldTour2");
    PosterItem numberOne2 = new PosterItem(305619, 3065, "numberOne2");
    PosterItem gentlemen2 = new PosterItem(305620, 3066, "gentlemen2");


    @Test
    public void shouldAdd1MovieOnPoster() {
        PosterManager manager = new PosterManager();
        manager.addMovie(bladshot);
        PosterItem[] actual = manager.getItems();
        PosterItem[] expected = new PosterItem[]{bladshot};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldAdd5MovieOnPoster() {
        PosterManager manager = new PosterManager();
        manager.addMovie(bladshot);
        manager.addMovie(forvard);
        manager.addMovie(hotelBelgrad);
        manager.addMovie(gentlemen);
        manager.addMovie(invisibleMan);
        PosterItem[] actual = manager.getFromLastAddedMovie();
        PosterItem[] expected = new PosterItem[]{invisibleMan, gentlemen, hotelBelgrad, forvard, bladshot};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldAddRevere10MovieOnPoster() {
        PosterManager manager = new PosterManager();
        manager.addMovie(bladshot);
        manager.addMovie(forvard);
        manager.addMovie(hotelBelgrad);
        manager.addMovie(gentlemen);
        manager.addMovie(invisibleMan);
        manager.addMovie(trollsWorldTour);
        manager.addMovie(numberOne);
        manager.addMovie(invisibleMan2);
        manager.addMovie(trollsWorldTour2);
        manager.addMovie(numberOne2);
        PosterItem[] actual = manager.getFromLastAddedMovie();
        PosterItem[] expected = new PosterItem[]{numberOne2, trollsWorldTour2, invisibleMan2, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrad, forvard, bladshot};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldReturnReverse10MovieFrom11OnPoster() {
        PosterManager manager = new PosterManager();
        manager.addMovie(bladshot);
        manager.addMovie(forvard);
        manager.addMovie(hotelBelgrad);
        manager.addMovie(gentlemen);
        manager.addMovie(invisibleMan);
        manager.addMovie(trollsWorldTour);
        manager.addMovie(numberOne);
        manager.addMovie(invisibleMan2);
        manager.addMovie(trollsWorldTour2);
        manager.addMovie(numberOne2);
        manager.addMovie(gentlemen2);
        PosterItem[] actual = manager.getFromLastAddedMovie();
        PosterItem[] expected = new PosterItem[]{gentlemen2, numberOne2, trollsWorldTour2, invisibleMan2, numberOne, trollsWorldTour, invisibleMan, gentlemen, hotelBelgrad, forvard };
        assertArrayEquals(actual, expected);

    }
}