package DB;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Muscle {
    @PrimaryKey
    private int id;
    private String name;

    public Muscle(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
