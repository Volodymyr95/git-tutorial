import keys.Key;

import java.io.File;

public class CeaserCypher {

    public void encode(String fileName, Key key) {
        key.encode(new File(fileName));
    }

    public void decode(String fileName) {

    }

}
