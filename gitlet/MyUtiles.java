package gitlet;

import java.io.File;

public class MyUtiles {

    /*
     * Create a directory from the File object.
     *
     * @param dir Directory File instance
     */
    public static void mkdir(File dir) {
        if (!dir.mkdir()) {
            throw new IllegalArgumentException(String.format("mkdir: %s: Failed to create.", dir.getPath()));
        }
    }

    public static boolean deleteFile(File file) {
        if (!file.isDirectory()) {
            if (file.exists()) {
                return file.delete();
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
