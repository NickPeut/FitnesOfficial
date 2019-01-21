package DB;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import APIParse.Exercise;

@Dao
public interface DaoMuscle {

    @Query("SELECT * FROM muscle")
    List<Muscle> getAllMuscles();

    @Insert
    void insertAllMuscles(Muscle muscle);

    @Delete
    void deleteMuscles(Muscle muscle);
}
