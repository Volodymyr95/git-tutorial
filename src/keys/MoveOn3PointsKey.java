package keys;

import java.io.File;

public class MoveOn3PointsKey extends Key {

    @Override
    public String encode(File file) {
        moveLetter("", 3);

        return super.encode(file);
    }
}
