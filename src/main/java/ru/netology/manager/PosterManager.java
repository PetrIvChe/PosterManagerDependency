package ru.netology.manager;

import lombok.NoArgsConstructor;
import ru.netology.domain.PosterItem;


@NoArgsConstructor


public class PosterManager {

    private PosterItem[] items = new PosterItem[0];
    private int itemsLength = 10;

    public PosterManager(int itemsLength) {
        this.itemsLength = itemsLength;
    }

    // Add a movie to the poster
    public void addMovie(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    // Return 10 movies in reverse order
    public PosterItem[] getFromLastAddedMovie() {

        int resultLength;
        if (items.length > itemsLength) {
            resultLength = itemsLength;
        } else {
            resultLength = items.length;
        }

        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}




