package DB;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Muscle.class}, version = 2)
public abstract class DataBaseMuscles extends RoomDatabase {
    public abstract DaoMuscle daoMuscle();
}