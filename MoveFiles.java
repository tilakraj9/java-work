import java.io.IOException;
import java.nio.file.*;

public class MoveFiles {
    public static void main(String[] args) {
        // Define source and destination folder paths
        String sourceFolder = "C:/data/source";
        String destinationFolder = "C:/data/destination";

        // Convert to Path objects
        Path sourcePath = Paths.get(sourceFolder);
        Path destinationPath = Paths.get(destinationFolder);

        try {
            // 1. Check if source folder exists
            if (!Files.exists(sourcePath) || !Files.isDirectory(sourcePath)) {
                System.out.println("Source folder does not exist!");
                return;
            }

            // 2. If destination folder doesn’t exist, create it
            if (!Files.exists(destinationPath)) {
                Files.createDirectories(destinationPath);
                System.out.println("Destination folder created: " + destinationPath);
            }

            // 3. Move each file from source to destination
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(sourcePath);

            boolean filesFound = false;
            for (Path filePath : directoryStream) {
                if (Files.isRegularFile(filePath)) {
                    Path destFile = destinationPath.resolve(filePath.getFileName());
                    Files.move(filePath, destFile, StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("Moved: " + filePath.getFileName());
                    filesFound = true;
                }
            }

            if (!filesFound) {
                System.out.println("No files found in source folder.");
            } else {
                System.out.println("✅ All files moved successfully!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
